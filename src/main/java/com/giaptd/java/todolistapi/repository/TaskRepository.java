package com.giaptd.java.todolistapi.repository;

import com.giaptd.java.todolistapi.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
