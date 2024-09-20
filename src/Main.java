import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Location location=new Location("NorthAmerica","USA");
        ArrayList<String> cast=new ArrayList<>();
        cast.add("Sam");
        cast.add("Jimmy");
        Media homeAlone =new Media("Home Alone","PG:13","Frank" ,cast);
        Movie seattle = new Movie("Seattle","PG-13","Steve",cast,34,"Action",1000000,location);
        TvShow friends =new TvShow("Friends","PG-13","Megan",cast,55,"Comedy",300000,location,6,134);
        System.out.println(homeAlone.getTitle());
        System.out.println(cast);
        System.out.println(seattle.getDirector());
        System.out.println(seattle.getLocation());
        System.out.println(friends.getEpisodes());
        System.out.println(friends.getRating());
    }
}