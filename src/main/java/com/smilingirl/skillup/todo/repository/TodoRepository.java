package com.smilingirl.skillup.todo.repository;

import com.smilingirl.skillup.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** Todo repository */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
}