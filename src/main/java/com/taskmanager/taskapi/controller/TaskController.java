package com.taskmanager.taskapi.controller;

import com.taskmanager.taskapi.model.Task;
import com.taskmanager.taskapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.PropertyResolver;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    private final TaskService service;

    @Autowired
    public TaskController(@Qualifier("taskServiceImpl") TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> findAll() {
        return service.findAll();
    }

    @PostMapping
    public int save(@RequestBody Task task) {
        return service.save(task);
    }

}
