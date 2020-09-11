package principal;

public class ComputadorA extends Computador { // ComputadorA herda o m�todo do Computador

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
 * Implementa��o do computadorA que possui apenas um m�todo este m�todo faz o
 * computador marcar uma bolinha "o" na primeira posi��o livre dispon�vel
 */
