package tabuleiro;

import jogo_da_velha.programa;

public class campo {
	// função que inicia o tabuleiro, percorrendo ele todo deixando com espaços vazios.
    public static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                programa.tabuleiro[i][j] = ' ';
            }
        }
    }
    
    // função que mostra o tabuleiro, gostamos do design, ficou bem visual
    public static void imprimirTabuleiro() {
        System.out.println(" " + programa.tabuleiro[0][0] + " | " + programa.tabuleiro[0][1] + " | " + programa.tabuleiro[0][2] + " ");
        System.out.println("---|---|---");
        System.out.println(" " + programa.tabuleiro[1][0] + " | " + programa.tabuleiro[1][1] + " | " + programa.tabuleiro[1][2] + " ");
        System.out.println("---|---|---");
        System.out.println(" " + programa.tabuleiro[2][0] + " | " + programa.tabuleiro[2][1] + " | " + programa.tabuleiro[2][2] + " ");
    }
}
