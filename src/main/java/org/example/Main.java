package org.example;

import org.example.school.Applicant;
import org.example.school.Courses;
import org.example.school.ServiceImpl.SchoolServiceImpl;
import org.example.school.Student;
import org.example.school.entities.Teachers;
import org.example.school.entities.ViceChancellor;

import java.util.List;

import static org.example.school.Student.readExcel;
import static org.example.school.entities.Teachers.readExcelFile;


public class Main {
    public static void main(String[] args) {

        SchoolServiceImpl schoolService = new SchoolServiceImpl();

        ViceChancellor viceChancellor = new ViceChancellor();
        schoolService.admit(new Student(), new ViceChancellor());

           Courses courses= new Courses();
           courses.setCode("csc101");
           courses.setCourseTitle("Introduction to computer science");
        System.out.println("Courses : " + courses.getCode() + " " + courses.getCourseTitle());

            Applicant apply = new Applicant("Wilson College", "2013-07-04", "Osun", "Ife-east", "Physics");
        apply.setStateOfOrigin("Osun ");
         apply.setAge(16);
         apply.setName("Goodluck");
        System.out.println("My name is " + apply.getName());

        System.out.println("__________________________________________STUDENT DATA___________________________________");
        List<Student>student = readExcel("Dataset2.csv", "Student");
        System.out.println(" ______________________________________ TEACHERS DATA_____________________________________");
        List<Teachers> teachers= readExcelFile("Dataset.csv","student ");
        System.out.println("   ");

    }

}