package com.moodincode.service;

import com.moodincode.beans.User;

import java.util.List;

/**
 * createBy: moodincode
 * createDate: 2018/7/25 10:05
 * lastModifyDate: 2018/7/25 10:05
 * description:
 */
public interface IUserService {
    public void add(User user);

    public void del(int id);

    public void update(User user);

    public User getUser(int id);

    public List<User> list();
    public User getUserByName(String name);

}
