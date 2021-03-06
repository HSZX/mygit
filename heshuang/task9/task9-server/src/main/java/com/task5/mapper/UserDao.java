package com.task5.mapper;

import com.task5.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    //查询用户登录信息是否匹配
    User checkUser(@Param("userName")String userName,@Param("password")String password)throws Exception;
    //查询用户是否存在
    User findUserByName(String userName)throws Exception;
    //增加用户
    Integer addUser(User user)throws Exception;
    //通过手机号码查找
    User findUserByPhoneNumber(String phoneNumber)throws Exception;
    //通过邮箱查找
    User findUserByEmail(String email)throws Exception;
    //更改用户
    Integer updateUser(User user)throws Exception;

    User findUserById(int id)throws Exception;

//    boolean updateUser(User user);
}
