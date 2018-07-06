package ci.toget.entites;

import javax.persistence.*;

@Embeddable
public class Adresses {
	private String numero;
	private String email;
	public Adresses() {
		super();
		
	}
	public Adresses(String numero, String email) {
		super();
		this.numero = numero;
		this.email = email;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Adresses [numero=" + numero + ", email=" + email + "]";
	}
	
	
}
