package exceptions;

public class InvalidDirectorId extends InvalidTypeException{
    @Override
    public String getMessage() {
        return "There is no director with such id";
    }
}
