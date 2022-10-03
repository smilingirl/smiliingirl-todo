package com.smilingirl.skillup.todo.service;

        import com.smilingirl.skillup.todo.entity.Todo;
        import com.smilingirl.skillup.todo.form.TodoForm;
        import com.smilingirl.skillup.todo.repository.TodoRepository;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Transactional;

        import java.util.List;

/** Todo Service */
@Service
@Transactional
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    public TodoService() {
    }
    /**
     * Todo情報を全件取得する
     *
     * @return Todo情報
     */
    public List<Todo> searchAllTodo() {
        return todoRepository.findAll();
    }

    /**
     * Todo情報を保存する
     *
     * @param todoForm
     */
    public void saveTodo(TodoForm todoForm) {
        todoRepository.save(Todo.of(todoForm));
    }
}
