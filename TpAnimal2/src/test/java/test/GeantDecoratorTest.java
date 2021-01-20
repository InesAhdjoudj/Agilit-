package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import design_pattern.GeantDecorator;
import personnage.Personnage;

public class GeantDecoratorTest {
	Personnage perso;
	GeantDecorator geant;

	@Before
    public void setUp() 
    {
        perso = new Personnage("Romain");
        geant = new GeantDecorator(perso);
    }
	
	@Test
	public void testSubir() {
		geant.subir(10);
		assertEquals(95, geant.getPointDeVie());
	}

}
