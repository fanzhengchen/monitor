package com.xgn.mapper;

import com.xgn.model.VlyViewEvent;

public interface VlyViewEventMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cly_view_event
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long evenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cly_view_event
     *
     * @mbg.generated
     */
    int insert(VlyViewEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cly_view_event
     *
     * @mbg.generated
     */
    int insertSelective(VlyViewEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cly_view_event
     *
     * @mbg.generated
     */
    VlyViewEvent selectByPrimaryKey(Long evenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cly_view_event
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(VlyViewEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cly_view_event
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(VlyViewEvent record);
}