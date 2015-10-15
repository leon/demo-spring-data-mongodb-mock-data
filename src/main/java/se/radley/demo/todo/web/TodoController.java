package se.radley.demo.todo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.radley.demo.todo.Todo;
import se.radley.demo.todo.TodoService;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping("/todos")
    public List<Todo> todos() {
        return todoService.findAll();
    }
}
