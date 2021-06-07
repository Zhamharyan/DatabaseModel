package service;
import java.util.*;
import exceptions.InvalidIdNumber;
import persistance.Database;
import service.model.Movie;
import controller.model.MovieRequest;

import java.util.List;

public class MovieService {
    public static void create(MovieRequest movieRequest){
        MovieService movieService = new MovieService();
        Movie movie = new Movie();
        movie.setDescription(movieRequest.getDescription());
        movie.setTitle(movieRequest.getTitle());
        movie.setRating(movieRequest.getRating());
        movie.setId();
        System.out.println(movie.getId());
        Database database = new Database();
        database.add(movie);
    }
    public static void readAll(){
        Database database = new Database();
        List<Movie> movieList = database.getMovies();
        for(int i = 0;i<movieList.size();i++){
            System.out.println("Id "+movieList.get(i).getId()+" Title "+movieList.get(i).getTitle());
        }
    }
    public static void readById(int id){
        Movie movie = checkIndex(id);
        System.out.println("Id "+movie.getId()+" Title "+movie.getTitle()+" Description "+movie.getDescription());
    }

    public static void updateById(int id,MovieRequest movieRequest){
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
        Movie movie = checkIndex(id);
        movie.setTitle(movieRequest.getTitle());
        movie.setDescription(movieRequest.getDescription());
    }
    public static void deleteAll(){
        Database database = new Database();
        database.setMovies(new ArrayList<>());
    }

    public static void deleteById(int id){
        Movie movie = checkIndex(id);
        Database database = new Database();
        List<Movie> newMovies = database.getMovies();
        newMovies.remove(newMovies.indexOf(movie));
        database.setMovies(newMovies);
    }
    public static Movie checkIndex(int index){
        Database database = new Database();
        List<Movie> movieList = database.getMovies();
        Movie movie = null;
        boolean isFind = false;
        for(int i = 0;i<movieList.size();i++){
            if(index==movieList.get(i).getId()){
                isFind = true;
                movie = movieList.get(i);
            }
        }
        if(!isFind){
            throw new InvalidIdNumber();
        }
        return movie;
    }
}

