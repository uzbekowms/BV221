package edu.itstep.exceptionsgenerics.exceptions.exception;

public class NoSuchTacksException extends RuntimeException {

    public NoSuchTacksException() {
    }

    public NoSuchTacksException(String message) {
        super(message);
    }

    public NoSuchTacksException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchTacksException(Throwable cause) {
        super(cause);
    }

    public NoSuchTacksException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
