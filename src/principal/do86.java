package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Carroaluguel;
import model.entities.Veiculo;
import model.services.Servicoaluguel;
import model.services.Taxaservico;

public class do86 {

	public static void main(String[] args) throws ParseException {
	
		    // SOLUÇÃO COM INTERFACE
				
		    /*
    		Digite a data da locação:
			Modelo de carro: Civic
			Entrega (dd/MM/yyyy hh:ss) : 15/06/2018 10:30
			Retorno (dd/MM/yyyy hh:ss) : 15/06/2018 14:40
			Digite o preço por hora: 10.00
			Digite o preço por dia: 130.00
			Nota de Pagamento:
			Pagamento base: 50.00
			Tributo: 10.00
			Pagamento total: 60.00
         
         		    
    		Digite a data da locação:
			Modelo de carro: Civic
			Entrega (dd/MM/yyyy hh:ss) : 25/06/2018 10:30
			Retorno (dd/MM/yyyy hh:ss) : 27/06/2018 11:40
			Digite o preço por hora: 10.00
			Digite o preço por dia: 130.00
			Nota de Pagamento:
			Pagamento base: 390.00
			Tributo: 58.50
			Pagamento total: 448.50
            */
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss"); 

		System.out.println("Entre com a data de Locação");
		System.out.println("Modelo de carro: ");
		String carroModelo = sc.nextLine();
		System.out.println("Recebimento (dd/MM/yyyy hh:ss): ");
		Date inicio = sdf.parse(sc.nextLine());
		System.out.println("Retorno (dd/MM/yyyy hh:ss): ");
		Date fim = sdf.parse(sc.nextLine());

		Carroaluguel ca = new Carroaluguel(inicio, fim, new Veiculo(carroModelo));

		System.out.println("Digite preço por hora: ");
		double precohora = sc.nextDouble();
		System.out.println("Digite preço por dia: ");
		double precodia = sc.nextDouble();

		Servicoaluguel servicoaluguel = new Servicoaluguel(precodia, precohora, new Taxaservico());

		servicoaluguel.ProcessoNotapagamento(ca);
		System.out.println("Nota de pagamento: ");
		System.out.println("Pagamento base: " + String.format("%.2f", ca.getNotapagamento().getPagbasico()));
		System.out.println("Imposto: " + String.format("%.2f", ca.getNotapagamento().getTributo()));
		System.out.println("Pagamento total: " + String.format("%.2f", ca.getNotapagamento().getPagtotal()));


		sc.close();
		
		
	}

	
}
