package com.srccodes.example.spring;

/**
 * Created with IntelliJ IDEA.
 * User: INTERACTIVE
 * Date: 10/1/13
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class SpringCoreHelloWorld {
    private String message = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println(getMessage());
    }
}
