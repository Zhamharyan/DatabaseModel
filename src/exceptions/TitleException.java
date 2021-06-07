package exceptions;

public class TitleException extends InvalidTypeException{
    @Override
    public String getMessage() {
        return "The Title must be large 2";
    }
}
