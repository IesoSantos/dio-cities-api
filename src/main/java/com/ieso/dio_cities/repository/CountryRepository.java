/**
 * 
 */
package com.ieso.dio_cities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ieso.dio_cities.model.Country;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
