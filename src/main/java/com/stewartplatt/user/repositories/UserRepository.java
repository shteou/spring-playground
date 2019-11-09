package com.stewartplatt.user.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.stewartplatt.user.models.User;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Long> {
}
