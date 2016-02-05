package com.lairen.service;

import com.lairen.pojo.User;

/**
 * Created by lee on 16/2/4.
 */
public interface IUserService {
    public User getUserById(int id);
    public int insert(User user);
}
