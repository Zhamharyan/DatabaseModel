package service.model;

import exceptions.DescriptionException;
import exceptions.TitleException;

public class Movie {
    public Movie(){
        count++;
    }
    private static int count;
    private  int id;
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
        if(title.length()<2){
            throw new TitleException();
        }
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        if(description.length()<4){
            throw new DescriptionException();
        }
        this.description = description;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
}
