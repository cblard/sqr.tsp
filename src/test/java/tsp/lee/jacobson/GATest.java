package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;

public class GATest {
	
	City ville1 = new City(0,0);
	City ville2 = new City(1,0);
	City ville3 = new City(0,1);
	ArrayList<City> villes = new ArrayList();
	
	/**
     * GIVEN evolvePopulation
     * WHEN deux villes connues
     * THEN les mêmes deux villes dans le même ordre
     */
    @Test
    public void evolvePopulation_uneTournee_identique() {
        villes.add(ville1);
        villes.add(ville2);
        
        Tour tour = new Tour(villes);

        Population pop = new Population(1, false);
        pop.saveTour(0, tour);
        Population newPop = GA.evolvePopulation(pop);

        assertEquals(newPop.getTour(0).getCity(0), villes.get(0));
        assertEquals(newPop.getTour(0).getCity(1), villes.get(1));
    }
}
