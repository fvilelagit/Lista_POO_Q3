package model.entities;

public class Ingresso {

	private Double valor;

	public Ingresso(Double valor) {
		super();
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void imprimirValor(double valor) {
		System.out.println("R$ "+ valor);
		
	}

	@Override
	public String toString() {
		return "Ingresso Normal[ R$ " + valor + " ]";
	}
	
}
