package com.user.UserAccountData.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.user.UserAccountData.exception.UserAccountDataException;

@Aspect
@Component
public class LoggingAspect {
    private static final Log logger = LogFactory.getLog(LoggingAspect.class);

    @AfterThrowing(
        pointcut = "execution(* com.user.service.*Impl.*(..))",
        throwing = "exception"
    )
    public void logServiceException(UserAccountDataException exception)
    throws Exception {
        logger.error(exception.getMessage(), exception);
    }
}
