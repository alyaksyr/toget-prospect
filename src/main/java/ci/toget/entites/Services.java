package ci.toget.entites;

import javax.persistence.Entity;

@Entity
public class Services extends AbstractEntity{
	
	private String libelle;
	private String description;
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Services(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
