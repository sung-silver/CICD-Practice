package sopt.org.eighthSeminar.common.exception.exception;
import sopt.org.eighthSeminar.common.exception.error.ErrorType;

public class BadRequestException extends HandleException {
    public BadRequestException(ErrorType errorType) {
        super(errorType);
    }
}
