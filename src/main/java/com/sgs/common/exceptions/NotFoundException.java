package com.sgs.common.exceptions;

public class NotFoundException extends Exception{

    public NotFoundException() {
        super("Not found exception");
    }

    public NotFoundException(String s) {
        super(s);
    }

    public NotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public NotFoundException(Throwable throwable) {
        super(throwable);
    }

    public NotFoundException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
