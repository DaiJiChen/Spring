package com.sit.jichen.bean;

public class Employer {
    private String name;
    private String gender;

    private Department dept;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public void add() {
        System.out.println(name+"\n"+gender+"\n"+dept.getDeptName());
    }
}
