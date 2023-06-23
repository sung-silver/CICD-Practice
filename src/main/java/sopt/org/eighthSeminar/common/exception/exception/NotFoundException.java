package sopt.org.eighthSeminar.common.exception.exception;

import sopt.org.eighthSeminar.common.exception.error.ErrorType;

public class NotFoundException extends HandleException {
    public NotFoundException(ErrorType errorType) {
        super(errorType);
    }
}
