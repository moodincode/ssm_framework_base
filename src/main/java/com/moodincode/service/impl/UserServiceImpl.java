package com.moodincode.service.impl;

import com.moodincode.beans.User;
import com.moodincode.mapper.UserMapper;
import com.moodincode.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * createBy: moodincode
 * createDate: 2018/7/25 10:07
 * lastModifyDate: 2018/7/25 10:07
 * description:
 */
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    public UserMapper userMapper;

    public User getUser(int id) {
        return userMapper.getUser(id);
    }

    @Override
    public void add(User user) {
       userMapper.add(user);
    }

    @Override
    public void del(int id) {
        userMapper.del(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }
}
