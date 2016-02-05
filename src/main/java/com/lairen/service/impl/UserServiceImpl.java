package com.lairen.service.impl;

import com.lairen.dao.IUserDao;
import com.lairen.pojo.User;
import com.lairen.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lee on 16/2/4.
 */
@Service("userService")
public class UserServiceImpl implements IUserService{
    @Resource
    private IUserDao userDao;
    public User getUserById(int id) {
        return userDao.queryUserById(id);
    }

    public int insert(User user){
        return userDao.insert(user);
    }
}
