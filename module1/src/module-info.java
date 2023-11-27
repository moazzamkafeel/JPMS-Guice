module module1 {
    requires java.ws.rs;
    requires jersey.common;
    requires jersey.server;
    requires module2;
    exports com.example.module1;
}