package ci.toget.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.toget.entites.Clients;

public interface ClientRepository extends JpaRepository<Clients, Long> {

}
