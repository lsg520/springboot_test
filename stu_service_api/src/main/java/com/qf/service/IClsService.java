package com.qf.service;

import com.qf.entity.Classes;

import java.util.List;

/**
 * @Author lsg
 * @Date 2019/11/30
 */
public interface IClsService {
    List<Classes> list();
    Classes queryById(Integer cid);

    void deleteStuById(Integer cid);
}
