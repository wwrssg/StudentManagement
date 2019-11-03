package com.ssg.pojo;

import com.alibaba.fastjson.JSON;

public class Student {
    private String SNO;
    private String SNAME;
    private String SPWD;
    private char SSEX;
    private String SBIRTH;
    private String SCHOOL;
    private String CLASSES;

    public String getSNO() {
        return SNO;
    }

    public void setSNO(String SNO) {
        this.SNO = SNO;
    }

    public String getSNAME() {
        return SNAME;
    }

    public void setSNAME(String SNAME) {
        this.SNAME = SNAME;
    }

    public String getSPWD() {
        return SPWD;
    }

    public void setSPWD(String SPWD) {
        this.SPWD = SPWD;
    }

    public char getSSEX() {
        return SSEX;
    }

    public void setSSEX(char SSEX) {
        this.SSEX = SSEX;
    }

    public String getSBIRTH() {
        return SBIRTH;
    }

    public void setSBIRTH(String SBIRTH) {
        this.SBIRTH = SBIRTH;
    }

    public String getSCHOOL() {
        return SCHOOL;
    }

    public void setSCHOOL(String SCHOOL) {
        this.SCHOOL = SCHOOL;
    }

    public String getCLASSES() {
        return CLASSES;
    }

    public void setCLASSES(String CLASSES) {
        this.CLASSES = CLASSES;
    }

}
