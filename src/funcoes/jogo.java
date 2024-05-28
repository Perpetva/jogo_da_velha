package funcoes;

import jogo_da_velha.programa;

import java.util.Scanner;
	public class jogo {
	    public static void jogar(char jogadorAtual) {
	        Scanner sc = new Scanner(System.in);
	        
	        while (true) { // while recebe true, não tem como sair do controle pois caso a posição seja valida, a verificação recebe break
	        	
	            System.out.println("Jogador " + jogadorAtual + ", insira sua jogada (linha e coluna): ");
	            
	            // chamada função para ler coordenadas e alocadas em variavies
	            int linha = leia.leiaCoordenadaLinha();
	            int coluna = leia.leiaCoordenadaColuna(); 
	            
	            // verifica se a posição é valida, se sim preenxe com o X ou O, depende de qual jogador está jogando
	            if (verificadores.posicaoValida(linha, coluna, jogadorAtual)) {
	            	programa.tabuleiro[linha][coluna] = jogadorAtual;
	            	break;
	            	
	            } else {
	            	System.out.println("Esta jogada não é válida. Tente novamente."); // Caso posição invalida, exibe a mensagem e pede as coordenadas novamente
	            }
	        } 
	    }
	    
	    // função que imprime os pontos
	    public static void imprimePontuacao(int pontosX, int pontosO) {
            System.out.printf("O placar é X=%d a O=%d", pontosX, pontosO);
	    }
}
