package com.abn.selcucumber.exception;



/**
 * Created by aswathyn on 07/01/17.
 */
public class IFrameNotFoundException extends GenericException {

    public IFrameNotFoundException() {
    }

    public IFrameNotFoundException(String message) {
        super(message);
    }

    public IFrameNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public IFrameNotFoundException(Throwable cause) {
        super(cause);
    }
}
