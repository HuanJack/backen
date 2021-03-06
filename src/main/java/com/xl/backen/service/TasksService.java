package com.xl.backen.service;

import com.github.pagehelper.Page;
import com.xl.backen.entity.Tasks;
import com.xl.backen.model.TasksPageModel;

/**
 * TasksService
 */
public interface TasksService {
  int add(Tasks tasks);

  Page<Tasks> query(TasksPageModel model);

  int update(Tasks tasks);

  Tasks findById(String uuid);
}