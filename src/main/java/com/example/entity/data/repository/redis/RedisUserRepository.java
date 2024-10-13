package com.example.entity.data.repository.redis;

import com.example.entity.data.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisUserRepository extends CrudRepository<User, Long> { }
