package com.SpringBoot.JWTDemo.Controller;

import com.SpringBoot.JWTDemo.Model.Todo;
import com.SpringBoot.JWTDemo.Service.TodoService;
import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String welcome(){
        return "<html><body>" +
                "<h1>WELCOME</h1>" +
                "</body></html>";
    }

    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @PostMapping("/todos")
    public Todo save(@NotNull @RequestBody Todo todo){
        return  todoService.saveTodos(todo);
    }

}
