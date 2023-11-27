package com.example.module2;

public class GuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(HelloService.class).to(HelloServiceImpl.class);
    }
