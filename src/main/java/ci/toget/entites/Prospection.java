package ci.toget.entites;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Prospection extends AbstractEntity{
	private LocalDate date;
	private String commentaire;
	private String etat;

	public Prospection(LocalDate date, String commentaire, String etat) {
		super();
		this.date = date;
		this.commentaire = commentaire;
		this.etat = etat;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	
}
