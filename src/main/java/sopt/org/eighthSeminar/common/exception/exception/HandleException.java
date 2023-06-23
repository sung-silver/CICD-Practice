package sopt.org.eighthSeminar.common.exception.exception;

import sopt.org.eighthSeminar.common.exception.error.ErrorType;

public class HandleException extends RuntimeException {
    private final ErrorType errorType;

    public HandleException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public int getHttpStatus() {
        return errorType.getHttpStatusCode();
    }

}
