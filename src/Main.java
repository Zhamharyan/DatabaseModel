import controller.MovieController;
import exceptions.InvalidTypeException;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                MovieController.start();
            } catch (InvalidTypeException ex) {
                System.out.println(ex.getMessage());
                System.out.println();
            }
        }
    }
}
