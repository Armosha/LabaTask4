package by.training.notebook.command.exception;


public class CommandException extends Exception {

    public CommandException(String message){
        super(message);
    }

    public CommandException(String message, Throwable cause){
        super(message, cause);
    }

}