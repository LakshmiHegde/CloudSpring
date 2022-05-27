package com.example.cloudspring.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer aid;
    @Column(nullable = false,length = 35)
    private String name;
    @Column(nullable = false,length = 50)
    private String email;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private float salary;
    @Column(nullable = false)
    private String phone;


    public Employee(){}

    public Employee(String name, String email, int age, float salary,String phone) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.phone=phone;
    }
    public Employee(int aid,String name, String email, int age, float salary,String phone) {
        this.aid=aid;
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.phone=phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "aid=" + aid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", phone=" + phone +
                '}';
    }
}
