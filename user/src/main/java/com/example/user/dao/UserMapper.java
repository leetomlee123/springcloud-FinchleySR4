package com.example.user.dao;

import com.example.user.model.User;
import com.example.user.model.UserExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lee
 */
@Repository(value = "userMapper")
public interface UserMapper {
    @Select(value = "select login_name loginName,password, id from user where login_name=#{username} and status=1")
    User findByUser(@Param(value = "username") String username);

    int insertUser(User user);

    @Select(value = "select id from user where email=#{email} limit 1")
    User checkEmail(@Param(value = "email") String email);

    @Select(value = "select id from user where login_name=#{username} limit 1")
    User checkLoginName(@Param(value = "username") String username);

    @Update("update user set status=1 where id=#{id}")
    int active(@Param(value = "id") Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @param record
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int updateByPrimaryKey(User record);
}