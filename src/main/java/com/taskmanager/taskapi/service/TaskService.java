package com.taskmanager.taskapi.service;

import com.taskmanager.taskapi.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();

    int save(Task item);
}
