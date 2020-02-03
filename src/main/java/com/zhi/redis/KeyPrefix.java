package com.zhi.redis;

/**
 * @author WenZhi Luo
 * @version 1.0
 * @date 2020/2/3 16:56
 */
public interface KeyPrefix {
    int expireSeconds();
    String getPrefix();
}
