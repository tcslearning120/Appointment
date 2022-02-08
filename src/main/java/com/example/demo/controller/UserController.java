package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserFeedback;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping("/user")
	Iterable<UserFeedback> getusers() {
		return userService.getUsers();
	}
	
    @GetMapping("/user/{id}")
   Optional<UserFeedback> getUsers(@PathVariable("id") Integer id) {
	   return userService.getuser(id);
    }
    
	@PostMapping("/user")
	@ResponseStatus(code = HttpStatus.CREATED)
	void creatUser(@RequestBody @Valid UserFeedback user) {
		userService.saveUser(user);
	}

	@DeleteMapping("/user/{id}")
	void deleteUser(@PathVariable("id") Integer id) {
		userService.deleteUser(id);
	}
}
