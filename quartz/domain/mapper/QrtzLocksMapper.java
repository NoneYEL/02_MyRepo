package com.sinosoft.platform.quartz.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sinosoft.platform.quartz.domain.model.QrtzLocks;
import com.sinosoft.platform.quartz.domain.model.QrtzLocksExample;

public interface QrtzLocksMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_LOCKS
     *
     * @mbggenerated Mon Jun 06 17:03:54 CST 2016
     */
    int countByExample(QrtzLocksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_LOCKS
     *
     * @mbggenerated Mon Jun 06 17:03:54 CST 2016
     */
    int deleteByExample(QrtzLocksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_LOCKS
     *
     * @mbggenerated Mon Jun 06 17:03:54 CST 2016
     */
    int deleteByPrimaryKey(String lockName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_LOCKS
     *
     * @mbggenerated Mon Jun 06 17:03:54 CST 2016
     */
    int insert(QrtzLocks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_LOCKS
     *
     * @mbggenerated Mon Jun 06 17:03:54 CST 2016
     */
    int insertSelective(QrtzLocks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_LOCKS
     *
     * @mbggenerated Mon Jun 06 17:03:54 CST 2016
     */
    List<QrtzLocks> selectByExample(QrtzLocksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_LOCKS
     *
     * @mbggenerated Mon Jun 06 17:03:54 CST 2016
     */
    int updateByExampleSelective(@Param("record") QrtzLocks record, @Param("example") QrtzLocksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QRTZ_LOCKS
     *
     * @mbggenerated Mon Jun 06 17:03:54 CST 2016
     */
    int updateByExample(@Param("record") QrtzLocks record, @Param("example") QrtzLocksExample example);
}