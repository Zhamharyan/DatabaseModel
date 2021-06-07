package exceptions;

public class DirectorIdToInetger extends InvalidTypeException{
    @Override
    public String getMessage() {
        return "The directorId must be number";
    }
}
