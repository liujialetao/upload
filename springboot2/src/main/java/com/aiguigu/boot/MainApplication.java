package com.aiguigu.boot;

import com.aiguigu.boot.bean.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
//        SpringApplication.run(MainApplication.class, args);
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        System.out.println("zu-----------------------------");
        for (String name : names) {
            System.out.println(name);
        }

        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02  = run.getBean("tom", Pet.class);
        System.out.println(tom01==tom02);



    }
}
