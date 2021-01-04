package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
public class TourTest {

	ArrayList chemin = new ArrayList();
	City ville1 = new City(0,0);
	City ville2 = new City(1,0);
	City ville3 = new City(0,1);
	
	@Test
	/**
	 * GIVEN getDistance
	 * WHEN le chemin est vide (aucune ville)
	 * THEN 0
	 */
	public void getDistance_cheminNul_0() {
		Tour tour = new Tour();
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}
	
	@Test
	/**
	 * GIVEN getDistance
	 * WHEN le chemin ne contient qu'une ville
	 * THEN 0
	 */
	public void getDistance_uneVille_0() {
		chemin.add(ville1);
		Tour tour = new Tour(chemin);
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}
	
	@Test
	/**
	 * GIVEN getDistance
	 * WHEN le chemin contient deux villes
	 * THEN 2
	 */
	public void getDistance_deuxVilles_0() {
		chemin.add(ville1);
		chemin.add(ville2);
		Tour tour = new Tour(chemin);
		int expected = 2;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}
	
	@Test
	/**
	 * GIVEN getDistance
	 * WHEN le chemin contient trois villes
	 * THEN 3
	 */
	public void getDistance_troisVilles_0() {
		chemin.add(ville1);
		chemin.add(ville2);
		chemin.add(ville3);
		Tour tour = new Tour(chemin);
		System.out.println(tour.getDistance());
		int expected = 3;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

}
