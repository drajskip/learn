package com.drabyte.init.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drabyte.init.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
}
