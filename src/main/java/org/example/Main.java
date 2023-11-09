package org.example;

import org.example.school.Applicant;
import org.example.school.Courses;
import org.example.school.DTOs.UserDto;
import org.example.school.Service.LibraryService;
import org.example.school.ServiceImpl.LibraryServiceImpl;
import org.example.school.ServiceImpl.SchoolServiceImpl;
import org.example.school.Student;
import org.example.school.User;
import org.example.school.entities.Books;
import org.example.school.entities.Teachers;
import org.example.school.entities.UserComparator;
import org.example.school.entities.ViceChancellor;
import org.example.school.enums.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicReference;

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


        Teachers teachers1 = new Teachers();
        teachers1.setEmail("anoruehappiness@hotmail.com");
        teachers1.setRole(Role.TEACHER);

        Teachers teachers2 = new Teachers();
        teachers2.setEmail("charlesdicken@hotmail.com");
        teachers2.setRole(Role.TEACHER);

        Student student1 = new Student();
        student1.setEmail(" notok@gmail.com");
        student1.setRole(Role.SENIOR);
        Student student2 = new Student();
        student1.setEmail("anoyoyo@hotmail.com");
        student1.setRole(Role.SENIOR);
        Student student3 = new Student();
        student1.setEmail("daro@yahoomail.com");
        student1.setRole(Role.SENIOR);
        Student student4 = new Student();
        student1.setEmail("loftuscheek@gmail.com");
        student1.setRole(Role.JUNIOR);

        Books book1 = Books.builder()
                .author("J. K. Rowling")
                .title("Harry Potter")
                .build();
        Books book2 = Books.builder()
                .author("George R.R. martin")
                .title("A Game Of Thrones")
                .build();
        Books book3 = Books.builder()
                .author("Anorue Goodluck")
                .title("JAVA your way to success")
                .build();

        UserDto userDto1 = new UserDto(student1,book2);
        UserDto userDto2 = new UserDto(student2,book2);
        UserDto userDto3 = new UserDto(teachers2,book2);
        UserDto userDto4 = new UserDto(teachers1,book2);
        UserDto userDto5= new UserDto(student4,book2);
        UserDto userDto6 = new UserDto(student3,book2);

        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        libraryService.addUserTOComparatorQueue(student1,userDto1);
        libraryService.addUserTOComparatorQueue(student2,userDto2);
        libraryService.addUserToQueue(teachers2,userDto3);
        libraryService.addUserTOComparatorQueue(teachers1,userDto4);
        libraryService.addUserTOComparatorQueue(student4,userDto5);
        libraryService.addUserTOComparatorQueue(student3,userDto6);
        libraryService.borrowingBook();
    }

}