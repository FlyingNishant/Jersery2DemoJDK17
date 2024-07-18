package com.example.jerseydemo2;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

@Provider
public class TestProucer implements ContextResolver<MyProducer> {

    public TestProucer(){
        System.out.println("Test Producer working");
    }

    @Override
    public MyProducer getContext(Class<?> aClass) {
        return new MyProducer("this is a test");
    }
}
