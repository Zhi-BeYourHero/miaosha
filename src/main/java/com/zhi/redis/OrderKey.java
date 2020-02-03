package com.zhi.redis;

/**
 * @author WenZhi Luo
 * @version 1.0
 * @date 2020/2/3 17:06
 */
public class OrderKey extends BasePrefix {
    public OrderKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
}
