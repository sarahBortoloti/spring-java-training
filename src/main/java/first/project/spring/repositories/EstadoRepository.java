package first.project.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import first.project.spring.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
