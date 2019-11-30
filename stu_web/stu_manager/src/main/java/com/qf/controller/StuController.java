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
        System.out.println(id);
        student.deleteById(id);
        return "redirect:/stu/list";
    }
}
