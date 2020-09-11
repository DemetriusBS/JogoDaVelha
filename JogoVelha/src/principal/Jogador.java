package principal;

import java.util.Scanner;

public class Jogador {

	public void jogar(Tabuleiro tabuleiro) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Pediremos que informe a linha e coluna que deseja jogar.");
		System.out.println("Lembrando que tanto a linha quanto a coluna começam em 0 e terminam em 2.");
		System.out.println("Por favor, informe a linha desejada: ");
		int linha = scan.nextInt();
		System.out.println("Agora informe a coluna: ");
		int coluna = scan.nextInt();

		do {
			if (tabuleiro.matriz[linha][coluna].equalsIgnoreCase("x")
					|| tabuleiro.matriz[linha][coluna].equalsIgnoreCase("o")) { // Garantindo que a posição escolhida
				// pelo
				// usuário não esteja ocupada
				System.out.println("O espaço desejado já está ocupado, por favor tente outra vez.");
				System.out.println("Por favor, informe a linha desejada: ");
				linha = scan.nextInt();
				System.out.println("Agora informe a coluna: ");
				coluna = scan.nextInt();
			}
		} while (tabuleiro.matriz[linha][coluna].equalsIgnoreCase("x")
				|| tabuleiro.matriz[linha][coluna].equalsIgnoreCase("o"));

		tabuleiro.matriz[linha][coluna] = "x";

	}

}
