package com.xgn.mapper;

import com.xgn.model.Session;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SessionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_session
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long sessionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_session
     *
     * @mbg.generated
     */
    int insert(Session record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_session
     *
     * @mbg.generated
     */
    int insertSelective(Session record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_session
     *
     * @mbg.generated
     */
    Session selectByPrimaryKey(Long sessionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_session
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Session record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_session
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Session record);


    int save(Session record);
}