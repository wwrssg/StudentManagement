package com.ssg.pojo;

/**
 * @author Adminstrator
 */
public class Course {

    private String cNo;
    private String cName;
    private String tNo;

    public String getcNo() {
        return cNo;
    }

    public void setcNo(String cNo) {
        this.cNo = cNo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String gettNo() {
        return tNo;
    }

    public void settNo(String tNo) {
        this.tNo = tNo;
    }

    @Override
    public String toString() {
        return "course{" +
                "cNo='" + cNo + '\'' +
                ", cName='" + cName + '\'' +
                ", tNo='" + tNo + '\'' +
                '}';
    }

}
