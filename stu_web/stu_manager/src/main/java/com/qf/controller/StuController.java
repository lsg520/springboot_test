package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Student;
import com.qf.service.IStudent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author lsg
 * @Date 2019/11/30
 */
@Controller
@RequestMapping("/stu")
public class StuController {
    @Reference
    private IStudent student;
    @RequestMapping("/list")
    private String list(Model model){
        List<Student> list = student.list();
        model.addAttribute("stu",list);
        return "showStu";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        student.deleteById(id);
        return "redirect:/stu/list";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Integer id,Model model){
        Student stu = student.getStuById(id);
        model.addAttribute("s",stu);
        return "update";
    }

    /**
     * 修改学生信息的方法
     * @param stu
     * @return
     */
    @RequestMapping("/update")
    public String update(Student stu){
        student.updateStu(stu);
        return "redirect:/stu/list";
    }

    /**
     * 跳转到添加学生界面
     * @return
     */
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "addStu";
    }

    /**
     * 添加学生的方法
     * @param stu
     * @return
     */
    @RequestMapping("/addStu")
    public String addStu(Student stu){
        student.addStu(stu);
        return "redirect:/stu/list";
    }
}
