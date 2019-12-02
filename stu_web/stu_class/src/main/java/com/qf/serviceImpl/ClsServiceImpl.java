package com.qf.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.ClsMapper;
import com.qf.entity.Classes;
import com.qf.service.IClsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author lsg
 * @Date 2019/11/30
 */
@Service
public class ClsServiceImpl implements IClsService {

    @Autowired
    private ClsMapper clsMapper;
    @Override
    public List<Classes> list() {
        return clsMapper.selectList(null);
    }

    @Override
    public Classes queryById(Integer cid) {
        return clsMapper.selectById(cid);
    }

    @Override
    public void deleteStuById(Integer cid) {
        clsMapper.deleteStuById(cid);
    }

    @Override
    public void addNumById(Integer cid) {
        clsMapper.addNumById(cid);
    }
}
