package org.example.school.entities;

import org.example.school.User;
import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Staff extends User {
    private  String maritalStatus;
    private BigDecimal salary;
    private String Role;
    private int yearsOfExperience;
    private String employeeId;



    public String getMaritalStatus() {
        return maritalStatus;

    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "maritalStatus='" + maritalStatus + '\'' +
                ", salary=" + salary +
                ", Role='" + Role + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
