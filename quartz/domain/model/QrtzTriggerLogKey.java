package com.sinosoft.platform.quartz.domain.model;

public class QrtzTriggerLogKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGER_LOG.ID
     *
     * @mbggenerated Fri Jul 01 15:39:29 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGER_LOG.TRIGGER_NAME
     *
     * @mbggenerated Fri Jul 01 15:39:29 CST 2016
     */
    private String triggerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRTZ_TRIGER_LOG.JOB_NAME
     *
     * @mbggenerated Fri Jul 01 15:39:29 CST 2016
     */
    private String jobName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGER_LOG.ID
     *
     * @return the value of QRTZ_TRIGER_LOG.ID
     *
     * @mbggenerated Fri Jul 01 15:39:29 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGER_LOG.ID
     *
     * @param id the value for QRTZ_TRIGER_LOG.ID
     *
     * @mbggenerated Fri Jul 01 15:39:29 CST 2016
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGER_LOG.TRIGGER_NAME
     *
     * @return the value of QRTZ_TRIGER_LOG.TRIGGER_NAME
     *
     * @mbggenerated Fri Jul 01 15:39:29 CST 2016
     */
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGER_LOG.TRIGGER_NAME
     *
     * @param triggerName the value for QRTZ_TRIGER_LOG.TRIGGER_NAME
     *
     * @mbggenerated Fri Jul 01 15:39:29 CST 2016
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRTZ_TRIGER_LOG.JOB_NAME
     *
     * @return the value of QRTZ_TRIGER_LOG.JOB_NAME
     *
     * @mbggenerated Fri Jul 01 15:39:29 CST 2016
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRTZ_TRIGER_LOG.JOB_NAME
     *
     * @param jobName the value for QRTZ_TRIGER_LOG.JOB_NAME
     *
     * @mbggenerated Fri Jul 01 15:39:29 CST 2016
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}