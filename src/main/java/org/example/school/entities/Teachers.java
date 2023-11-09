package org.example.school.entities;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.school.Courses;
import org.example.school.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Teachers extends Staff {
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
                String[] values = line.split(",");
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

    public boolean isTeacher() {
        return true;
    }
}