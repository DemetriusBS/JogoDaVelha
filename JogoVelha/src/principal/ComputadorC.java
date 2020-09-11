package principal;

import java.util.Random;

public class ComputadorC extends Computador {

	Random generator = new Random();

	public void jogar(Tabuleiro tabuleiro) {
		int linha;
		int coluna;
		saida: for (int i = 0; i < tabuleiro.matriz.length; i++) {
			for (int j = 0; j < tabuleiro.matriz.length; j++) {
				linha = generator.nextInt(3);
				coluna = generator.nextInt(3);

				if (tabuleiro.matriz[linha][coluna] == "-") {
					tabuleiro.matriz[linha][coluna] = "o";
					break saida;
				}
			}
		}
	}
}

/*
 * Implementa��o do computadorC que possui apenas um m�todo e este m�todo marca
 * uma bolinha "o" em uma posi��o aleat�ria da matriz
 */