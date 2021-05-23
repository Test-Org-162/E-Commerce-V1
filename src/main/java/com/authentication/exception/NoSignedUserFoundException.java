package com.authentication.exception;

public class NoSignedUserFoundException extends Exception {
    public NoSignedUserFoundException(String message) {
        super(message);
    }
}
