package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "update")
    public @ResponseBody Object update(Integer id, String studentName){
        Student student = new Student();
        student.setId(id);
        student.setStuName(studentName);
        int modifyCount = studentService.modifyStudentById(student);

        return "修改的结果：" + modifyCount;
    }

    @RequestMapping(value = "/student/detail")
    public @ResponseBody Object studentDetail(Integer id){

        Student student = studentService.queryStudentById(id);

        return student;
    }

}
