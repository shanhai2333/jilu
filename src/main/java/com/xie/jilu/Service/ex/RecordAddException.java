package com.xie.jilu.Service.ex;

/**
 * @author ShanHai
 * @date 2022/7/16 12:59
 */
public class RecordAddException extends ServiceException{
    public RecordAddException() {
        super();
    }

    public RecordAddException(String message) {
        super(message);
    }

    public RecordAddException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecordAddException(Throwable cause) {
        super(cause);
    }

    protected RecordAddException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
