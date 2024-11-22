package com.taskmanager.taskapi.service;

import com.taskmanager.taskapi.mapper.TaskMapper;
import com.taskmanager.taskapi.model.Task;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("taskServiceImpl")
public class TaskServiceImpl implements TaskService {

    private final TaskMapper mapper;

    @Autowired
    public TaskServiceImpl(TaskMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Task> findAll() {
        return mapper.findAll();
    }

    @Override
    public int save(Task item) {
        return mapper.save(item);
    }
}
