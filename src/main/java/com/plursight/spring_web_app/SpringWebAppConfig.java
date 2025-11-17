package com.plursight.spring_web_app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//This class becomes a Spring configuration file (like application.yml but in Java form).
@Configuration
public class SpringWebAppConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/files/**").addResourceLocations("/WEB-INF/pdf/");
    }

    //    ✅ This method creates a ViewResolver bean, meaning Spring will use it to locate your JSP pages.
    @Bean
    public ViewResolver viewResolver() {
//        ✅ This is the resolver type used for JSP files.
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
//        Spring will use this resolver for all views.
        return resolver;
    }
}
