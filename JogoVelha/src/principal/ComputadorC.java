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
 * Implementação do computadorC que possui apenas um método e este método marca
 * uma bolinha "o" em uma posição aleatória da matriz
 */