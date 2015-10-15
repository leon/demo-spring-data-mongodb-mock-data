package se.radley.demo.todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import se.radley.demo.user.User;

@Document
public class Todo {

    @Id
    public String id;

    @DBRef
    public User user;

    public String title;

    public boolean done;

    /**
     * No args constructor for jackson
     */
    private Todo() {}

    /**
     * Factory constructor for creating DbRefs
     * @param id
     */
    private Todo(String id) {
        this.id = id;
    }

    public static Todo ref(String id) {
        return new Todo(id);
    }

    //<editor-fold desc="Getters and Setters">

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    //</editor-fold>
}
