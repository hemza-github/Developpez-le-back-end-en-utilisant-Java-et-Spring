package com.hemza.rental_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hemza.rental_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
