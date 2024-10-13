package com.example.entity.data.model;

import jakarta.persistence.*;
import org.springframework.data.redis.core.RedisHash;

@Entity
@Table(name = "users")
@RedisHash(value = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}