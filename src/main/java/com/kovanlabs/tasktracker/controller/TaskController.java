package com.kovanlabs.tasktracker.service;

import com.kovanlabs.tasktracker.model.Task;
import com.kovanlabs.tasktracker.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository repo;

    public Task createTask(Task task){
        return repo.save(task);
    }

    public List<Task> getAllTasks(){
        return repo.findAll();
    }

    public Task getTask(Long id){
        return repo.findById(id).orElse(null);
    }

    public void deleteTask(Long id){
        repo.deleteById(id);
    }
}