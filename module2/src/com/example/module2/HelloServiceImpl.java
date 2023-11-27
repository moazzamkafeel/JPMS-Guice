package com.example.module2;

public class HelloServiceImpl implements HelloService {
    @Override
    public String getHelloMessage() {
        return "Hello, World! from Guice";
    }
}
