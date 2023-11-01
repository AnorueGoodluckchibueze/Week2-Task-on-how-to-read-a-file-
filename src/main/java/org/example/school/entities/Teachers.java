package org.example.school.entities;

import org.example.school.Courses;
import org.example.school.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teachers extends User {
    public static List<Teachers> readExcelFile(String filePath, String sheetName) {
        List<Teachers> teachers = new ArrayList<>();
        try (BufferedReader buffReader =new BufferedReader(new FileReader(filePath))){
            String line;
            boolean firstline = true;
            while ((line = buffReader.readLine()) !=null) {
                if (firstline) {
                    firstline = false;
                     continue;
                }
                String[] values = line.split(",",-1);
                for (int i = 0; i< values.length; i++){
                    if(values[i].isBlank()){
                        values[i]=null;
                    }
                }
                if (values.length==4){
                    Teachers teacher = new Teachers();
                    teacher.setTeachersIdNo(values[0]);
                    teacher.setEmail(values[1]);
                    teacher.setFirstName(values[2]);
                    teacher.setLastName(values[3]);
                    teachers.add(teacher);
                    System.out.println("Teacher ID:    "  +  teacher.teachersIdNo + ",       FirstName:      " + teacher.getFirstName()+  " ,     LastName:    " +  teacher.getLastName() +" ,    Email:    " + teacher.getEmail());
                }
            }
        }catch (IOException e) {
            e.printStackTrace();

        }
        return teachers;
    }

    private String academicPosition;
    private Courses courses;
    private String teachersIdNo;

    public void setTeachersIdNo(String teachersIdNo) {
        this.teachersIdNo = teachersIdNo;
    }

    public String getAcademicPosition() {
        return academicPosition;
    }

    public void setAcademicPosition(String academicPosition) {
        this.academicPosition = academicPosition;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public String getTeachersIdNo() {
        return teachersIdNo;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "academicPosition='" + academicPosition + '\'' +
                ", courses=" + courses +
                ", teachersIdNo='" + teachersIdNo + '\'' +
                '}';
    }
}