package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classes.Client;
import classes.Service;

class ClientTest {

	/**
	 * Test du constructeur par défaut de la classe client
	 */
	@Test
	void testClient() {
		Client clientTest = new Client ();
		Service service = new Service();
		assertEquals(clientTest.getdDateArrive(),"");
		assertEquals(clientTest.getsService().getiTemps(),service.getiTemps());
		assertEquals(clientTest.getsService().getsNom(),service.getsNom());
	}

	/**
	 * Test du constructeur de la classe Client
	 */
	@Test
	void testServiceStringService() {
		
		Service serviceTest = new Service ("Retrait de colis",10);
		Client clientTest = new Client ("12/10/2020",serviceTest);
		assertEquals(clientTest.getdDateArrive(),"12/10/2020");
		assertEquals(clientTest.getsService().getiTemps(),serviceTest.getiTemps());
		assertEquals(clientTest.getsService().getsNom(),serviceTest.getsNom());
	}
	
	/**
	 * Test de setdDateArrive
	 */
	@Test
	void testSetdDateArrive() {
		
		Service serviceTest = new Service ("Retrait de colis",10);
		Client clientTest = new Client ("12/10/2020",serviceTest);
		assertEquals(clientTest.getdDateArrive(),"12/10/2020");
		clientTest.setdDateArrive("12/08/2021");
		assertEquals(clientTest.getdDateArrive(),"12/08/2021");
	}
	
	/**
	 * Test de setdDateArrive
	 */
	@Test
	void testsetsService() {
		
		Service serviceTest = new Service ("Retrait de colis",10);
		Client clientTest = new Client ("12/10/2020",serviceTest);
		assertEquals(clientTest.getsService().getiTemps(),serviceTest.getiTemps());
		assertEquals(clientTest.getsService().getsNom(),serviceTest.getsNom());
		Service serviceTestModif = new Service ("Pose une lettre",05);
		clientTest.setsService(serviceTestModif);;
		assertEquals(clientTest.getsService().getiTemps(),serviceTestModif.getiTemps());
		assertEquals(clientTest.getsService().getsNom(),serviceTestModif.getsNom());
	}
}
