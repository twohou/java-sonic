package org.github.twohou.sonic;

public class SonicException extends RuntimeException {
    public SonicException() {
    }

    public SonicException(String message) {
        super(message);
    }

    public SonicException(String message, Throwable cause) {
        super(message, cause);
    }

    public SonicException(Throwable cause) {
        super(cause);
    }

    public SonicException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
