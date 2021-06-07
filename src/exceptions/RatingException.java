package exceptions;

public class RatingException extends InvalidTypeException{
    @Override
    public String getMessage() {
        return "The Film Rating must be big 5";
    }
}
