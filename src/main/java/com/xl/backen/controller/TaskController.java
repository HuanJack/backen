package com.xl.backen.controller;

import javax.validation.Valid;

import com.github.pagehelper.Page;
import com.xl.backen.entity.Tasks;
import com.xl.backen.handler.BusinessException;
import com.xl.backen.handler.BusinessStatus;
import com.xl.backen.handler.CommonConst;
import com.xl.backen.handler.PageInfo;
import com.xl.backen.handler.Result;
import com.xl.backen.handler.ResultForPage;
import com.xl.backen.model.TasksPageModel;
import com.xl.backen.service.TasksService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
    private static Logger log = LoggerFactory.getLogger(TaskController.class);

    @Autowired
    private TasksService ts;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result<Object> add(@RequestBody @Valid Tasks tasks) {
        log.info("任务新增，参数tasks={}", tasks);
        ts.add(tasks);
        return new Result<>(BusinessStatus.SUCCESS);
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public ResultForPage<Tasks> query(@RequestBody @Valid TasksPageModel model) {
        log.info("任务分页条件查询，参数model={}", model);
        Page<Tasks> tasks = ts.query(model);

        PageInfo<Tasks> info = new PageInfo<>(tasks);

        return new ResultForPage<Tasks>(BusinessStatus.SUCCESS,info);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result<Object> update(@RequestBody @Valid Tasks tasks) {
        log.info("任务修改接口: {}", tasks);
        if(tasks.getStatus() != null) {
            throw new BusinessException(BusinessStatus.DEL_OPEAR_ERROR);
        }
        ts.update(tasks);
        return new Result<>(BusinessStatus.SUCCESS);
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public Result<Object> del(@RequestParam("uuid") String uuid) {
        log.info("任务删除接口: uuid={}", uuid);
        Tasks t = new Tasks();
        t.setUuid(uuid);
        t.setStatus(CommonConst.DEL_STATUS);
        ts.update(t);
        return new Result<>(BusinessStatus.SUCCESS);
    }

    @RequestMapping(value = "/queryOne", method = RequestMethod.GET)
    public Result<Tasks> queryOne(@RequestParam("uuid") String uuid) {
        log.info("查询单个任务,uuid={}", uuid);
        Tasks tasks = ts.findById(uuid);
        return new Result<Tasks>(BusinessStatus.SUCCESS, tasks);
    }
}
