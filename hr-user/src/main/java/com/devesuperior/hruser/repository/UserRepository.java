package com.devesuperior.hruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesuperior.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
