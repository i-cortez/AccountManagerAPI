package com.user.UserAccountData.utility;

import java.time.LocalDateTime;

public class ErrorInfo {
    private Integer errorCode;
    private String errorMessage;
    private LocalDateTime timeStamp;

    public Integer getErrorCode() {
        return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public LocalDateTime getTimeStamp() {
        return this.timeStamp;
    }
    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
