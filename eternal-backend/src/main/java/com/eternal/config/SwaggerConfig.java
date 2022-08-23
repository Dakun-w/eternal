package com.eternal.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class SwaggerConfig {
    @Bean
    public Docket desertsApi(){
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(String.valueOf(ApiOperation.class)))
                .paths(PathSelectors.any())
                .build()
                .groupName("default")
                .enable(true);
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("用户服务接口文档")
                .description("用户服务接口文档")
                .contact(new Contact("YML", "https://www.baidu.com", "yml@xxxx.com"))
                .termsOfServiceUrl("https://www.zybuluo.com/mdeditor#2281023-full-reader")
                .version("1.0")
                .build();
    }
}

