package org.example.school;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class User {
    private String name;
    private String firstName;
    private  String lastName;
    private int age;
    private LocalDate DOB;

    private int phoneNumber;
    private String address;
    private char Gender;
    private String NOK;
    private String email;
    private String Department;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String faculty;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public   int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
        Gender = gender;
    }

    public String getNOK() {
        return NOK;
    }

    public void setNOK(String NOK) {
        this.NOK = NOK;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", DOB=" + DOB +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", Gender=" + Gender +
                ", NOK='" + NOK + '\'' +
                ", email='" + email + '\'' +
                ", Department='" + Department + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';

    }

    public User() {
    }
}
