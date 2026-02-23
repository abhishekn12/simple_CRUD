package com.abhishek.backendbootcamp1.repository;

import com.abhishek.backendbootcamp1.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
