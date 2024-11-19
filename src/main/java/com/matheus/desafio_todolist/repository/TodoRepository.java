package com.matheus.desafio_todolist.repository;

import com.matheus.desafio_todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public class TodoRepository extends JpaRepository<Todo, long> {
}
