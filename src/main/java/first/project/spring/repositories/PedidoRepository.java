package first.project.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import first.project.spring.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
