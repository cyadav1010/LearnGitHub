package com.vitalum.Service;

import com.vitalum.Dao.StudentDao;
import com.vitalum.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired//give me object for below class
    private StudentDao studentDao;

//    @Autowired
//    private TeacherDAO teaObj;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudent();
    }

    public  Student getStudentById(int id){
        return studentDao.getStudentById(id);
    }

    public  Student deleteStudentById(int id){
        return studentDao.deleteStudentById(id);
    }

    public  void updateStudentDetails(Student student){
        studentDao.updateStudentDetails(student);
    }

    public void insertStudentDetails(Student student) {
        studentDao.insertStudentDetails(student);
    }
}


