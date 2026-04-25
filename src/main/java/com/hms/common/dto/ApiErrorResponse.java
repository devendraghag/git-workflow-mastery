package com.hms.common.dto;

import java.time.Instant;
import java.util.List;

public class ApiErrorResponse {
    private final Instant timestamp = Instant.now();
    private final int status;
    private final String message;
    private final List<String> errors;

    public ApiErrorResponse(int status, String message, List<String> errors) {
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public Instant getTimestamp() { return timestamp; }
    public int getStatus() { return status; }
    public String getMessage() { return message; }
    public List<String> getErrors() { return errors; }
}
