package com.abhishek.backendbootcamp1;


import com.abhishek.backendbootcamp1.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public Todo createTodo(@Valid @RequestBody Todo todo){
        return todoService.createTodo(todo);
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable Long id){
        todoService.deleteTodo(id);
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id,
                           @RequestBody Todo updatedTodo) {
        return todoService.updateTodo(id, updatedTodo);
    }

}