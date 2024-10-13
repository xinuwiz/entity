package com.example.entity.data.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UserGettingDTO(Long id) {

    @Override
    @JsonProperty(value = "id")
    public Long id() {
        return id;
    }
}
