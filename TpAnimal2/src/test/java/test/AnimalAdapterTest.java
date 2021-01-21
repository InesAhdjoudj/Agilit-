package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import animal.Animal;
import designPattern.AnimalAdapter;

public class AnimalAdapterTest {
	private AnimalAdapter adapter;
	private Animal bobby;
    @Before
    public void setUp() 
    {
        bobby = new Animal("Bobby","Italie");
        adapter = new AnimalAdapter(bobby);
    }
    @Test
    public void testGetPointDeVie() {
    	assertEquals(100, adapter.getPointDeVie());
    }
    @Test
    public void testVoyageVers()
    {
        adapter.voyageVers("France");
        assertEquals("France", adapter.getPays());
    }

}
