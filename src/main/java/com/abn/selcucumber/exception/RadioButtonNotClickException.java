package com.abn.selcucumber.exception;



/**
 * Created by aswathyn on 07/01/17.
 */
public class RadioButtonNotClickException extends GenericException {

    public RadioButtonNotClickException() {
    }

    public RadioButtonNotClickException(String message) {
        super(message);
    }

    public RadioButtonNotClickException(String message, Throwable cause) {
        super(message, cause);
    }

    public RadioButtonNotClickException(Throwable cause) {
        super(cause);
    }
}
