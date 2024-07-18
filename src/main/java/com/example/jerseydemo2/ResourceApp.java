package com.example.jerseydemo2;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Produces;

public class ResourceApp extends ResourceConfig {
    public ResourceApp() {
//        packages("com.example.jerseydemo2");
//        register(TestProucer.class);
//        register(JacksonFeature.class);
//        register(HelloResource.class);
//        register(new MyBinder());
        super(TestProucer.class);
    }
}
