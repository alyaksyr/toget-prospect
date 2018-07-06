package ci.toget.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.toget.entites.Prospects;

public interface ProspectsRepository extends JpaRepository<Prospects, Long> {

}
