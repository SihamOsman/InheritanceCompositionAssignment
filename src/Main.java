import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Steve","Harvey");
        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Matt Damon"));
        actors.add(new Actor("Sofia Roberto"));
        Movie seattle = new Movie("Seattle","PG-13",director,actors,44,"Drama",100000);
        TvShow friends =new TvShow("Friends","PG-13",director, actors,55,"Comedy",300000,6,134);


        System.out.println(seattle.getDirector());
        System.out.println(seattle.getActors());
        System.out.println(friends.getRating());
        System.out.println(friends.getDescription());
    }
}