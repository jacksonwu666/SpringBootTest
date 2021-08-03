package com.ygj.springboottest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @version 1.0
 * @description: Swagger2 配置类
 * @author: WuXiang
 * @create: 2021-08-02 16:57
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
    return new Docket(DocumentationType.SWAGGER_2)
            //指定构建api文档详细信息的方法：api()
            .apiInfo(apiInfo())
            .select()
            //指定要生成的api接口的包路径，这里把controller作为包路径，生成controller中所有的接口
            .apis(RequestHandlerSelectors.basePackage("com.ygj.springboottest.controller"))
            .paths(PathSelectors.any())
            .build();
    }

    /**
     * 构建api文档的详细信息
     **/
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //设置页面标题
                .title("Spring Boot集成Swagger2接口总览")
                //设置接口描述
                .description("SpringBoot Swagger2学习")
                //设置版本号
                .version("1.0")
                .build();
    }

}
