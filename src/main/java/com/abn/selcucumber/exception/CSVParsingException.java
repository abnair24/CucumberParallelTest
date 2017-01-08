package com.abn.selcucumber.exception;

/**
 * Created by aswathyn on 07/01/17.
 */
public class CSVParsingException extends GenericException {
    public CSVParsingException() {
    }

    public CSVParsingException(String message) {
        super(message);
    }

    public CSVParsingException(String message, Throwable cause) {
        super(message, cause);
    }

    public CSVParsingException(Throwable cause) {
        super(cause);
    }
}
