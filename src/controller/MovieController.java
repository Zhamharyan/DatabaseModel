package controller;

import exceptions.IncorrectCommandType;
import exceptions.InvalidIdNumber;
import service.MovieService;
import controller.model.MovieRequest;
import service.model.Movie;

import java.util.*;

public class MovieController {

    public static void start(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Create - 1");
        System.out.println("ReadAll - 2");
        System.out.println("ReadById - 3");
        System.out.println("UpdateById - 4");
        System.out.println("DeleteAll - 5");
        System.out.println("DeleteById - 6");
        String response = scanner.nextLine();
        if(response.equals("1")){
            System.out.println("Input Movie Title");
            String title = scanner.nextLine();
            System.out.println("Input Movie Description");
            String description = scanner.nextLine();
            int rating = 5;
            create(title,description,rating);
            System.out.println("The film was successfully added to database");
        }
        else if(response.equals("2")){
            readAll();
        }
        else if(response.equals("3")){
            readById();
        }
        else if(response.equals("4")){
            updateById();
        }
        else if(response.equals("5")){
            deleteAll();
        }
        else if(response.equals("6")){
            deleteById();
        }
        else{
            throw new IncorrectCommandType();
        }

    }
    public static void create(String title,String description,double rating){
        MovieRequest movieRequest = new MovieRequest();
        MovieRequest movieRequestModel = movieRequest.createMovieRequest(title,description,rating);
        MovieService.create(movieRequestModel);
    }
    public static void readAll(){
        MovieService.readAll();
    }
    public static void readById(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Input the id which movie you want");
            String movieId = scanner.nextLine();
            int moviedIdInterger;
            try {
                moviedIdInterger = Integer.parseInt(movieId);
                MovieService.readById(moviedIdInterger);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("The id must be number");
            }
            catch (InvalidIdNumber ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void updateById(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Input the id which movie you want to edit");
            String movieId = scanner.nextLine();
            int movieIdInterger;
            try {
                movieIdInterger = Integer.parseInt(movieId);
                Movie movie = MovieService.checkIndex(movieIdInterger);
                System.out.println("Titile = "+movie.getTitle()+"\nDescription = "+movie.getDescription());
                System.out.println("input new title you want to edit or leave null if you do not want to edit");
                String newTitle = scanner.nextLine();
                System.out.println("input new description you want to edit or leave null if you do not want to edit");
                String newDescription = scanner.nextLine();
                MovieRequest movieRequest = new MovieRequest();
                if(!newTitle.equals("")){
                    movieRequest.setTitle(newTitle);
                }
                else{
                    movieRequest.setTitle(movie.getTitle());
                }
                if(!newDescription.equals("")){
                    movieRequest.setDescription(newDescription);
                }
                else{
                    movieRequest.setTitle(movie.getDescription());
                }
                MovieService.updateById(movieIdInterger,movieRequest);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("The id must be number");
            }
            catch (InvalidIdNumber ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void deleteAll(){
        MovieService.deleteAll();
    }
    public static void deleteById(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Input the id which movie you want to edit");
            String movieId = scanner.nextLine();
            int movieIdInterger;
            try {
                movieIdInterger = Integer.parseInt(movieId);
                MovieService.deleteById(movieIdInterger);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("The id must be number");
            }
            catch (InvalidIdNumber ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
