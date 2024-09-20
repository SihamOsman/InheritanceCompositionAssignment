import java.util.ArrayList;

public class Movie extends Media {
    private int length;
    private String description;
    private double grossing;
    private Location location;

    public Movie(String title, String rating, String director, ArrayList<String> cast, int length, String description, double grossing, Location location) {
        super(title, rating, director, cast);
        this.length = length;
        this.description = description;
        this.grossing = grossing;
        this.location = location;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getGrossing() {
        return grossing;
    }

    public void setGrossing(double grossing) {
        this.grossing = grossing;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}