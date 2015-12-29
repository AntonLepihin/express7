package com.ants.express7.frontend;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

/**
 * Created by anton on 12/20/15.
 */
@ComponentScan(value = {"com.ants.express7"})
@SpringBootApplication//(exclude = { org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class })
@EnableAutoConfiguration
//@Import({DebugServlet.class})
public class DemoApplication implements DisposableBean {

    protected static final String PRODUCTION_MODE_PROPERTY = "vaadin.servlet.productionMode";


    public static void main(String[] args) {
        System.setProperty(PRODUCTION_MODE_PROPERTY, "true");
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

    public void destroy() throws Exception {
        System.out.println("destroy");
    }
}


