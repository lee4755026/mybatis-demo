package com.lairen.dao;

import com.lairen.pojo.User;

/**
 * Created by lee on 16/2/4.
 */
public interface IUserDao {
    public User queryUserById(int id);
    public int insert(User record);
}
