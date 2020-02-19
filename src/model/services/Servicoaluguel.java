package model.services;

import model.entities.Carroaluguel;
import model.entities.Notapagamento;

public class Servicoaluguel {

	private Double precodia;
	private Double precohora;

	private Taxa taxaservico;

	public Servicoaluguel(Double precodia, Double precohora, Taxa taxaservico) {
		this.precodia = precodia;
		this.precohora = precohora;
		this.taxaservico = 	taxaservico;
	}
     
	public void ProcessoNotapagamento (Carroaluguel carroaluguel) {
		long t1 = carroaluguel.getInicio().getTime();
		long t2 = carroaluguel.getFim().getTime();
		double horas = (double)(t2 - t1)/1000/60/60;

		double pagbasico;
		if (horas <= 12.0) {
		   pagbasico = Math.ceil(horas)*precohora;
		}
		else {
		   pagbasico = Math.ceil(horas/24)*precodia;
		}
		
		double imposto = taxaservico.imposto(pagbasico);

		carroaluguel.setNotapagamento(new Notapagamento(pagbasico, imposto));


	}

	
	
	
}
