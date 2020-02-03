package com.zhi.redis;

/**
 * @author WenZhi Luo
 * @version 1.0
 * @date 2020/2/3 17:04
 */
public class UserKey extends BasePrefix {
    public UserKey(String prefix) {
        super(prefix);
    }
    public static UserKey getById = new UserKey("id");
    public static UserKey getByName = new UserKey("name");
}
