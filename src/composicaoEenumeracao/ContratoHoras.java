package composicaoEenumeracao;

import java.util.Date;

public class ContratoHoras {
	
	private Date data;
	private Double valorPorHora;
	private Integer totalDeHoras;
	
	public ContratoHoras() {
		
	}

	public ContratoHoras(Date data, Double valorPorHora, Integer totalHoras) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.totalDeHoras = totalHoras;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getPorHora() {
		return valorPorHora;
	}

	public void setPorHora(Double porHora) {
		this.valorPorHora = porHora;
	}

	public Integer getTotalHoras() {
		return totalDeHoras;
	}

	public void setTotalHoras(Integer totalHoras) {
		this.totalDeHoras = totalHoras;
	}
	
	public Double valorTotal() {
		
		return valorPorHora * totalDeHoras;		
	
	}
	

}
