package com.example.jerseydemo2;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.ContextResolver;

@Path("/hello-world")
public class HelloResource {
//    @Context
//    ContextResolver<MyProducer> myProvider;

//    @Context
//    TestProucer myTestProducer;

    private MyProducer myProducer;

//    @Inject
//    ContextResolver<MyProducer> myProvider;

//    @Inject
//    TestProucer myTestProducer;

//    @Inject
//    private MyProducer myProducer;

    @Context
    public void setMyProvider(ContextResolver<MyProducer> myProvider2){
        if(myProvider2 != null)
            this.myProducer = myProvider2.getContext(MyProducer.class);
    }


    @GET
    @Produces("text/plain")
    public String hello() {
        System.out.println(myProducer);
        return "Hello, World!";
    }
}