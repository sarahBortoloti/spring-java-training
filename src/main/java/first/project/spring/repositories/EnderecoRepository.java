package first.project.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import first.project.spring.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}
