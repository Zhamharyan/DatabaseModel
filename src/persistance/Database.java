package persistance;

import service.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<Movie> database = new ArrayList<>();

    public void add(Movie movie){
        database.add(movie);
    }
    public List<Movie> getMovies(){
        return database;
    }
    public void setMovies(List<Movie> movieList){
        database = movieList;
    }
}
