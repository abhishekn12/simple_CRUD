package com.abhishek.backendbootcamp1.service;

import com.abhishek.backendbootcamp1.Todo;
import com.abhishek.backendbootcamp1.exception.TodoNotFoundException;
import com.abhishek.backendbootcamp1.repository.TodoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo createTodo(Todo todo) {
        todo.setCompleted(false);
        return todoRepository.save(todo);
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id); // Return Optional so Controller can decide what to do
    }

    public Todo updateTodo(Long id, Todo updatedTodo) {
        return todoRepository.findById(id).map(existing -> {
            existing.setTitle(updatedTodo.getTitle());
            existing.setCompleted(updatedTodo.isCompleted());
            return todoRepository.save(existing);
        }).orElseThrow(() -> new TodoNotFoundException("Todo not found with id " + id));
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
