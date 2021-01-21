package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import designPattern.NainDecorator;
import personnage.Personnage;

public class NainDecoratorTest {
	Personnage perso;
	NainDecorator nain;

	@Before
    public void setUp() 
    {
		perso = new Personnage("Romain");
		nain = new NainDecorator(perso);
    }
	
	@Test
	public void testSubir() {
		nain.subir(10);
		assertEquals(85, nain.getPointDeVie());
	}

}
