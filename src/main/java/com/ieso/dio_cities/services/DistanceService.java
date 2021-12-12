/**
 * 
 */
package com.ieso.dio_cities.services;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import com.ieso.dio_cities.model.City;
import com.ieso.dio_cities.repository.CityRepository;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Service
public class DistanceService {
	
	@Autowired
	private CityRepository cityRepository;
	Logger log = LoggerFactory.getLogger(DistanceService.class);
	
	public Double distanceByPointsInMiles(Long city1, Long city2) {
		log.info("nativePostgresInMiles({}, {})", city1,city2);
		return cityRepository.distanceByPoints(city1, city2);
	}

	public Double distanceByCubeInMeters(Long city1, Long city2) {
		log.info("distanceByCubeInMeters({}, {})", city1, city2);
		final List<City> cities = cityRepository.findAllById((Arrays.asList(city1, city2)));
		
		Point p1 = cities.get(0).getLocation();
		Point p2 = cities.get(1).getLocation();
		return cityRepository.distanceByCubeInMeters(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}

}
