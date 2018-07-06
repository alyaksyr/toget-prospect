package ci.toget.entites;

import javax.persistence.*;

@Entity /* Une entité de la base de donnée */
public class Clients extends Personnes {
	
	@ManyToOne
	@JoinColumn(name="id_entreprise")
	private Entreprises entreprise;

	public Clients() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clients(Entreprises entreprise) {
		super();
		this.entreprise = entreprise;
	}

	public Clients(String nom, String prenom) {
		super(nom, prenom);
	}

	public Entreprises getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprises entreprise) {
		this.entreprise = entreprise;
	}
	
	
}
