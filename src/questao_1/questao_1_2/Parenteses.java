package questao_1.questao_1_2;

import java.util.Scanner;

public class Parenteses {

	static int contador(String texto, char operador) {
		int quantidade = 0;

		char[] t = texto.toCharArray(); // Passo a string pra um vetor de char pra facilitar a manipulação
		for (int i = 0; i < texto.length(); i++) {
			if (t[i] == operador) {
				quantidade++;
			}
		}
		return quantidade;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Informe a sentença aritimética: ");
		String string = s.next();

		int quantParenteseAberto = Parenteses.contador(string, '(');
		int quantParenteseFechado = Parenteses.contador(string, ')');
		int quantColcheteAberto = Parenteses.contador(string, '[');
		int quantColcheteFechado = Parenteses.contador(string, ']');
		int quantChavesAberto = Parenteses.contador(string, '{');
		int quantChavesFechado = Parenteses.contador(string, '}');

		if ((quantParenteseAberto == quantParenteseFechado) && (quantColcheteAberto == quantColcheteFechado)
				&& (quantChavesAberto == quantChavesFechado)) {
			System.out.println("Sentença válida!");
		} else {
			System.out.println("Sentença inválida!");
		}
		s.close();

	}
}
