package com.hewking.resetservice.configuration;

import com.hewking.resetservice.filter.LoggerFilter;
import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class WebConfiguration {

    @Bean
    public RemoteIpFilter remoteIpFilter(){
        return new RemoteIpFilter();
    }

    @Bean
    public FilterRegistrationBean testRegistertionBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        Filter filter = new LoggerFilter();
        bean.setFilter(filter);
        bean.addUrlPatterns("/*");
        bean.addInitParameter("paramName","paramValue");
        bean.setName("LoggerFilter");
        bean.setOrder(1);
        return bean;
    }


}
