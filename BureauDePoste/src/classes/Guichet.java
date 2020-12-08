package classes;

/**
 * Classe qui représente un guichet qui acceuille les clients
 * @author Lucas Mayran
 * @version 1.0
 */
public class Guichet {
	
	/** Boolean qui spécifie si le guichet est ouvert ou non **/
	private boolean bEstOuvert;
	
	/** Boolean qui spécifie si le guichet est ouvert ou non **/
	private boolean bEstOccupe;
	
	/** début de l'intervalle d'ouverture du guichet **/
	private int iDebutIntervalleOuverture;
	
	/** fin de l'intervalle d'ouverture du guichet **/
	private int iFinIntervalleOuverture;
	
	/** Client au guichet **/
	private Client cClient;
	
	/*
	 * Constructeur par défaut de la classe Guichet
	 */
	public Guichet() {
		this.bEstOuvert = false;
		this.bEstOccupe = false;
		this.iDebutIntervalleOuverture = 0;
		this.iFinIntervalleOuverture = 0;
		this.cClient = new Client();
	}
	
	/*
	 * Constructeur de la classe Guichet
	 * @param bEstOuvert ouverture ou non du guichet
	 * @param bEstOccupe occupation ou non du guichet
	 * @param iDebutIntervalleOuverture début de l'intervalle d'ouverture du guichet
	 * @param iFinIntervalleOuverture fin de l'intervalle d'ouverture du guichet
	 * @param cClient Client qui vient au guichet
	 */
	public Guichet(boolean bEstOuvert, boolean bEstOccupe, int iDebutIntervalleOuverture, int iFinIntervalleOuverture, Client client) {
		this.bEstOuvert = false;
		this.bEstOccupe = false;
		this.iDebutIntervalleOuverture = 0;
		this.iFinIntervalleOuverture = 0;
		this.cClient = new Client();
	}

	/*
	 * Acesseur sur le boolean d'ouverture du guichet
	 */
	public boolean getbEstOuvert() {
		return bEstOuvert;
	}

	/*
	 * Modificateur de la condition d'ouverture
	 * @param bEstOuvert nouveau boolean d'ouverture
	 */
	public void setbEstOuvert(boolean bEstOuvert) {
		this.bEstOuvert = bEstOuvert;
	}


	/*
	 * Acesseur sur le boolean d'occupation du guichet
	 */
	public boolean getbEstOccupe() {
		return bEstOccupe;
	}

	/*
	 * Modificateur de la condition d'occupation
	 * @param bEstOccupe nouveau boolean de fermeture
	 */
	public void setbEstOccupe(boolean bEstOccupe) {
		this.bEstOccupe = bEstOccupe;
	}

	/*
	 * Acesseur sur le début de l'intervalle d'ouverture
	 */
	public int getiDebutIntervalleOuverture() {
		return iDebutIntervalleOuverture;
	}

	/*
	 * Modificateur du début de l'intervalle d'ouverture
	 * @param iDebutIntervalleOuverture nouveau début
	 */
	public void setiDebutIntervalleOuverture(int iDebutIntervalleOuverture) {
		this.iDebutIntervalleOuverture = iDebutIntervalleOuverture;
	}

	/*
	 * Acesseur sur la fin de l'intervalle d'ouverture
	 */
	public int getiFinIntervalleOuverture() {
		return iFinIntervalleOuverture;
	}

	/*
	 * Modificateur du début de l'intervalle de fin d'ouverture
	 * @param iFinIntervalleOuverture nouvelle fin
	 */
	public void setiFinIntervalleOuverture(int iFinIntervalleOuverture) {
		this.iFinIntervalleOuverture = iFinIntervalleOuverture;
	}

	/*
	 * Acesseur sur le client du guichet
	 */
	public Client getcClient() {
		return cClient;
	}

	/*
	 * Modificateur sur le client
	 * @param cClient nouveau client
	 */
	public void setcClient(Client cClient) {
		this.cClient = cClient;
	}
	
	

}
