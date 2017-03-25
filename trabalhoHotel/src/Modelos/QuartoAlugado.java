package Modelos;

import java.util.Date;

public class QuartoAlugado extends Quarto{

	private Date dhEntrada;
	private Date dhSaida;
	private int qtdeDiarias;
	
	public Date getDhEntrada() {
		return dhEntrada;
	}
	public void setDhEntrada(Date dhEntrada) {
		this.dhEntrada = dhEntrada;
	}
	public Date getDhSaida() {
		return dhSaida;
	}
	public void setDhSaida(Date dhSaida) {
		this.dhSaida = dhSaida;
	}
	public int getQtdeDiarias() {
		return qtdeDiarias;
	}
	public void setQtdeDiarias(int qtdeDiarias) {
		this.qtdeDiarias = qtdeDiarias;
	}
	
}
