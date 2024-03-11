package entities;

import java.util.Date;

public class HoraContrato {
	
	private Date date;
	private Double valorPorHora;
	private Integer hora;
	
	public HoraContrato() {
		
	}

	public HoraContrato(Date date, Double valorPorHora, Integer hora) {
		this.date = date;
		this.valorPorHora = valorPorHora;
		this.hora = hora;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public double valorTotal() {
		return valorPorHora * hora;
	}
}
//quem e a classe que tem que saber o valor total de um contrato tem que ser a propria classe HoraContrato