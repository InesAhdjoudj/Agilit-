package test;


import org.junit.Before;
import org.junit.Test;

import animal.Animal;
import animal.Famille;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;



public class FamilleTest {
	
	 	
	    private Animal bobby;
	    private Famille famille1;
	    private Animal bobus;

	    public FamilleTest() {
	    	
	    }
	    @Before
	    public void setUp() // throws java.lang.Exception
	    {
	    	
	        bobby = new Animal("Bobby","France");
	        famille1 = new Famille("Dupond", "34 rue de la libération 60500 Chantilly");
	        famille1.ajouterAnimal(bobby);
	        bobus = new Animal("Bobus","France");

	    }
	    @After
	    public void tearDown() // throws java.lang.Exception
	    {
	        //Libérez ici les ressources engagées par setUp()
	    }
	    @Test
	    public void testanimalExiste()
	    {
	        assertTrue(famille1.animalExiste(bobby));
	        assertFalse(famille1.animalExiste(bobus));
	    }
	    @Test
	    public void testajouterAnimal()
	    {
	    	famille1.ajouterAnimal(bobus);
	        assertTrue(famille1.animalExiste(bobus));
	        
	    }

}
