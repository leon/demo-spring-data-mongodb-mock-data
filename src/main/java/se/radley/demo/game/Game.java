package se.radley.demo.game;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Game {

    @Id
    private String id;

    private String name;

    /**
     * No args constructor for jackson
     */
    private Game() {}

    /**
     * Factory constructor for creating DbRefs
     * @param id
     */
    private Game(String id) {
        this.id = id;
    }

    public static Game ref(String id) {
        return new Game(id);
    }

    //<editor-fold desc="Getters and Setters">

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //</editor-fold>


}
