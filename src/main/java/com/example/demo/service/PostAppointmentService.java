package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PostAppointment;
import com.example.demo.repository.PostAppointmentRepository;


@Service
public class PostAppointmentService {
    @Autowired
    PostAppointmentRepository postAppointmentRepository;
    
	public Iterable<PostAppointment> getAppointmentDetails() {
		return  postAppointmentRepository.findAll() ;
	}

	public Optional<PostAppointment> getAppointmentDetail(Integer id) {
		return postAppointmentRepository.findById(id);
	}

	public void addAppointmentInformation(@Valid PostAppointment postAppointment) {
		postAppointmentRepository.save(postAppointment);
		
		
	}

	public void delete(Integer id) {
		postAppointmentRepository.deleteById(id);
		
	}

}
