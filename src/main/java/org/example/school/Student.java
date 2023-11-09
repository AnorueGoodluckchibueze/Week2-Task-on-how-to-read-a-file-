package org.example.school;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.school.enums.Role;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student extends User {
    private String studentRegistrationNo;
    private String DegreeProgram;
    private int yearLevel;
    private String entryType;
    private String studentIdNo;
    private String guardianEmail1;
    private String guardianEmail2;
    private int grades;


  // metod declaration
    public static List<Student> readExcel(String pathname, String sheetName) {
       // array list of student object
        List<Student> student = new ArrayList<>();
        // try a (risky task) create a buffered reader that reads from file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathname))) {
          //  string variable declearation
            String read;
            // boolean variable declearation
            boolean firstline = true;
            // loop initiation, reads line from file until no more lines to read
            while ((read = bufferedReader.readLine()) != null) {
                // check if the firstline is true
                if (firstline) {
                    // set firstline to false so other lines wont be skipped
                firstline = false;
                // skips the current iteration move to the next line also ignores the first line
                continue;
            }
                // split the aline after reading into an array
                String[] std = read.split(",");
                // iterates through the elements of the student array
                for (int i = 0; i< std.length; i++){
                    //check if the element is blank
                    if(std[i].isBlank()){
                        // set the element to null
                        std[i]=null;
                    }
                }
                // if the length is 7 a new student object is created and populatedwith data from the student array
                // then add to student listand print
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
            // handles exception of type IO exception
        }catch (IOException e){
            //print the exception stack trace.
            e.printStackTrace();
        }
        return student;
    }

}