package org.example.school;
import lombok.*;
import org.example.school.enums.Role;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class User {
    private String name;
    private String firstName;
    private  String lastName;
    private int age;
    private LocalDate DOB;
    private Role role;
    private int phoneNumber;
    private String address;
    private char Gender;
    private String NOK;
    private String email;
    private String Department;
    private boolean isTeacher;



    public boolean isTeacher() {
        return isTeacher;
    }
}
