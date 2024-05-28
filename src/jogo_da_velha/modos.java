package jogo_da_velha;

import funcoes.jogo;
import funcoes.maquina;
import funcoes.verificadores;
import tabuleiro.campo;

public class modos {
	public static void modoJogador(char jogador, int pX, int pO) { // modoJogador que recebe 3 parametros, jogador (X ou O) e os pontos de X e O
		// Texto fora do While, para mostrar somente na primeira vez que iniciou código
    	System.out.printf("Você escolheu jogar contra outro Jogador!\n");
    	System.out.printf("QUE O JOGO COMEÇE!\n\n");
    	
		while(true) {
            if (pX == 3 || pO == 3) { // caso algum dos jogadores chegue a 3 pontos, o programa acaba
            	break;
            }
            
	        campo.imprimirTabuleiro(); // mostra tabuleiro
	        jogo.jogar(jogador); // jogador joga
	        
	        
	        if (verificadores.verificarVitoria(jogador)) { // verifica vitoria
	        	campo.imprimirTabuleiro();
	            System.out.println("\nJogador " + jogador + " venceu!");
	            
	            if (jogador == 'X') { // adiciona os pontos caso vitoria
	            	pX++;
	            	jogador = 'O'; // jogador que vence começa, está ao contrario pois combina com a verificação pra passar a vez
	            } else {
	            	pO++;
	            	jogador = 'X';
	            }
	            
	            jogo.imprimePontuacao(pX, pO); // imprime pontuação depois de vitoria
	            System.out.println("\nIniciando um novo jogo...\n");
	            campo.inicializarTabuleiro(); // reseta o tabuleiro
	        }
	        
	        if (verificadores.verificarEmpate()) { // verifica empate
	        	campo.imprimirTabuleiro();
	            System.out.println("\nO jogo empatou!");
	            System.out.println("\nIniciando um novo jogo...\n");
	            campo.inicializarTabuleiro(); // caso empate, reseta o tabuleiro
	        }
	        
	        // Verificação pra passar a vez
	        if (jogador == 'X') {
	        	jogador = 'O';
	            
	        } else {
	        	jogador = 'X';
	        }
		}
	}
	
	public static void modoFacil(char jogador, int pX, int pO) {
		while(true) {
            if (pX == 3 || pO == 3) { // caso algum dos jogadores chegue a 3 pontos, o programa acaba
            	break;
            }
			
	        campo.imprimirTabuleiro();
	        
            if (jogador == 'X') { 
                jogo.jogar(jogador);
            } else {
                maquina.jogadaMaquinaFacil(jogador);
            }
	        
	        if (verificadores.verificarVitoria(jogador)) {
	        	campo.imprimirTabuleiro();
	            System.out.println("\nJogador " + jogador + " venceu!");
	            
	            if (jogador == 'X') {
	            	pX++;
	            	jogador = 'O'; // jogador que vence começa, está ao contrario pois combina com a verificação pra passar a vez
	            } else {
	            	pO++;
	            	jogador = 'X';
	            }
	             
	            jogo.imprimePontuacao(pX, pO); // imprime pontuação depois de vitoria
	            
	            System.out.println("\nIniciando um novo jogo...\n");
	            campo.inicializarTabuleiro();
	            
	        }
	        
	        if (verificadores.verificarEmpate()) { // verifica empate
	        	campo.imprimirTabuleiro();
	            System.out.println("\nO jogo empatou!");
	            System.out.println("\nIniciando um novo jogo...\n");
	            campo.inicializarTabuleiro();
	        }
	        
	        // Verificação pra passar a vez
	        if (jogador == 'X') {
	        	jogador = 'O';
	            
	        } else {
	        	jogador = 'X';
	        }
		}
	}
	
	public static void modoDificil(char jogador, int pX, int pO) {
		while(true) {
            if (pX == 3 || pO == 3) { // caso algum dos jogadores chegue a 3 pontos, o programa acaba.
            	break;
            }
            
	        campo.imprimirTabuleiro();
	        
            if (jogador == 'X') {
                jogo.jogar(jogador);
            } else {
                maquina.jogadaMaquinaDificil(jogador);
            }
	        
	        if (verificadores.verificarVitoria(jogador)) {
	        	campo.imprimirTabuleiro();
	            System.out.println("\nJogador " + jogador + " venceu!");
	            
	            if (jogador == 'X') {
	            	pX++;
	            	jogador = 'O'; // jogador que vence começa, está ao contrario pois combina com a verificação pra passar a vez
	            } else {
	            	pO++;
	            	jogador = 'X';
	            }
	            
	            jogo.imprimePontuacao(pX, pO); // imprime pontuação depois de vitoria
	            
	            System.out.println("\nIniciando um novo jogo...\n");
	            campo.inicializarTabuleiro(); 
	        }
	        
	        if (verificadores.verificarEmpate()) {
	        	campo.imprimirTabuleiro();
	            System.out.println("\nO jogo empatou!");
	            System.out.println("\nIniciando um novo jogo...\n");
	            campo.inicializarTabuleiro();
	        }
	        
	        // Verificação pra passar a vez
	        if (jogador == 'X') {
	        	jogador = 'O';
	            
	        } else {
	        	jogador = 'X';
	        }
		}
	}
}
