package exceptions;

public class DescriptionException extends InvalidTypeException{
    @Override
    public String getMessage() {
        return "The Description must be large 4";
    }
}
