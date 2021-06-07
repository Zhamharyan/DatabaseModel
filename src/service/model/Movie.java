package service.model;

import exceptions.DescriptionException;
import exceptions.TitleException;

public class Movie {
    public Movie(){
        count++;
    }
    private static int count;
    private  int id;
    private Director director;

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    private String title;
    private String description;
    private double rating;
    public int getId() {
        return id;
    }
    public void setId(){
        id = count;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
}
