package com.abn.selcucumber.exception;

/**
 * Created by aswathyn on 07/01/17.
 */
public class SearchElementException extends GenericException {

    public SearchElementException() {
    }

    public SearchElementException(String message) {
        super(message);
    }

    public SearchElementException(String message, Throwable cause) {
        super(message, cause);
    }

    public SearchElementException(Throwable cause) {
        super(cause);
    }
}
