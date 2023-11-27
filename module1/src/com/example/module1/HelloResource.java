package com.example.module1;

@Path("/hello")
public class HelloResource {

    private final HelloService helloService;

    @Inject
    public HelloResource(HelloService helloService) {
        this.helloService = helloService;
    }

    @GET
    public String sayHello() {
        return helloService.getHelloMessage();
    }
}
