package com.example.user.admissionassistant;

/**
 * Created by Hasib on 2/4/2017.
 */

public class Course {
    private int id;
    private String UNIVERSITY_NAME;
    private String COURSE_NAME;
    private String SEMESTER;
    private String CREDIT_HOUR;
    private String TUTION_FEES;


    public Course(String UNIVERSITY_NAME, String COURSE_NAME, String SEMESTER, String CREDIT_HOUR, String TUTION_FEES) {
        this.UNIVERSITY_NAME = UNIVERSITY_NAME;
        this.COURSE_NAME = COURSE_NAME;
        this.SEMESTER = SEMESTER;
        this.CREDIT_HOUR = CREDIT_HOUR;
        this.TUTION_FEES = TUTION_FEES;
    }

    public Course(int id, String UNIVERSITY_NAME, String COURSE_NAME, String SEMESTER, String CREDIT_HOUR, String TUTION_FEES) {
        this.id = id;
        this.TUTION_FEES = TUTION_FEES;
        this.CREDIT_HOUR = CREDIT_HOUR;
        this.SEMESTER = SEMESTER;
        this.COURSE_NAME = COURSE_NAME;
        this.UNIVERSITY_NAME = UNIVERSITY_NAME;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUNIVERSITY_NAME() {
        return UNIVERSITY_NAME;
    }

    public void setUNIVERSITY_NAME(String UNIVERSITY_NAME) {
        this.UNIVERSITY_NAME = UNIVERSITY_NAME;
    }

    public String getCOURSE_NAME() {
        return COURSE_NAME;
    }

    public void setCOURSE_NAME(String COURSE_NAME) {
        this.COURSE_NAME = COURSE_NAME;
    }

    public String getSEMESTER() {
        return SEMESTER;
    }

    public void setSEMESTER(String SEMESTER) {
        this.SEMESTER = SEMESTER;
    }

    public String getCREDIT_HOUR() {
        return CREDIT_HOUR;
    }

    public void setCREDIT_HOUR(String CREDIT_HOUR) {
        this.CREDIT_HOUR = CREDIT_HOUR;
    }

    public String getTUTION_FEES() {
        return TUTION_FEES;
    }

    public void setTUTION_FEES(String TUTION_FEES) {
        this.TUTION_FEES = TUTION_FEES;
    }
}
