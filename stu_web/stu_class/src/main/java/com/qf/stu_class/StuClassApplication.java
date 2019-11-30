package com.qf.stu_class;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@DubboComponentScan("com.qf.serviceImpl")
@MapperScan("com.qf.dao")
public class StuClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(StuClassApplication.class, args);
    }

}
