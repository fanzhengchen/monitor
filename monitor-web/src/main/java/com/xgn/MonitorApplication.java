package com.xgn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-12
 * Time: 12:11 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@SpringBootApplication
@MapperScan("com.xgn")
public class MonitorApplication {


    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
    }
}
