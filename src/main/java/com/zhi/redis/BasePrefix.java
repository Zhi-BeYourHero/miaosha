package com.zhi.redis;

/**
 * @author WenZhi Luo
 * @version 1.0
 * @date 2020/2/3 16:57
 */
public abstract class BasePrefix implements KeyPrefix {
    private int expireSeconds;
    private String prefix;

    public BasePrefix(int expireSeconds, String prefix) {
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;
    }

    //默认零秒为永不过期
    public BasePrefix(String prefix){
        this(0,prefix);
    }

    @Override
    public int expireSeconds() {
        return expireSeconds;
    }

    @Override
    public String getPrefix() {
        String className = getClass().getSimpleName();
        return className+":"+prefix;
    }
}
