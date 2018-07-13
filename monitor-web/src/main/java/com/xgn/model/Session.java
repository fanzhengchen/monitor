package com.xgn.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Session {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_session.session_id
     *
     * @mbg.generated
     */
    private Long sessionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_session.app_key
     *
     * @mbg.generated
     */
    private String appKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_session.device_id
     *
     * @mbg.generated
     */
    private String deviceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_session.timestamp
     *
     * @mbg.generated
     */
    private Date timestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_session.sdk_version
     *
     * @mbg.generated
     */
    private String sdkVersion;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_session
     *
     * @mbg.generated
     */
    public Session(Long sessionId, String appKey, String deviceId, Date timestamp, String sdkVersion) {
        this.sessionId = sessionId;
        this.appKey = appKey;
        this.deviceId = deviceId;
        this.timestamp = timestamp;
        this.sdkVersion = sdkVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_session.session_id
     *
     * @return the value of monitor_session.session_id
     *
     * @mbg.generated
     */
    public Long getSessionId() {
        return sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_session.app_key
     *
     * @return the value of monitor_session.app_key
     *
     * @mbg.generated
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_session.device_id
     *
     * @return the value of monitor_session.device_id
     *
     * @mbg.generated
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_session.timestamp
     *
     * @return the value of monitor_session.timestamp
     *
     * @mbg.generated
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_session.sdk_version
     *
     * @return the value of monitor_session.sdk_version
     *
     * @mbg.generated
     */
    public String getSdkVersion() {
        return sdkVersion;
    }
}