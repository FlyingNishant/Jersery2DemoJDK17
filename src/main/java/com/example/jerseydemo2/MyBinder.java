package com.example.jerseydemo2;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.ws.rs.ext.ContextResolver;

public class MyBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(TestProucer.class).to(MyProducer.class);
//        bind(TestProucer.class).to(ContextResolver.class);
    }
}
