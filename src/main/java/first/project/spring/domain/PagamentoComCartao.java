package first.project.spring.domain;

import javax.persistence.Entity;

import first.project.spring.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	
	private static final long serialVersionUID = 1L;
	private Integer numeroDeParcelas;

	public PagamentoComCartao() {}
	
	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer parcelas) {
		super(id, estado, pedido); 
		this.numeroDeParcelas = parcelas;
	}
	
	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	
	
	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	

}
