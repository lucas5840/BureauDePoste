package classes;

/**
 * Classe qui repr�sente un service pour lequel le client va au bureau de poste
 * @author Lucas Mayran
 * @version 1.0
 */
public class Service {
	
	/** nom du service **/
    private String sNom;
	
	/** Temps que prend le service � se faire au guichet **/
	private int iTemps;
	
	/*
	 * Constructeur par d�faut de la classe Service
	 */
	public Service() {
		this.sNom = "";
		this.iTemps = 0;
	}
	
	/*
	 * Constructeur de la classe Service
	 * @param nomService Nom du service
	 * @param temps Temps que dure le service
	 * @return un boolean true si c'est bon ( a mettre uniquemement si il y � un type de retour )
	 */
	public Service(String nom, int temps) {
		this.sNom = nom;
		this.iTemps = temps;
	}

	/*
	 * Acesseur sur le nom
	 */
	public String getsNom() {
		return sNom;
	}

	/*
	 * Modificateur du nom
	 * @param sNom Nom du service
	 */
	public void setsNom(String sNom) {
		this.sNom = sNom;
	}

	/*
	 * Acesseur sur le temps
	 */
	public int getiTemps() {
		return iTemps;
	}

	/*
	 * Modificateur sur le temps
	 * @param iTemps temps de dur�e
	 */
	public void setiTemps(int iTemps) {
		this.iTemps = iTemps;
	}
}
