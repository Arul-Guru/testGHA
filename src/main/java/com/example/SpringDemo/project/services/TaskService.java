package com.example.SpringDemo.project.services;


import com.example.SpringDemo.project.Models.Task;
import com.example.SpringDemo.project.dao.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
    public Task create(Task task) {
        taskRepository.save(task);
        return task;
    }

    public List<Task> getUserTasks(int id){
        return taskRepository.findByUserid(id);
    }
}
