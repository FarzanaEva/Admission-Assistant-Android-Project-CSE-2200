package com.example.user.admissionassistant;

/**
 * Created by Hasib on 2/3/2017.
 */

public class University {
    private int id;
    private String UNIVERSITY_NAME;
    private int NUMBER_OF_COURSES;
    private String ABOUT;
    private String SCHOLARSHIP;
    private String HOSTEL_FACILITIES;
    private String ADDRESS;
    private String EMAIL;
    private String MOBILE;
    private String WEBSITE;

    public University(String UNIVERSITY_NAME, int NUMBER_OF_COURSES,  String ABOUT,
                      String SCHOLARSHIP, String HOSTEL_FACILITIES, String ADDRESS, String EMAIL, String MOBILE, String WEBSITE) {
        this.UNIVERSITY_NAME = UNIVERSITY_NAME;
        this.NUMBER_OF_COURSES = NUMBER_OF_COURSES;
        this.ABOUT = ABOUT;
        this.SCHOLARSHIP = SCHOLARSHIP;
        this.HOSTEL_FACILITIES = HOSTEL_FACILITIES;
        this.ADDRESS = ADDRESS;
        this.EMAIL = EMAIL;
        this.MOBILE = MOBILE;
        this.WEBSITE = WEBSITE;
    }

    public University(int id, String UNIVERSITY_NAME, int NUMBER_OF_COURSES, String ABOUT,
                      String SCHOLARSHIP, String HOSTEL_FACILITIES, String ADDRESS, String EMAIL, String MOBILE, String WEBSITE) {
        this.id = id;
        this.UNIVERSITY_NAME = UNIVERSITY_NAME;
        this.NUMBER_OF_COURSES = NUMBER_OF_COURSES;
        this.ABOUT = ABOUT;
        this.SCHOLARSHIP = SCHOLARSHIP;
        this.HOSTEL_FACILITIES = HOSTEL_FACILITIES;
        this.ADDRESS = ADDRESS;
        this.EMAIL = EMAIL;
        this.MOBILE = MOBILE;
        this.WEBSITE = WEBSITE;
    }


    public int getId() {
        return id;
    }
    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getWEBSITE() {
        return WEBSITE;
    }

    public void setWEBSITE(String WEBSITE) {
        this.WEBSITE = WEBSITE;
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

    public int getNUMBER_OF_COURSES() {
        return NUMBER_OF_COURSES;
    }

    public void setNUMBER_OF_COURSES(int NUMBER_OF_COURSES) {
        this.NUMBER_OF_COURSES = NUMBER_OF_COURSES;
    }

    public String getABOUT() {
        return ABOUT;
    }

    public void setABOUT(String ABOUT) {
        this.ABOUT = ABOUT;
    }

    public String getSCHOLARSHIP() {
        return SCHOLARSHIP;
    }

    public void setSCHOLARSHIP(String SCHOLARSHIP) {
        this.SCHOLARSHIP = SCHOLARSHIP;
    }

    public String getHOSTEL_FACILITIES() {
        return HOSTEL_FACILITIES;
    }

    public void setHOSTEL_FACILITIES(String HOSTEL_FACILITIES) {
        this.HOSTEL_FACILITIES = HOSTEL_FACILITIES;
    }


}
