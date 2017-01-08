package com.abn.selcucumber.exception;

/**
 * Created by aswathyn on 07/01/17.
 */
public class TextElementNotFoundException extends GenericException {

    public TextElementNotFoundException() {
    }

    public TextElementNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TextElementNotFoundException(String message) {
        super(message);
    }

    public TextElementNotFoundException(Throwable cause) {
        super(cause);
    }
}
