package funcoes;

import java.util.Scanner;

public class menu {
	// Função do menu
	public static int imprimeMenuPrincipal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vindo ao jogo da velha\n"
						 + "Escolha o adversário abaixo:\n"
						 + "1 - Jogador vs Jogador\n"
						 + "2 - Jogador vs Maquina");

		int escolha = sc.nextInt(); // sem verificação se a pessoa digitar uma letra, o programa quebra
		while (escolha != 1 && escolha != 2) { // loop caso o inteiro seja diferente de 1 ou 2
			System.out.println("Você digitou algo diferente de 1 ou 2, tente novamente.");
			escolha = sc.nextInt();
		}
		
		return escolha;
	}
}
