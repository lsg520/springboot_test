package com.qf.serviceImpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.StuMapper;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.service.IClsService;
import com.qf.service.IStudent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author lsg
 * @Date 2019/11/30
 */
@Service
public class StuServiceImpl implements IStudent {
    @Reference
    private IClsService clsService;
    @Autowired
    private StuMapper stuMapper;
    @Override
    public List<Student> list() {
        List<Student> list = stuMapper.selectList(null);
        for(Student s:list){
            Integer cid = s.getCid();
            Classes c = clsService.queryById(cid);
            s.setCls(c);
        }
        return list;
    }

    @Override
    public void deleteById(Integer id) {
        Integer cid = stuMapper.selectCidById(id);
        clsService.deleteStuById(cid);
        stuMapper.deleteById(id);
    }

    @Override
    public Student getStuById(Integer id) {
        Student stu = stuMapper.selectById(id);
        Integer cid = stu.getCid();
        Classes c = clsService.queryById(cid);
        stu.setCls(c);
        return stu;
    }

    @Override
    public void updateStu(Student stu) {
        stuMapper.updateById(stu);
    }

    @Override
    public void addStu(Student stu) {
        clsService.addNumById(stu.getCid());
        stuMapper.insert(stu);
    }
}
