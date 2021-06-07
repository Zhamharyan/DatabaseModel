package controller.model;

import exceptions.*;
import service.MovieService;
import service.model.Director;

public class MovieRequest {

    private String title;
    private String description;
    private double rating;
    private int directorId;

    public MovieRequest createMovieRequest(String title,String description,double rating,int directorId){
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
        int directorIdInetegr;

        if(directorId<0 || directorId>MovieService.getDirectors().size()){
            throw new InvalidDirectorId();
        }
        movieRequest.directorId = directorId;
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
        if(title.length()<2){
            throw new TitleException();
        }
        this.title = title;
    }

    public void setDescription(String description) {
        if(description.length()<4){
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

    public int getDirectorId() {
        return directorId;
    }
    public void setDirectorId(String id){
        int directorIdInteger;

        try{
            directorIdInteger = Integer.parseInt(id);
        }
        catch (NumberFormatException ex){
            throw new DirectorIdToInetger();
        }
        if(directorIdInteger<0 || directorIdInteger>MovieService.getDirectors().size()){
            throw new InvalidDirectorId();
        }
        this.directorId = directorIdInteger;
    }
}
