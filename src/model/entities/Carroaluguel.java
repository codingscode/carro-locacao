package model.entities;

import java.util.Date;

public class Carroaluguel {

	private Date inicio;
	private Date fim;

	private Veiculo veiculo;
	private Notapagamento notapagamento;

	public Carroaluguel() {
	}

	public Carroaluguel(Date inicio, Date fim, Veiculo veiculo) {
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Notapagamento getNotapagamento() {
		return notapagamento;
	}

	public void setNotapagamento(Notapagamento notapagamento) {
		this.notapagamento = notapagamento;
	}

	
	
	
	
}
