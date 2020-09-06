package com.vitalum.Dao;

import com.vitalum.Entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository//create object for this class
public class StudentDao {
    HashMap<Integer, Student> students;
    public StudentDao() {
        this.students = new HashMap<>();
        students.put(1,new Student(1,"chandan","Maths"));
        students.put(2,new Student(2,"omp","science"));
        students.put(3,new Student(3,"kanchan","comp"));
        students.put(4,new Student(4,"harry","comp"));
        students.put(5,new Student(5,"neha","Science"));
    }

    public Collection<Student> getAllStudent(){
        Collection<Student> values = students.values();
        return values;
    }

    public Student getStudentById(int id){
        Student student = students.get(id);
        return student;
    }

    public Student deleteStudentById(int id){
        Student remove = this.students.remove(id);
        return remove;
    }

    public  void updateStudentDetails(Student student){
    Student s=students.get(student.getId());
    if(Objects.isNull(s)) {
        return;
    }
    s.setCourse(student.getCourse());
    s.setName(student.getName());
    students.put(student.getId(),s);
    //TODO : getor defualt + removeIf + present
    }

    public void insertStudentDetails(Student student) {
        int key = student.getId();
        students.put(key,student);
    }
}
