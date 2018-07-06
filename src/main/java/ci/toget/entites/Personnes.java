package ci.toget.entites;

import javax.persistence.*;

@MappedSuperclass
public class Personnes extends AbstractEntity {
	
	private String nom;
	private String prenom;
	@Embedded
	private Adresses adresse;
	public Personnes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personnes(String nom, String prenom, Adresses adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public Personnes(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Adresses getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresses adresse) {
		this.adresse = adresse;
	}
	
	
	
}
