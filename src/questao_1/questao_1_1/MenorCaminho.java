package questao_1.questao_1_1;

public class MenorCaminho {

	static String menorCaminho(int matriz[][]) {
		String textoSoma = "";
		int menor, soma = 0;
		for (int i = 0; i < 4; i++) {
			menor = matriz[i][0]; // Foi considera que o menor sera sempre o primeiro elemento da linha
			for (int j = 0; j <= i; j++) // O 'j' só vai até o 'i' por se tratar de uma matriz triangular inferior
											// esquerda
			{
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
			}
			textoSoma += menor + " + ";
			soma += menor;
		}

		textoSoma = textoSoma.substring(0, textoSoma.length() - 3);
		String result = textoSoma + " = " + soma;
		return result;
	}

	public static void main(String[] args) {

		int matriz[][] = { { 4 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } };
		
		System.out.println(MenorCaminho.menorCaminho(matriz));
	}

}
