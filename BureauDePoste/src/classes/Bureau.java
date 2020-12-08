package classes;

import java.util.ArrayList;

/**
 * Classe qui représente un bureau de poste
 * @author Lucas Mayran
 * @version 1.0
 */
public class Bureau {

	/** ArrayList qui contient les guichets du bureau **/
	private ArrayList<Guichet> listeGuichet;
	
	/** ArrayList qui contient les clients du bureau **/
	private ArrayList<Client> listeClient;
	
	/*
	 * Constructeur par défaut de la classe Bureau
	 */
	public Bureau() {
		this.listeGuichet = new ArrayList<Guichet>();
		this.listeClient = new ArrayList<Client>();
	}
	
	/*
	 * Constructeur de la classe Bureau
	 * @param listeGuichet liste des guichets
	 * @param listeClient liste des clients
	 */
	public Bureau(ArrayList<Guichet> listeGuichet, ArrayList<Client> listeClient) {
		this.listeGuichet = listeGuichet;
		this.listeClient = listeClient;
	}
}
