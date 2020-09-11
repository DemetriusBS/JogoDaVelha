package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(); // Instanciando um objeto tabuleiro
		Jogador jogador = new Jogador(); // Instanciando um objeto jogador

		Scanner scan = new Scanner(System.in);
		System.out.println("Bem vindo(a) ao jogo da velha!");
		System.out.println("Para começar-mos, selecione o nível do seu oponente. As opções são: 1, 2 e 3");
		int opcao = scan.nextInt();

		do {
			if (opcao < 1 || opcao > 3) { // Validação da opção escolhida pelo usuário
				System.out.println("Atenção, opção inválida! As opções são 1, 2 e 3.");
				System.out.println("Por favor, selecione o nível do seu oponente: ");
				opcao = scan.nextInt();
			}
		} while (opcao < 1 || opcao > 3);

		tabuleiro.popularMatriz(); // Chamada do método para popular a matriz

		Computador computador = null;

		if (opcao == 1) { // Aqui ocorre a instanciação do computador de acordo com a opção selecionada
			// pelo usuário
			computador = new ComputadorA();
		} else if (opcao == 2) {
			computador = new ComputadorB();
		} else if (opcao == 3) {
			computador = new ComputadorC();
		} else {
			System.out.println("Digite uma opção válida!");
		}

		int vez = 1; // Fazendo com que o usuário sempre começe jogando
		tabuleiro.visualizar();

		while (tabuleiro.situacao() == 3) {
			if (vez == 1) {
				jogador.jogar(tabuleiro); // Método para o jogador jogar
				vez = 2; // Passando a vez para o jogador
			} else if (vez == 2) {
				System.out.println("Vez do computador!");
				computador.jogar(tabuleiro);
				vez = 1;// Passando a vez para o usuário
			}

			tabuleiro.visualizar();
		}

		if (tabuleiro.situacao() == 1) { // Mensagem para o vencedor ou em caso de empate
			System.out.println("Parabéns, você venceu o jogo!");
		} else if (tabuleiro.situacao() == 2) {
			System.out.println("O computador venceu o jogo!");
		} else {
			System.out.println("A partida terminou em empate!");
		}
	}

}
