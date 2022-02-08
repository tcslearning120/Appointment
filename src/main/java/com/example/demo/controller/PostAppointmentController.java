package com.example.demo.controller;


import java.util.Optional;

import javax.transaction.Transactional;
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

import com.example.demo.entity.PostAppointment;
import com.example.demo.service.PostAppointmentService;

@RestController
public class PostAppointmentController {
	@Autowired
	private PostAppointmentService postAppointmentService;

	@GetMapping("/postAppointment")
	Iterable<PostAppointment> getAppointments() {
		return postAppointmentService.getAppointmentDetails();
	}

	@GetMapping("/postAppointment/{id}")
	Optional<PostAppointment> getAppointment(@PathVariable("id") Integer id) {
		return postAppointmentService.getAppointmentDetail(id);
	}

	@PostMapping("/postAppointment")
	@Transactional
	@ResponseStatus(code = HttpStatus.CREATED)
	void addAppointment(@RequestBody @Valid PostAppointment postAppointment) throws Exception {
		postAppointmentService.addAppointmentInformation(postAppointment);
	}

	@DeleteMapping("/postAppointment/{id}")
	void deleteAppointment(@PathVariable("id") Integer id) {
		postAppointmentService.delete(id);
	}

}