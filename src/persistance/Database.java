package persistance;

import service.model.Director;
import service.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<Movie> database = new ArrayList<>();
    private static List<Director> directors = new ArrayList<>();

    public void add(Movie movie){
        database.add(movie);
    }
    public List<Movie> getMovies(){
        return database;
    }
    public void setMovies(List<Movie> movieList){
        database = movieList;
    }
    public void addDirectors(){
        Director director = new Director("Valod",45);
        Director director1 = new Director("Rshtun",40);
        Director director2 = new Director("Gexam",34);
        directors.add(director);
        directors.add(director1);
        directors.add(director2);
    }
    public List<Director> getDirectors(){
        return directors;
    }
}
