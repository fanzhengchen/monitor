package com.xgn.model;

public class VlyViewEvent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cly_view_event.even_id
     *
     * @mbg.generated
     */
    private Long evenId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cly_view_event.visit
     *
     * @mbg.generated
     */
    private Integer visit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cly_view_event.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cly_view_event.start
     *
     * @mbg.generated
     */
    private Integer start;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cly_view_event.segment
     *
     * @mbg.generated
     */
    private String segment;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cly_view_event
     *
     * @mbg.generated
     */
    public VlyViewEvent(Long evenId, Integer visit, String name, Integer start, String segment) {
        this.evenId = evenId;
        this.visit = visit;
        this.name = name;
        this.start = start;
        this.segment = segment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cly_view_event.even_id
     *
     * @return the value of cly_view_event.even_id
     *
     * @mbg.generated
     */
    public Long getEvenId() {
        return evenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cly_view_event.visit
     *
     * @return the value of cly_view_event.visit
     *
     * @mbg.generated
     */
    public Integer getVisit() {
        return visit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cly_view_event.name
     *
     * @return the value of cly_view_event.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cly_view_event.start
     *
     * @return the value of cly_view_event.start
     *
     * @mbg.generated
     */
    public Integer getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cly_view_event.segment
     *
     * @return the value of cly_view_event.segment
     *
     * @mbg.generated
     */
    public String getSegment() {
        return segment;
    }
}