package com.example.jerseydemo2;

import javax.ws.rs.Produces;

//@Produces
public class MyProducer {
    private String myValue;
    public MyProducer(String value) {
        this.myValue = value;
    }
    String getMyValue(){
        return this.myValue;
    }
}
