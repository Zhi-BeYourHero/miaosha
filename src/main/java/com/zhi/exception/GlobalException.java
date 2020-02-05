package com.zhi.exception;

import com.zhi.result.CodeMsg;

/**
 * @author WenZhi Luo
 * @version 1.0
 * @date 2020/2/4 17:26
 */
public class GlobalException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private CodeMsg cm;

    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;
    }

    public CodeMsg getCm() {
        return cm;
    }

}
