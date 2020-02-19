package model.entities;

public class Notapagamento {

	private Double pagbasico;
	private Double tributo;

	public Notapagamento() {
	}

	public Notapagamento(Double pagbasico, Double tributo) {
		this.pagbasico = pagbasico;
		this.tributo = tributo;
	}

	public Double getPagbasico() {
		return pagbasico;
	}

	public void setPagbasico(Double pagbasico) {
		this.pagbasico = pagbasico;
	}

	public Double getTributo() {
		return tributo;
	}

	public void setTributo(Double tributo) {
		this.tributo = tributo;
	}

	public Double getPagtotal() {
	    return getPagbasico() + getTributo();
	}

	
	
	
	
	
	
}
