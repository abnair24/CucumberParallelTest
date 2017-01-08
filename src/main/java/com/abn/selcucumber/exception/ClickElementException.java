package com.abn.selcucumber.exception;

/**
 * Created by aswathyn on 07/01/17.
 */
public class ClickElementException extends GenericException {

    public ClickElementException() {
    }

    public ClickElementException(String message) {
        super(message);
    }

    public ClickElementException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClickElementException(Throwable cause) {
        super(cause);
    }
}
