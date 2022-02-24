package com.kong.travel.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;
import java.util.concurrent.TimeUnit;

@Configuration
public class DataSourceConfig  implements WebMvcConfigurer {

//    @Override
//    public void addResourceHandlers(final ResourceHandlerRegistry registry){
//        registry.addResourceHandler("/**")
//                .addResourceLocations("classpath:/templates/", "classpath:/static/")
//                .setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES));
//    }

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}