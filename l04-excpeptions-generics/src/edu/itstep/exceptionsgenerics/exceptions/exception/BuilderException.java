package edu.itstep.exceptionsgenerics.exceptions.exception;

public class BuilderException extends Exception {
    public BuilderException() {
        super();
    }

    public BuilderException(String message) {
        super(message);
    }

    public BuilderException(String message, Throwable cause) {
        super(message, cause);
    }

    public BuilderException(Throwable cause) {
        super(cause);
    }

    protected BuilderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
