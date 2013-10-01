package com.srccodes.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //1. create Application context in xml look resources/springApplicationContext.xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplicationContext.xml");

        // Get a bean instance  (Hey! its Dependency injection)
        SpringCoreHelloWorld helloWorldBeanInst = applicationContext.getBean("helloWorldBean", SpringCoreHelloWorld.class);

        // Execute SpringCoreHelloWorld bean's method
        helloWorldBeanInst.sayHello();
    }
}
