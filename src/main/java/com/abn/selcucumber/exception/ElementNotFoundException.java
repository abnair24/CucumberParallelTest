package com.abn.selcucumber.exception;

/**
 * Created by aswathyn on 07/01/17.
 */
public class ElementNotFoundException extends Exception {

    public ElementNotFoundException() {
    }

    public ElementNotFoundException(String message) {
        super(message);
    }

    public ElementNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementNotFoundException(Throwable cause) {
        super(cause);
    }
}
