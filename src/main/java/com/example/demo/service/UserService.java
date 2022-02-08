package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserFeedback;
import com.example.demo.repository.UserRepository;


@Service
public class UserService {
	@Autowired 
	UserRepository userRepository;
	
	public void saveUser(UserFeedback user) {
		userRepository.save(user);
	}
	
	public Iterable<UserFeedback> getUsers() {
		return userRepository.findAll();
	}
	
    public Optional<UserFeedback> getuser(Integer id) {
    	return userRepository.findById(id);
    }
    
    public void deleteUser(Integer id) {
    	userRepository.deleteById(id);
    }
}
