package com.rayan.Todo.resource;

import com.rayan.Todo.domain.Todo;
import com.rayan.Todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoResource {

    @Autowired
    private TodoService service;

    @PostMapping
    public List<Todo> create(@RequestBody Todo todo) {
     return service.create(todo);
    }

    @GetMapping
    public List<Todo> readAll() {
        return service.readAll();
    }

    @PutMapping
    public List<Todo> update(@RequestBody Todo todo) {
        return service.update(todo);
    }

    @DeleteMapping("/{id}")
    public List<Todo> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
