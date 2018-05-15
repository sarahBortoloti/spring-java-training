package first.project.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import first.project.spring.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
