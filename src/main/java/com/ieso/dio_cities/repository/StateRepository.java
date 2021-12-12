/**
 * 
 */
package com.ieso.dio_cities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ieso.dio_cities.model.State;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
