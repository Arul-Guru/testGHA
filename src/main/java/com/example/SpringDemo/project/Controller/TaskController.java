package com.example.SpringDemo.project.Controller;

import com.example.SpringDemo.project.Models.Task;
import com.example.SpringDemo.project.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService service;
    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(){
        return new ResponseEntity<>(service.getAllTasks(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        return new ResponseEntity<>(service.create(task),HttpStatus.OK);
    }

    @GetMapping("/msg/{id}")
    public List<Task> sendResponse(@PathVariable int id){
        return service.getUserTasks(id);
    }

}
