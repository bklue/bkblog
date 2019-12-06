package com.tyn.blog.constant;


/**
 * @author lover
 */
public enum LogLevel {
    NO(1),
    BY_NAME(1),
    BY_TYPE(1);

    private final int value;
    LogLevel(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

}
