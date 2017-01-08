package com.abn.selcucumber.exception;

/**
 * Created by aswathyn on 07/01/17.
 */
public class GenericException extends Exception {

    public GenericException() {

    }

    public GenericException(String message) {
        super(message);
    }

    public GenericException(String message, Throwable cause) {

        super(message, cause);
    }

    public GenericException(Throwable cause) {
        super(cause);
    }
}
