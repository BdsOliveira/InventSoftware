package questao_5;

public class Montante {

	// Resolução da questão 5.1
	static double obtenhaMontante(double capitalInicial, double taxaJuro, double prazo) {
		double juros = 1;
		for (int i = 0; i < prazo; i++) {
			juros = juros * (1 + taxaJuro);
		}
		return capitalInicial * juros; 
	}
	
	// Resolução da questão 5.1
	static double obtenhaJuroToral(double montante, double capitalInicial) {
		return montante - capitalInicial;
	}
	
	public static void main(String[] args) {
		
		double capitalInicial, taxaJuro, prazo;
		
		capitalInicial = 10000;
		taxaJuro = 3.0 / 100;
		prazo = 3;
		
		double montante = obtenhaMontante(capitalInicial, taxaJuro, prazo);
		double juroTotal = obtenhaJuroToral(montante, capitalInicial);
		
		System.out.println("Questão 5.2:\n\tMontante: " + montante);
		System.out.println("Questão 5.4:\n\tJuro Total: " + juroTotal);
		
	}

}