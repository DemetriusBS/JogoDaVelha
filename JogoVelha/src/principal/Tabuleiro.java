package principal;

public class Tabuleiro {
	public String matriz[][] = new String[3][3];

	public void visualizar() { // Visualização da matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == "x") {
					System.out.print("X ");
				} else if (matriz[i][j] == "o") {
					System.out.print("O ");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public void popularMatriz() {// Método para popular a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = "-";
			}
		}
	}

	public int situacao() { // Verificação de situação de jogo: empate, vitória do computador ou vitória do
		// jogador
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				if (matriz[i][j].equalsIgnoreCase("-")) {
					return 3;
				}
				if (matriz[0][0].equalsIgnoreCase("x") && matriz[0][1].equalsIgnoreCase("x")
						&& matriz[0][2].equalsIgnoreCase("x")) {
					return 1;
				} else if (matriz[1][0].equalsIgnoreCase("x") && matriz[1][1].equalsIgnoreCase("x")
						&& matriz[1][2].equalsIgnoreCase("x")) {
					return 1;
				} else if (matriz[2][0].equalsIgnoreCase("x") && matriz[2][1].equalsIgnoreCase("x")
						&& matriz[2][2].equalsIgnoreCase("x")) {
					return 1;
				} else if (matriz[0][0].equalsIgnoreCase("x") && matriz[1][0].equalsIgnoreCase("x")
						&& matriz[2][0].equalsIgnoreCase("x")) {
					return 1;
				} else if (matriz[0][1].equalsIgnoreCase("x") && matriz[1][1].equalsIgnoreCase("x")
						&& matriz[2][1].equalsIgnoreCase("x")) {
					return 1;
				} else if (matriz[0][2].equalsIgnoreCase("x") && matriz[1][2].equalsIgnoreCase("x")
						&& matriz[2][2].equalsIgnoreCase("x")) {
					return 1;
				} else if (matriz[0][0].equalsIgnoreCase("x") && matriz[1][1].equalsIgnoreCase("x")
						&& matriz[2][2].equalsIgnoreCase("x")) {
					return 1;
				} else if (matriz[0][2].equalsIgnoreCase("x") && matriz[1][1].equalsIgnoreCase("x")
						&& matriz[2][0].equalsIgnoreCase("x")) {
					return 1;
				} else if (matriz[0][0].equalsIgnoreCase("o") && matriz[0][1].equalsIgnoreCase("o")
						&& matriz[0][2].equalsIgnoreCase("o")) {
					return 2;
				} else if (matriz[1][0].equalsIgnoreCase("o") && matriz[1][1].equalsIgnoreCase("o")
						&& matriz[1][2].equalsIgnoreCase("o")) {
					return 2;
				} else if (matriz[2][0].equalsIgnoreCase("o") && matriz[2][1].equalsIgnoreCase("o")
						&& matriz[2][2].equalsIgnoreCase("o")) {
					return 2;
				} else if (matriz[0][0].equalsIgnoreCase("o") && matriz[1][0].equalsIgnoreCase("o")
						&& matriz[2][0].equalsIgnoreCase("o")) {
					return 2;
				} else if (matriz[0][1].equalsIgnoreCase("o") && matriz[1][1].equalsIgnoreCase("o")
						&& matriz[2][1].equalsIgnoreCase("o")) {
					return 2;
				} else if (matriz[0][2].equalsIgnoreCase("o") && matriz[1][2].equalsIgnoreCase("o")
						&& matriz[2][2].equalsIgnoreCase("o")) {
					return 2;
				} else if (matriz[0][0].equalsIgnoreCase("o") && matriz[1][1].equalsIgnoreCase("o")
						&& matriz[2][2].equalsIgnoreCase("o")) {
					return 2;
				} else if (matriz[0][2].equalsIgnoreCase("o") && matriz[1][1].equalsIgnoreCase("o")
						&& matriz[2][0].equalsIgnoreCase("o")) {
					return 2;
				}
			}
		}
		return 4;
	}
}
