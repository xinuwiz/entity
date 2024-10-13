package com.example.entity;

import com.example.entity.data.model.User;
import com.example.entity.data.repository.mysql.JpaUserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY, connection = EmbeddedDatabaseConnection.H2)
public class JpaUserRepositoryIntegrationTest {

    @Autowired
    private JpaUserRepository repository;

    @Test @Order(1) @Rollback(value = false) void save() {
        User user = new User();
        user.setName("Tomás");
        user = repository.save(user);
        Assertions.assertThat(user).isNotNull();
        Assertions.assertThat(user.getId()).isGreaterThan(0);
    }

    @Test @Order(2) @Rollback void get() {
        User user = repository.findById(1L).orElse(null);
        Assertions.assertThat(user).isNotNull();
    }
}