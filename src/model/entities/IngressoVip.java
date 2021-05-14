package model.entities;

public class IngressoVip extends Ingresso {

	private Double valorAdc;

	public IngressoVip(Double valor, Double valorAdc) {
		super(valor);
		this.valorAdc = valorAdc;
	}

	public Double getValorAdc() {
		return valorAdc;
	}

	public void setValorAdc(Double valorAdc) {
		this.valorAdc = valorAdc;
	}
	
	public Double totalValue() {
		return valorAdc + getValor();
	}
	
	public void imprimeIngressoVip(Double valor) {
		double valorIngressoVip = valorAdc + valor;
		System.out.println("O valor do ingresso vip é: " + valorIngressoVip);
	}

	@Override
	public String toString() {
		return "IngressoVip [ R$ " + totalValue() +" ]";
	}

}
