package com.xgn.model;

public class EndSession {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column end_session.session_id
     *
     * @mbg.generated
     */
    private Long sessionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column end_session.session_duration
     *
     * @mbg.generated
     */
    private String sessionDuration;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table end_session
     *
     * @mbg.generated
     */
    public EndSession(Long sessionId, String sessionDuration) {
        this.sessionId = sessionId;
        this.sessionDuration = sessionDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column end_session.session_id
     *
     * @return the value of end_session.session_id
     *
     * @mbg.generated
     */
    public Long getSessionId() {
        return sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column end_session.session_duration
     *
     * @return the value of end_session.session_duration
     *
     * @mbg.generated
     */
    public String getSessionDuration() {
        return sessionDuration;
    }
}