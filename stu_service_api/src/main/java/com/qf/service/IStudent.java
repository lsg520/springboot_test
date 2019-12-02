package com.qf.service;

import com.qf.entity.Student;

import java.util.List;

/**
 * @Author lsg
 * @Date 2019/11/30
 */
public interface IStudent{
    List<Student> list();
    void deleteById(Integer id);
    Student getStuById(Integer id);
    void updateStu(Student stu);
    void addStu(Student stu);
}
