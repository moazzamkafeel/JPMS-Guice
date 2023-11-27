package com.example.application;

public class ApplicationMain {
    public static void main(String[] args) {

        // Guice configuration
        Injector injector = Guice.createInjector(new GuiceModule());
        AppConfig appConfig = injector.getInstance(AppConfig.class);

        // Jersey configuration
        ResourceConfig resourceConfig = new ResourceConfig()
                .register(HelloResource.class)
                .register(appConfig);

        URI baseUri = URI.create("http://localhost:8080/");
        GrizzlyHttpServerFactory.createHttpServer(baseUri, resourceConfig);
        System.out.println("Jersey app started at " + baseUri);
    }
}