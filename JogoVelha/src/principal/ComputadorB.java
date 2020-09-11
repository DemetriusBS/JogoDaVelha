package principal;

public class ComputadorB extends Computador {
	public void jogar(Tabuleiro tabuleiro) {
		saida: for (int i = 0; i < tabuleiro.matriz.length; i++) {
			for (int j = 0; j < tabuleiro.matriz.length; j++) {
				if (tabuleiro.matriz[i][j] == "x") {
					if ((i == 0 || i == 1 || i == 2) && j == 2) {
						if (tabuleiro.matriz[i][1] == "-") {
							tabuleiro.matriz[i][1] = "o";
							break saida;
						}
					} else if ((i == 0 || i == 1 || i == 2) && j == 0) {
						if (tabuleiro.matriz[i][1] == "-") {
							tabuleiro.matriz[i][1] = "o";
							break saida;
						}
					} else if ((i == 0 || i == 1 || i == 2) && j == 1) {
						if (tabuleiro.matriz[i][2] == "-") {
							tabuleiro.matriz[i][2] = "o";
						} else if (tabuleiro.matriz[i][0] == "-") {
							tabuleiro.matriz[i][0] = "o";
						}
						break saida;
					}
				}
			}
		}
	}
}

/*
 * Implementação do computadorB, este computador possui apenas um método e este
 * método marca uma bolinha "o" ao lado de onde o jogador jogou
 */
