package ci.toget.entites;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Prospects extends Personnes {
	
	@ManyToOne
	@JoinColumn(name="id_entreprise")
	private Entreprises entreprise;
	private Boolean recontacter;
	
	public Prospects(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}

	public Prospects(Entreprises entreprise, Boolean recontacter) {
		super();
		this.entreprise = entreprise;
		this.recontacter = recontacter;
	}

	public Entreprises getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprises entreprise) {
		this.entreprise = entreprise;
	}

	public Boolean getRecontacter() {
		return recontacter;
	}

	public void setRecontacter(Boolean recontacter) {
		this.recontacter = recontacter;
	}
	
	
	
	
}
