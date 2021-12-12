/**
 * 
 */
package com.ieso.dio_cities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ieso.dio_cities.model.City;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
	@Query(value = "SELECT ((SELECT lat_lon FROM cidade WHERE id=?1) "
			+ "<@> (SELECT lat_lon FROM cidade WHERE id=?2)) as distance", 
			nativeQuery = true)
	Double distanceByPoints(Long city1, Long city2);

	@Query(value = "SELECT earth_distance(ll_to_earth(?1,?2), "
			+ "ll_to_earth(?3,?4)) as distance", 
			nativeQuery = true)
	Double distanceByCubeInMeters(double x, double y, double x2, double y2);

}
