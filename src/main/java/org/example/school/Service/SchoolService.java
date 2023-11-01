package org.example.school.Service;

import org.example.school.Courses;
import org.example.school.Student;
import org.example.school.entities.NonAcademicStaff;
import org.example.school.entities.Teachers;
import org.example.school.entities.ViceChancellor;
import org.example.school.enums.Classes;

import java.util.HashMap;
import java.util.List;

public interface SchoolService {
    Student admit(Student student, ViceChancellor viceChancellor);
    Student expel(Student student, ViceChancellor viceChancellor);
    Courses teach(Student student, Teachers teachers, Courses courses);
    HashMap<Student, List<Courses>> take(Student student, Courses courses);

}
