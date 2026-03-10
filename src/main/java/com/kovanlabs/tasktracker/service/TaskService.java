package com.kovanlabs.tasktracker.service;

import com.kovanlabs.tasktracker.model.Task;
import java.util.List;

public interface TaskService {

    Task createTask(Task task);

    List<Task> getAllTasks();

    Task getTask(Long id);

    void deleteTask(Long id);
}