package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Classes;
import com.qf.service.IClsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author lsg
 * @Date 2019/11/30
 */
@Controller
@RequestMapping("/cls")
public class ClsController {
    @Reference
    private IClsService clsService;
    @RequestMapping("/list")
    public String list(Model model){
        List<Classes> list = clsService.list();
        model.addAttribute("classes",list);
        return "showCls";
    }
}
