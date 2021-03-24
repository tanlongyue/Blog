package com.yiyue.personalblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
@MapperScan(basePackages = "com.yiyue.personalblog.mapper.*")
@Configuration
@EnableCaching
@ServletComponentScan
public class PersonalblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalblogApplication.class, args);
    }

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //  单个数据大小
        factory.setMaxFileSize("100MB"); // KB,MB
        /// 总上传数据大小
        factory.setMaxRequestSize("100MB");
        return factory.createMultipartConfig();
    }


//
//    @Bean(name = "multipartResolver")
//    public MultipartResolver multipartResolver() {
//        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
//        resolver.setDefaultEncoding("UTF-8");
//        //resolveLazily属性启用是为了推迟文件解析，以在在UploadAction中捕获文件大小异常
//        resolver.setResolveLazily(true);
//        resolver.setMaxInMemorySize(40960);
//        //上传文件大小 5M 5*1024*1024
//        resolver.setMaxUploadSize(5 * 1024 * 1024);
//        return resolver;
//    }


}
