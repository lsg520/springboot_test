package com.qf.stu_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
public class StuManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StuManagerApplication.class, args);
    }

}
