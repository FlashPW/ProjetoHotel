package Modelos;

import java.util.Date;

public class QuartoReservado extends Quarto {

	private Date dhReserva;
	private Date validade;
	
	public Date getDhEntrada() {
		return dhReserva;
	}
	public void setDhEntrada(Date dhReserva) {
		this.dhReserva = dhReserva;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
}
