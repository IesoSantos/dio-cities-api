/**
 * 
 */
package com.ieso.dio_cities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ieso.dio_cities.model.State;
import com.ieso.dio_cities.repository.StateRepository;

/**
 * @author Anderson dos Reis Santos
 *
 */
@RestController
@RequestMapping("/states")
public class StateResource {
	
	@Autowired
	private StateRepository repository;
	
	@GetMapping
	public List<State> states(){
		return repository.findAll();
	}

}
