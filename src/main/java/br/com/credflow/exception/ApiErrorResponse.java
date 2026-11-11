package br.com.credflow.exception;

import java.util.List;

public record ApiErrorResponse(
        int status,
        String message,
        List<String> errors
) {
} 