import java.util.ArrayList;

public class Actor {
    private String actors = String.valueOf(new ArrayList<>());

    public Actor(String actors) {
        this.actors = actors;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = String.valueOf(actors);
    }

    @Override
    public String toString() {
        return  actors + '\'' ;
    }
}

