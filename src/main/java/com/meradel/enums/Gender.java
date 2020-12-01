package com.meradel.enums;

public enum Gender {

    Male("male"), Female("Female");

    private final String value ;

    private Gender(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
