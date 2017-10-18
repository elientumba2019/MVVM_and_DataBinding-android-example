package com.example.ntumba.mvvm_databinding.model;

import java.util.UUID;

/**
 * Created by ntumba on 17-10-15.
 */

public class Person {


    private UUID id;
    private int avatar;
    private String firstname;
    private String lastname;
    private int sex;



    public Person(){
        this.id = UUID.randomUUID();
    }


    public Person(int avatar, String firstname, String lastname) {
        this.avatar = avatar;
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = UUID.randomUUID();
    }


    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
