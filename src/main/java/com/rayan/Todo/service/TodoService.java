package com.rayan.Todo.service;

import com.rayan.Todo.domain.Todo;
import com.rayan.Todo.repositorie.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    // CREATE
    public List<Todo> create(Todo todo) {
        repository.save(todo);
        return readAll();
    }

    // READ
    public List<Todo> readAll() {
        Sort sort = Sort.by("priority").descending().and(Sort.by("name").ascending());
        return repository.findAll(sort);
    }

    // UPDATE
    public List<Todo> update(Todo todoUpdated) {
        repository.save(todoUpdated);
        return readAll();
    }

    // DELETE
    public List<Todo> delete(Long id) {
        repository.deleteById(id);
        return readAll();
    }

}
