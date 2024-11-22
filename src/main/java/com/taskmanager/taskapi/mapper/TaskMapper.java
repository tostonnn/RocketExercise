package com.taskmanager.taskapi.mapper;

import com.taskmanager.taskapi.model.Task;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TaskMapper {
    @Select("SELECT name, description, start_date FROM Tasks")
    List<Task> findAll();


    @Insert("INSERT INTO Tasks(name, description, start_date) VALUES (#{name}, #{description}, #{start_date})")
    int save(Task item);
}
