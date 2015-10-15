package se.radley.demo.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import se.radley.demo.game.Game;

import java.util.LinkedHashSet;
import java.util.Set;

@Document
public class User {

    @Id
    private String id;

    private String email;

    private String firstName;
    private String lastName;

    @DBRef
    private Set<Game> games = new LinkedHashSet<Game>();

    /**
     * No args constructor for jackson
     */
    private User() {}

    /**
     * Factory constructor for creating DbRefs
     * @param id
     */
    private User(String id) {
        this.id = id;
    }

    public static User ref(String id) {
        return new User(id);
    }

    //<editor-fold desc="Getters and Setters">

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Game> getGames() {
        return games;
    }

    public void setGames(Set<Game> games) {
        this.games = games;
    }

    //</editor-fold>
}
