package com.matheus.desafio_todolist.controller;


import com.matheus.desafio_todolist.entity.Todo;
import com.matheus.desafio_todolist.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create(@RequestBody Todo todo) {
       return todoService.create(todo);
    }

    @GetMapping
    List<Todo> list(Todo todo) {
        return todoService.list();
    }

    @PutMapping
    List<Todo> update(Todo todo) {
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable Long id) {
        return todoService.delete(id);
    }
}
