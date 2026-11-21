package com.example.bankprojectdemo.model;

public class Employee {

    int empid;
    String name;
    String dept;
    String email;

    public Employee(int empid, String name, String dept, String email) {
        this.empid = empid;
        this.name = name;
        this.dept = dept;
        this.email = email;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
