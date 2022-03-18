package ma.education.tp1.introduction;

public class Salle {

	public long id;
	public String nom;
	
	 // UN CONSTRUCTEUR SANS PARAMETRE

	 public Salle() {
	 }
	 
	 // UN CONSTRUCTEUR POUR LE NOM DE LA SALLE 

	 public Salle(String nom) {
		 this.nom = nom;
	 }
	 											
	 // UN CONSTRUCTEUR POUR L'ID ET LE NOM DE LA SALLE 
	 
	 public Salle(String nom ,long id) {
		 this.id = id;
		 this.nom = nom; 
	 }
}
