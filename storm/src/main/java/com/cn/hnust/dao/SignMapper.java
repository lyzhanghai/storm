package com.cn.hnust.dao;

import com.cn.hnust.pojo.Sign;


public interface SignMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign
     *
     * @mbggenerated
     */
    int insert(Sign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign
     *
     * @mbggenerated
     */
    int insertSelective(Sign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign
     *
     * @mbggenerated
     */
    Sign selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Sign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Sign record);
}