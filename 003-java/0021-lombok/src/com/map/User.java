package com.map;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class User {

    @Getter
    @Setter
    private String name;
    private String family;
    private int age;


}
