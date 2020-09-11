package principal;

public class ComputadorA extends Computador { // ComputadorA herda o método do Computador

	public void jogar(Tabuleiro tabuleiro) {
		saida: for (int i = 0; i < tabuleiro.matriz.length; i++) {
			for (int j = 0; j < tabuleiro.matriz.length; j++) {
				if (tabuleiro.matriz[i][j] == "-") {
					tabuleiro.matriz[i][j] = "o";
					break saida;
				}
			}
		}
	}
}

/*
 * Implementação do computadorA que possui apenas um método este método faz o
 * computador marcar uma bolinha "o" na primeira posição livre disponível
 */
