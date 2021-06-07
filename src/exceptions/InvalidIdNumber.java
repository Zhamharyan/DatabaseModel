package exceptions;

public class InvalidIdNumber extends RuntimeException{
    @Override
    public String getMessage() {
        return "There is not movie in database with such id";
    }
}
