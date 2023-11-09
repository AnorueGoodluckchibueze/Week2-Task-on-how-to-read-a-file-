package org.example.school.ServiceImpl;

import org.example.school.Courses;
import org.example.school.Service.SchoolService;
import org.example.school.Student;
import org.example.school.entities.NonAcademicStaff;
import org.example.school.entities.Teachers;
import org.example.school.entities.ViceChancellor;

import java.time.LocalDateTime;
import java.util.*;


 public class SchoolServiceImpl  implements SchoolService {
    public static List<Student> admittedStudents =  new ArrayList<>();

    public List<Student> studentTaughtToday = new ArrayList<>();
    public static HashMap<Student, List<Courses>> electedCourses = new HashMap<>();
    public static HashMap<LocalDateTime, Courses> courseRegister = new HashMap<>();

    @Override
    public Student admit(Student student, ViceChancellor viceChancellor) {

           if(student.getAge()<15){
               System.out.println("You are not eligible for admission");
           }
               else {
                   System.out.println("You have been offered admission");
               }

        // I add students to the list of admitted students
        admittedStudents.add(student);
        //return Student instead of ViceChancellor
        return student;
    }

    @Override
    public Student expel(Student student, ViceChancellor viceChancellor) {
        // I first return the expelled student not the vicechancellor
        //I remove student from the list of admitted student and return expelled student
        admittedStudents.remove(student);
        //Note: changing your return type means changing the interface method's return type as well
        return student;
    }

    @Override
    public Courses teach(Student student, Teachers teachers, Courses courses) {
        //Teachers could register courses taught today
        //Steps 1:I adds students taught
        studentTaughtToday.add(student);
        //Step 2:I add/register courses taught with their time and date of teaching them in the course register
        courseRegister.put(LocalDateTime.parse("2023-10-25T11:38:23.788"), courses);
        //Note: LocalDateTime.parse("2023-12-25T12:32:23.788") is format for  parsing string to localdataTime
        //Step 3: return a list of taught course... it should be courseRegister.getValues()
        return courseRegister.get(courses);
    }

    @Override
    public HashMap<Student, List<Courses>> take(Student student, Courses courses) {
        //Step 1:I add student and course to the electedCourses to simulate courses that a student wishes to take
        electedCourses.put(student, (List<Courses>) electedCourses);
        //Step 2:  I return the hash map of electedCourses
        return electedCourses;
    }





}
