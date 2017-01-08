package com.abn.selcucumber.exception;

/**
 * Created by aswathyn on 07/01/17.
 */
public class ElementNotVisibleInUIException extends GenericException {

    public ElementNotVisibleInUIException() {
    }

    public ElementNotVisibleInUIException(String message) {
        super(message);
    }

    public ElementNotVisibleInUIException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementNotVisibleInUIException(Throwable cause) {
        super(cause);
    }
}
