package com.litecase.core;

import jakarta.annotation.PostConstruct;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
//@MapperScan(annotationClass = Mapper.class)
public class LitecaseCoreApplication {

    private static final Logger log = LoggerFactory.getLogger(LitecaseCoreApplication.class);

    @PostConstruct
    public void postConstruct() {
        log.info("[Litecase] |- LitecaseCoreApplication Auto Configure.");
    }
}
