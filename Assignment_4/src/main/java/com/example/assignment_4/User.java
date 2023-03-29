package com.example.assignment_4;

public class User {

    private String name;
    private String eMail;
    private String phone;

    public User(String name, String eMail, String phone) {
        this.name = name;
        this.eMail = eMail;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
