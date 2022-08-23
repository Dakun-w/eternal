package com.eternal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author xiao
 */
@SpringBootApplication
@EnableOpenApi
@MapperScan("com.eternal.mapper")
public class EternalBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EternalBackendApplication.class, args);
    }

}
