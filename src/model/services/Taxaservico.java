package model.services;

public class Taxaservico implements Taxa {

	public double imposto(double quantidade) {
		if (quantidade <= 100.0) {
			return quantidade * 0.2;
		} else {
			return quantidade * 0.15;
		}

	}

}
