package com.kovanlabs.tasktracker.repository;

import com.kovanlabs.tasktracker.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;



//communicate with the database
public interface TaskRepository extends JpaRepository<Task,Long> { //JpaRepository<Entity, PrimaryKeyType>

    //findBy + EntityFieldName - finds based on the entity
    // eg: List<Task> findByStatus(String status);  to find the status of the task

}