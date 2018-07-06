package ci.toget;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ci.toget.entites.Personnes;

@SpringBootApplication
public class TogetProspectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TogetProspectApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		Personnes client = new Personnes("Yao", "Kouame");
		System.out.println("client:"+client);
		
	}
}
