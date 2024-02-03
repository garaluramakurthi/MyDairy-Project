package com.ravi.springboot.mydiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import com.ravi.springboot.mydiary.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);
	
}
