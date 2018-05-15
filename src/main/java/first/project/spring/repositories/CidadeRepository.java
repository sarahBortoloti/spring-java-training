package first.project.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import first.project.spring.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
