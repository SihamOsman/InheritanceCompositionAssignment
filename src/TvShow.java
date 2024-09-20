import java.util.ArrayList;

public class TvShow extends Movie {
    private int seasons;
    private int episodes;

    public TvShow(String title, String rating, String director, ArrayList<String> cast, int length, String description, double grossing, Location location, int seasons, int episodes) {
        super(title, rating, director, cast, length, description, grossing, location);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
