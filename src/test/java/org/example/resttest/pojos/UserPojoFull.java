package org.example.resttest.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data // генерит геттеры, сеттеры equals & hashcode
public class UserPojoFull {
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private int id;
    private String avatar;
    private String email;
}