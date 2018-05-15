package first.project.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import first.project.spring.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
