/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.domain;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Student {

    public static final int SEX_MALE = 0;
    public static final int SEX_FEMALE = 1;
    private String id;
    private String fullname;
    private int sex;
    private Date birthDay;
    private String address;
    private String fullnameFather;
    private String fullnameMother;
    private String phonenumberFamily;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public boolean isMale() {
        return this.sex == SEX_MALE;
    }

    public boolean isFemale() {
        return this.sex == SEX_FEMALE;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullnameFather() {
        return fullnameFather;
    }

    public void setFullnameFather(String fullnameFather) {
        this.fullnameFather = fullnameFather;
    }

    public String getFullnameMother() {
        return fullnameMother;
    }

    public void setFullnameMother(String fullnameMother) {
        this.fullnameMother = fullnameMother;
    }

    public String getPhonenumberFamily() {
        return phonenumberFamily;
    }

    public void setPhonenumberFamily(String phonenumberFamily) {
        this.phonenumberFamily = phonenumberFamily;
    }

}
