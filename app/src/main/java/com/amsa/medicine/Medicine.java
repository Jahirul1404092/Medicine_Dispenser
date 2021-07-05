package com.amsa.medicine;


public class Medicine {

    private String  morning1_str,morning2_str,morning3_str,noon1_str,noon2_str,noon3_str,night1_str,night2_str,night3_str;

    public Medicine(){

    }

    public Medicine(String morning1,String morning2,String morning3, String noon1,String noon2,String noon3, String night1,String night2,String night3) {
        morning1_str=morning1;
        morning2_str=morning2;
        morning3_str=morning3;
        noon1_str=noon1;
        noon2_str=noon2;
        noon3_str=noon3;
        night1_str=night1;
        night2_str=night2;
        night3_str=night3;
    }

    public String getMorning1_str() {
        return morning1_str;
    }

    public void setMorning1_str(String morning1_str) {
        this.morning1_str = morning1_str;
    }

    public String getMorning2_str() {
        return morning2_str;
    }

    public void setMorning2_str(String morning2_str) {
        this.morning2_str = morning2_str;
    }

    public String getMorning3_str() {
        return morning3_str;
    }

    public void setMorning3_str(String morning3_str) {
        this.morning3_str = morning3_str;
    }

    public String getNoon1_str() {
        return noon1_str;
    }

    public void setNoon1_str(String noon1_str) {
        this.noon1_str = noon1_str;
    }

    public String getNoon2_str() {
        return noon2_str;
    }

    public void setNoon2_str(String noon2_str) {
        this.noon2_str = noon2_str;
    }

    public String getNoon3_str() {
        return noon3_str;
    }

    public void setNoon3_str(String noon3_str) {
        this.noon3_str = noon3_str;
    }

    public String getNight1_str() {
        return night1_str;
    }

    public void setNight1_str(String night1_str) {
        this.night1_str = night1_str;
    }

    public String getNight2_str() {
        return night2_str;
    }

    public void setNight2_str(String night2_str) {
        this.night2_str = night2_str;
    }

    public String getNight3_str() {
        return night3_str;
    }

    public void setNight3_str(String night3_str) {
        this.night3_str = night3_str;
    }
}

