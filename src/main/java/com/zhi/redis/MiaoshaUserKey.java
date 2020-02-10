package com.zhi.redis;

/**
 * @author WenZhi Luo
 * @version 1.0
 * @date 2020/2/4 20:45
 */
public class MiaoshaUserKey extends BasePrefix {

    public static final int TOKEN_EXPIRE = 3600*24 * 2;

    private MiaoshaUserKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static MiaoshaUserKey token = new MiaoshaUserKey(TOKEN_EXPIRE, "tk");
}
