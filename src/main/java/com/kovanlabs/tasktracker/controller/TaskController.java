package com.kovanlabs.tasktracker.controller;

import com.kovanlabs.tasktracker.model.Task;
import com.kovanlabs.tasktracker.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    @Autowired
    private TaskService service;


    @PostMapping
    public Task create(@RequestBody Task task){
        logger.info("Creating task");
        return service.createTask(task);
    }


    @GetMapping
    public List<Task> getAll(){
        System.out.println("HIT");
        logger.error("TEST LOG");
        return service.getAllTasks();
    }

//    @GetMapping
//    public List<Task> getAll(){
//        logger.info("Fetching all tasks");
//        return service.getAllTasks();
//    }

    @GetMapping("/{id}")
    public Task get(@PathVariable Long id){
        logger.info("Fetching task {}", id);
        return service.getTask(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        logger.info("Deleting task {}", id);
        service.deleteTask(id);
    }

}