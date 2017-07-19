package questao_1.questao_1_3;

import java.util.Scanner;

public class ConverteString {

	static int converte(String texto) {

		// Solu��o para uma entrada com espa�os em branco.
		texto = texto.replace(" ", "");
		
		// Solu��o para uma entrada vazia ou nula.
		if (texto.isEmpty()) {
			return 0;
		}
		
		// Solu��o para uma entrada que estoura inteiro ou real
		try {
			return Integer.parseInt(texto);
		} catch (Exception e) {
			System.err.println("Tamanho incompativel para inteiro!");
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Informe a entrada: ");
		String entrada = s.nextLine();
		System.out.println(ConverteString.converte(entrada));

		s.close();
	}

}
