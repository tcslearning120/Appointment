package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserFeedback;

@Repository
public interface UserRepository  extends JpaRepository<UserFeedback,Integer>{
	
}
