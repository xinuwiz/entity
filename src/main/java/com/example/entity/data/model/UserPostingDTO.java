package com.example.entity.data.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UserPostingDTO(String name) {

    @Override
    @JsonProperty(value = "name")
    public String name() {
        return name;
    }
}
