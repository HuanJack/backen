package com.xl.backen.controller;

import com.xl.backen.entity.Users;
import com.xl.backen.handler.BusinessStatus;
import com.xl.backen.handler.Result;
import com.xl.backen.model.UsersModel;
import com.xl.backen.service.PeoplesService;
import com.xl.backen.service.UsersService;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * shiro不做任何拦截的控制器
 */

@RestController
@RequestMapping("/user")
public class UsersController {
	private static Logger log = LoggerFactory.getLogger(UsersController.class);
	@Autowired
	private UsersService usersService;

	@Autowired
	private PeoplesService ps;

	/**
	 * 管理员登录
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Result login(@RequestBody Users user) {
		String mobile = user.getMobile();
		String password = user.getPassword();
		log.info("登录方法: mobile={},password={}", mobile, password);
		Users usersModel = usersService.login(mobile, password);
		usersModel.setPassword("");
		return new Result(BusinessStatus.SUCCESS, usersModel);
	}

	/**
	 * 小程序登录接口
	 */
	@RequestMapping(value = "/loginApp", method = RequestMethod.POST)
	public Result loginApp() {
		return null;
	}

	/**
	 * 退出登录
	 */
	@RequestMapping(value = "/signOut", method = RequestMethod.POST)
	public Result signOut() {
		SecurityUtils.getSubject().logout();
		return new Result(BusinessStatus.SUCCESS);
	}
}
