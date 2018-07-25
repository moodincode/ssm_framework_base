package com.moodincode.mapper;

import com.moodincode.beans.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * createBy: moodincode
 * createDate: 2018/7/25 9:46
 * lastModifyDate: 2018/7/25 9:46
 * description:mybatis映射类，方法名等价于映射xml中的insert、update等sql语句的id
 */
public interface UserMapper {
   /*****************此处的方法采用xml映射方式，需要在xml中定义相同名称的查询语句（方法名等于select、insert等的id值）********************/
    void add(User user);
    void del(int id);
    void update(User user);
    User getUser(int id);
    List<User> list();
 /*********************此处的方法采用注解的方式实现，无须xml配置，一般和第一种方式二选一使用，不建议同时使用（个人认为mybatis采用xml配置比较适合，易于修改，维护，此种注解的方式需要重写编译）******************************/
    @Select("select * from t_user where name =#{name}")
    User getUserByName(String name);
}
