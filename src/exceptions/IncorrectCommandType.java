package exceptions;

public class IncorrectCommandType extends InvalidTypeException{
    @Override
    public String getMessage() {
        return "Incorrect command type";
    }
}
