package com.example.application;

public class AppConfig extends ResourceConfig {

    public AppConfig() {
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(AppConfig.this).to(AppConfig.class);
            }
        });

        Injector injector = Guice.createInjector(new GuiceModule());
        register(new GuiceFeature(injector));
    }}