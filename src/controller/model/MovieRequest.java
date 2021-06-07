package controller.model;

import exceptions.DescriptionException;
import exceptions.RatingException;
import exceptions.TitleException;

public class MovieRequest {

    private String title;
    private String description;
    private double rating;

    public MovieRequest createMovieRequest(String title,String description,double rating){
        MovieRequest movieRequest = new MovieRequest();
        if(description.length()<4){
            throw new DescriptionException();
        }
        movieRequest.description = description;
        if(title.length()<2){
            throw new TitleException();
        }
        movieRequest.title = title;
        if(rating<5){
            throw new RatingException();
        }
        movieRequest.rating = rating;
        return movieRequest;
    }

    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public double getRating() {
        return rating;
    }

    public void setTitle(String title) {
        if(title.length()<1){
            throw new TitleException();
        }
        this.title = title;
    }

    public void setDescription(String description) {
        if(description.length()<1){
            throw new DescriptionException();
        }
        this.description = description;
    }

    public void setRating(double rating) {
        if(rating<5){
            throw new RatingException();
        }
        this.rating = rating;
    }
}
