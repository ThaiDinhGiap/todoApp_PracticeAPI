package com.giaptd.java.todolistapi.repository;

import com.giaptd.java.todolistapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
