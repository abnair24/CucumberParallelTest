package com.abn.selcucumber.exception;

/**
 * Created by aswathyn on 07/01/17.
 */
public class ClickIconNotFoundException extends GenericException {
    public ClickIconNotFoundException() {
    }

    public ClickIconNotFoundException(String message) {
        super(message);
    }

    public ClickIconNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClickIconNotFoundException(Throwable cause) {
        super(cause);
    }
}
