package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.Classes;

/**
 * @Author lsg
 * @Date 2019/11/30
 */
public interface ClsMapper extends BaseMapper<Classes> {
    void deleteStuById(Integer cid);
    void addNumById(Integer cid);
}
