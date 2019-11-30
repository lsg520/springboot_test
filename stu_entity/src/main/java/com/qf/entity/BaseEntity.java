package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author lsg
 * @Date 2019/11/30
 */
@Data
public class BaseEntity implements Serializable {
    @TableId(type = IdType.AUTO)
    protected Integer id;
}
