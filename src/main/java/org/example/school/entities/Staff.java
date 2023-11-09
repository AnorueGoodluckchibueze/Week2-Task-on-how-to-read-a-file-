package org.example.school.entities;
import lombok.Data;
import org.example.school.User;
import java.math.BigDecimal;
import java.time.LocalDate;
@Data
public abstract class Staff extends User {
    private  String maritalStatus;
    private BigDecimal salary;
    private int yearsOfExperience;
    private String employeeId;


}
