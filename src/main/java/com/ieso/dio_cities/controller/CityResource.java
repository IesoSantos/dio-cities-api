/**
 * 
 */
package com.ieso.dio_cities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ieso.dio_cities.model.City;
import com.ieso.dio_cities.repository.CityRepository;

/**
 * @author Anderson dos Reis Santos
 *
 */
@RestController
@RequestMapping("/cities")
public class CityResource {
	
	@Autowired
	private CityRepository repository;
	
	@GetMapping
	public Page<City> getCities(final Pageable page){
		return repository.findAll(page);
	}

}
