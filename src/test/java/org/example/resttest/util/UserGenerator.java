package org.example.resttest.util;

import org.example.resttest.pojos.CreateUserRequest;

public class UserGenerator {

    public static CreateUserRequest getSimpleUser(){
        return CreateUserRequest.builder()
                .name("simple")
                .job("automation")
                .build();
    }
}
