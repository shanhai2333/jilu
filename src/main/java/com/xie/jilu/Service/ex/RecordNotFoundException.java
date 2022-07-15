package com.xie.jilu.Service.ex;

/**
 * @author 桃缘十三
 * @date 2022/7/7 21:43
 */
public class RecordNotFoundException extends ServiceException{
    public RecordNotFoundException() {
        super();
    }

    public RecordNotFoundException(String message) {
        super(message);
    }

    public RecordNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecordNotFoundException(Throwable cause) {
        super(cause);
    }

    protected RecordNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
