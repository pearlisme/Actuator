package com.pearl.health;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Component
public class CustomEndpoint implements Endpoint {
    @Override
    public String id() {
        return "development";
    }

    @Override
    public boolean enableByDefault() {
        return true;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }


    public String invoke(){
        return "Hello Youtube";
    }
}
