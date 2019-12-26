package com.taxi.service;

import com.taxi.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository {
    Mono<User> getUserById(int id);
    
    Flux<User> getAllUsers();
    
    Mono<Void> saveUser(Mono<User> user);
}
