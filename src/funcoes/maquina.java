package funcoes;

import java.util.Random;

import jogo_da_velha.programa;

public class maquina {
    public static void jogadaMaquinaFacil(char jogadorAtual) { // implementação do modo facil, somente gerando um random inteiro e escolhendo um lugar vazio
        Random rand = new Random(); // instancia o Random
        int linha, coluna; 
        while (true) { 
            linha = rand.nextInt(3); // Seleciona 2 números aleatorios de 0 e 2 
            coluna = rand.nextInt(3); // Seleciona 2 números aleatorios de 0 e 2
            if (programa.tabuleiro[linha][coluna] == ' ') {
            	programa.tabuleiro[linha][coluna] = jogadorAtual; // joga se a coluna e linha estiverem vazias ' '
                break;
            }
        }
        System.out.println("Máquina fez sua jogada na posição: (" + linha + ", " + coluna + ")");
    }
    
    public static void jogadaMaquinaDificil(char jogadorAtual) {
		// verifica se pode vencer uma jogada
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (programa.tabuleiro[i][j] == ' ') { // Verifica se a celula está vazia
                	programa.tabuleiro[i][j] = jogadorAtual; 
                    if (verificadores.verificarVitoria(jogadorAtual)) { // loop percorre todos os indices do tabuleiro para ver se tem chance de vitoria
                    	System.out.println("Máquina fez sua jogada na posição: (" + i + ", " + j + ")"); 
                        return; // encerra a função caso a chance de vitoria foi encontrada.
                    } else {
                    	programa.tabuleiro[i][j] = ' '; // Caso não ache chance de vitoria pule para o proximo, até chegar na ultima execução e colocar no indice aleatorio
                    }
                }
            }
        }

        // Verifica se pode bloquear o adversário
        char adversario;
        if (jogadorAtual == 'X') { // sempre que meu jogador atual foi um, o adversário será outro
            adversario = 'O';
        } else {
            adversario = 'X';
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (programa.tabuleiro[i][j] == ' ') { // Verifica se a celula está vazia
                	programa.tabuleiro[i][j] = adversario; // simula uma jogada do jogador
                    if (verificadores.verificarVitoria(adversario)) { // verifica se a vitoria aconteceu
                    	programa.tabuleiro[i][j] = jogadorAtual; // caso a vitoria acontecesse preencha com o 'O'
                    	System.out.println("Máquina fez sua jogada na posição: (" + i + ", " + j + ")");
                        return;
                    } else {
                    	programa.tabuleiro[i][j] = ' '; // Caso não ache chance de bloqueio pule para o proximo, até chegar na ultima execução e colocar no indice aleatorio
                    }
                }
            }
        }

        // Faz uma jogada aleatória
        jogadaMaquinaFacil(jogadorAtual);

    }
}
