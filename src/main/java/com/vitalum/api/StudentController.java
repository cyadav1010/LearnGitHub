package com.vitalum.api;

import com.vitalum.Entity.Student;
import com.vitalum.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired//give me object of below class Student service
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllstudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }

    @RequestMapping(value = "/{id}",method=RequestMethod.POST)
    public  void deleteStudentById(@PathVariable("id") int id){
        System.out.println("id=="+id);
        studentService.deleteStudentById(id);
    }

    @RequestMapping(method=RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public  void updateStudentDetails(@RequestBody Student student){
        studentService.updateStudentDetails(student);
    }

    @RequestMapping(method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public  void insertStudentDetails(@RequestBody Student student){
        studentService.insertStudentDetails(student);
    }
}
