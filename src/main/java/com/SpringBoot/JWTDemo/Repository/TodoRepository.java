package com.SpringBoot.JWTDemo.Repository;

import com.SpringBoot.JWTDemo.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer>
{
}

