package org.example.school;

import org.example.school.entities.Teachers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private String studentRegistrationNo;
    private String DegreeProgram;
    private int yearLevel;
    private String entryType;
    private String studentIdNo;
    private String guardianEmail1;
    private String guardianEmail2;
    private int grades;


    public String getGuardianEmail1() {
        return guardianEmail1;
    }

    public void setGuardianEmail1(String guardianEmail1) {
        this.guardianEmail1 = guardianEmail1;
    }

    public String getGuardianEmail2() {
        return guardianEmail2;
    }

    public void setGuardianEmail2(String guardianEmail2) {
        this.guardianEmail2 = guardianEmail2;
    }

    public String getStudentRegistrationNo() {
        return studentRegistrationNo;
    }

    public void setStudentRegistrationNo(String studentRegistrationNo) {
        this.studentRegistrationNo = studentRegistrationNo;
    }

    public String getDegreeProgram() {
        return DegreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        DegreeProgram = degreeProgram;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public String getStudentIdNo() {
        return studentIdNo;
    }

    public void setStudentIdNo(String studentIdNo) {
        this.studentIdNo = studentIdNo;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentRegistrationNo='" + studentRegistrationNo + '\'' +
                ", DegreeProgram='" + DegreeProgram + '\'' +
                ", yearLevel=" + yearLevel +
                ", entryType='" + entryType + '\'' +
                ", studentIdNo='" + studentIdNo + '\'' +
                ", guardianEmail1='" + guardianEmail1 + '\'' +
                ", guardianEmail2='" + guardianEmail2 + '\'' +
                ", grades=" + grades +
                '}';
    }

    public static List<Student> readExcel(String pathname, String sheetName) {
        List<Student> student = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathname))) {
            String read;
            boolean firstline = true;
            while ((read = bufferedReader.readLine()) != null)
            {if (firstline) {
                firstline = false;
                continue;
            }
                String[] std = read.split(",");
                for (int i = 0; i< std.length; i++){
                    if(std[i].isBlank()){
                        std[i]=null;
                    }
                }
                if (std.length == 7) {
                    Student student1 = new Student();
                    student1.setStudentIdNo(std[0].trim());
                    student1.setGrades(Integer.parseInt(std[3].trim()));
                    student1.setFirstName(std[1].trim());
                    student1.setLastName(std[2].trim());
                    student1.setEmail(std[4].trim());
                    student1.setGuardianEmail1(std[5].trim());
                    student1.setGuardianEmail2(std[6].trim());
                    student.add(student1);
                    System.out.println("Student ID:    "  +  student1.getStudentIdNo() + ",       FirstName:      " + student1.getFirstName() +  " ,     LastName:    " +  student1.getLastName() +" ,      GradeLevel:     " +  student1.getGrades() + ",      Email:    " + student1.getEmail() + " , GuardianEmail:    "+ student1.getGuardianEmail1() + " ,      GuardianEmail2:    " + student1.getGuardianEmail2());
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return student;
    }

}