package classes;

import java.util.Date;

/**
 * Classe qui repr�sente un client venant demander un service au bureau de poste
 * @author Lucas Mayran
 * @version 1.0
 */
public class Client {
	
	/** date d'arrive du client au bureau de poste **/
	private String dDateArrive;
	
	/** Service pour lequel le client vient au bureau **/
	private Service sService;
	
	/*
	 * Constructeur par d�faut de la classe Client
	 */
	public Client() {
		this.dDateArrive = "";
		this.sService = new Service();
	}
	
	/*
	 * Constructeur de la classe Client
	 * @param dDateArrive Date d'arriv� du client
	 * @param sService Service pour lequel le client va au bureau de poste
	 * @return un boolean true si c'est bon ( a mettre uniquemement si il y � un type de retour )
	 */
	public Client(String date, Service service) {
		this.dDateArrive = date;
		this.sService = service;
	}

	/*
	 * Acesseur sur la date d'arriv�e
	 */
	public String getdDateArrive() {
		return dDateArrive;
	}

	/*
	 * Modificateur de la date d'arriv�
	 * @param dDateArrive nouvelle date d'arriv�
	 */
	public void setdDateArrive(String dDateArrive) {
		this.dDateArrive = dDateArrive;
	}

	/*
	 * Acesseur sur le service
	 */
	public Service getsService() {
		return sService;
	}

	/*
	 * Modificateur sur le service
	 * @param sService nouveau service
	 */
	public void setsService(Service sService) {
		this.sService = sService;
	}
	
}
