package com.emp;

public class Employee {

    private int Empid;
    private String name;
    private String designation;
    private int exp;
    private int age;

    public Employee() { }
    public Employee(int Empid, String name, String designation, int exp, int age) {

        this.Empid = Empid;
        this.name = name;
        this.designation = designation;
        this.exp = exp;
        this.age = age;
    }

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Empid=" + Empid +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", exp=" + exp +
                ", age=" + age +
                '}';
    }
}