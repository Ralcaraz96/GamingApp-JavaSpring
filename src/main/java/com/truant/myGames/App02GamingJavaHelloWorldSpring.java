package com.truant.myGames;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingJavaHelloWorldSpring {
    public static void main(String[] args) {
        // 1 - Launch spring context.

        var context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // 2- Configure the thing we want managed.

        // 3- Retrieve the bean!
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
    }
}
