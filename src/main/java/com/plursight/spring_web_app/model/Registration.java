package com.plursight.spring_web_app.model;

import jakarta.validation.constraints.NotEmpty;

public class Registration {

    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
