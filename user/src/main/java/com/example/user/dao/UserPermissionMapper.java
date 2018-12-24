package com.example.user.dao;

import com.example.user.model.UserPermission;
import com.example.user.model.UserPermissionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "userPermissionMapper")
public interface UserPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int countByExample(UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int deleteByExample(UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int insert(UserPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int insertSelective(UserPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    List<UserPermission> selectByExample(UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    UserPermission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserPermission record, @Param("example") UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int updateByExample(@Param("record") UserPermission record, @Param("example") UserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int updateByPrimaryKeySelective(UserPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    int updateByPrimaryKey(UserPermission record);

    List<String> getPermissonByRoleId(@Param("ids") List<String> ids);
}