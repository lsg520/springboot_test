package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.Student;

/**
 * @Author lsg
 * @Date 2019/11/30
 */
public interface StuMapper extends BaseMapper<Student> {
    Integer selectCidById(Integer id);
}
