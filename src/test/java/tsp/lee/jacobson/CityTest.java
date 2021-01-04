package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {
	
	City ville1 = new City(0,0);
	City ville2 = new City(1,0);
	City ville3 = new City(0,1);
	City ville3Negatif = new City(0,-1);

	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN ville3, ville3
	 * THEN 0
	 */
	public void distanceTo_ville3toville3_0(){
		double expected = 0;
		double actual = ville3.distanceTo(ville3);
		assertEquals(expected, actual, 0.0);
	}
	
	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN ville1, ville2
	 * THEN 1
	 */
	public void distanceTo_ville1toville2_1(){
		double expected = 1 ;
		double actual = ville1.distanceTo(ville2);
		assertEquals(expected, actual, 0.0);
	}
	
	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN ville2, ville1
	 * THEN 1
	 */
	public void distanceTo_ville2toville1_1() {
		double expected = 1 ;
		double actual = ville2.distanceTo(ville1);
		assertEquals(expected, actual, 0.0);
	}
	
	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN ville1, ville3Negatif
	 * THEN 1
	 */
	public void distanceTo_ville1toville3Negatif_1() {
		double expected = 1 ;
		double actual = ville1.distanceTo(ville3Negatif);
		assertEquals(expected, actual, 0.0);
	}

	@Test(expected=NullPointerException.class)
	public void distanceTo_Null_NullPointerException() {
		double actual = ville3.distanceTo(null);
	}
	
	
}
