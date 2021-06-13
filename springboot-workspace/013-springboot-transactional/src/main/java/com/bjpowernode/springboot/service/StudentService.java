package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Student;

public interface StudentService {

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    int modifyStudentById(Student student);

    /**
     * 根据学生标识获取学生详情
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);
}
