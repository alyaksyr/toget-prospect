package ci.toget.entites;

import javax.persistence.Entity;

@Entity
public class Entreprises extends AbstractEntity{
	private String label;
	private Adresses localisation;
	public Entreprises() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entreprises(String label, Adresses localisation) {
		super();
		this.label = label;
		this.localisation = localisation;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Adresses getLocalisation() {
		return localisation;
	}
	public void setLocalisation(Adresses localisation) {
		this.localisation = localisation;
	}
	
}
