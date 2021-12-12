/**
 * 
 */
package com.ieso.dio_cities.services;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Anderson dos Reis Santos
 *
 */
@AllArgsConstructor
@Getter
public enum EarthRadius {

	METERS("m", 6378168),
	KILOMETERS("km", 6378.168f),
	MILES("mi", 3958.747716f);
	
	private final String unit;
	private final float value;
}
