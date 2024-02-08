package com.user.UserAccountData.utility;

import java.time.LocalDateTime;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.user.UserAccountData.exception.UserAccountDataException;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    private static final Log logger = LogFactory.getLog(
        ExceptionControllerAdvice.class
    );

    @Autowired
    private Environment environment;

    @ExceptionHandler(UserAccountDataException.class)
    public ResponseEntity<ErrorInfo> userAccountDataExceptionHandler(
        UserAccountDataException exception
    ) {
        logger.error(exception.getMessage(), exception);

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
        errorInfo.setErrorMessage(
            environment.getProperty(exception.getMessage())
        );
        errorInfo.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorInfo> generalExceptionHandler(
        Exception exception
    ) {
        logger.error(exception.getMessage(), exception);

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorInfo.setErrorMessage(
            environment.getProperty("General.EXCEPTION_MESSAGE")
        );
        errorInfo.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
