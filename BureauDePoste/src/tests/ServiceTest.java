/**
 * 
 */
package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classes.Service;

/**
 * @author Administrateur
 *
 */
class ServiceTest {

	/**
	 * Test du constructeur par défaut de la classe service
	 */
	@Test
	void testService() {
		Service serviceTest = new Service ();
		assertEquals(serviceTest.getsNom(),"");
		assertEquals(serviceTest.getiTemps(),0);
	}
	
	/**
	 * Test du constructeur de la classe service
	 */
	@Test
	void testServiceStringInt() {
		Service serviceTest = new Service ("Retrait de colis",10);
		assertEquals(serviceTest.getsNom(),"Retrait de colis");
		assertEquals(serviceTest.getiTemps(),10);
	}
	
	/**
	 * Test de setsNom
	 */
	@Test
	void testSetNom() {
		
		Service serviceTest = new Service ("Retrait de colis",10);
		assertEquals(serviceTest.getsNom(),"Retrait de colis");
		serviceTest.setsNom("Poser une lettre");
		assertEquals(serviceTest.getsNom(),"Poser une lettre");
	}
	
	/**
	 * Test de setiTemps
	 */
	@Test
	void testsetiTemps() {
		
		Service serviceTest = new Service ("Retrait de colis",10);
		assertEquals(serviceTest.getiTemps(),10);
		serviceTest.setiTemps(5);
		assertEquals(serviceTest.getiTemps(),5);
	}

}
