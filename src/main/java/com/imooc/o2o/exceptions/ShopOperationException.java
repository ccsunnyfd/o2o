package com.imooc.o2o.exceptions;

import java.io.Serializable;

/**
 * Process
 *
 * @version 1.0
 */
public class ShopOperationException extends RuntimeException {
    private static final long serialVersionUID = 2361446884822298905L;

    public ShopOperationException(String msg) {
        super(msg);
    }
}
