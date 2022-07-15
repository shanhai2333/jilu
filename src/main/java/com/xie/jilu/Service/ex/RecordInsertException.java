package com.xie.jilu.Service.ex;

/**
 * @author 桃缘十三
 * @date 2022/7/7 21:44
 */
public class RecordInsertException extends ServiceException{
    public RecordInsertException() {
        super();
    }

    public RecordInsertException(String message) {
        super(message);
    }

    public RecordInsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecordInsertException(Throwable cause) {
        super(cause);
    }

    protected RecordInsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
