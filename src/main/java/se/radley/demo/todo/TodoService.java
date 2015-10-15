package se.radley.demo.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository repository;

    @Autowired
    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> findAll() {
        return repository.findAll();
    }
}
