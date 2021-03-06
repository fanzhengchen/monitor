package com.xgn.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeviceInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_session.session_id
     *
     * @mbg.generated
     */
    private Long sessionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_session.p
     *
     * @mbg.generated
     */
    private String p;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_session.uid
     *
     * @mbg.generated
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_session.ca
     *
     * @mbg.generated
     */
    private String ca;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_session.av
     *
     * @mbg.generated
     */
    private String av;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_session.de
     *
     * @mbg.generated
     */
    private String de;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_session.aav
     *
     * @mbg.generated
     */
    private String aav;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_session.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_session.sav
     *
     * @mbg.generated
     */
    private String sav;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_session
     *
     * @mbg.generated
     */
    public DeviceInfo(Long sessionId, String p, String uid, String ca, String av, String de, String aav, String city, String sav) {
        this.sessionId = sessionId;
        this.p = p;
        this.uid = uid;
        this.ca = ca;
        this.av = av;
        this.de = de;
        this.aav = aav;
        this.city = city;
        this.sav = sav;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_session.session_id
     *
     * @return the value of c_session.session_id
     *
     * @mbg.generated
     */
    public Long getSessionId() {
        return sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_session.p
     *
     * @return the value of c_session.p
     *
     * @mbg.generated
     */
    public String getP() {
        return p;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_session.uid
     *
     * @return the value of c_session.uid
     *
     * @mbg.generated
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_session.ca
     *
     * @return the value of c_session.ca
     *
     * @mbg.generated
     */
    public String getCa() {
        return ca;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_session.av
     *
     * @return the value of c_session.av
     *
     * @mbg.generated
     */
    public String getAv() {
        return av;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_session.de
     *
     * @return the value of c_session.de
     *
     * @mbg.generated
     */
    public String getDe() {
        return de;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_session.aav
     *
     * @return the value of c_session.aav
     *
     * @mbg.generated
     */
    public String getAav() {
        return aav;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_session.city
     *
     * @return the value of c_session.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_session.sav
     *
     * @return the value of c_session.sav
     *
     * @mbg.generated
     */
    public String getSav() {
        return sav;
    }
}