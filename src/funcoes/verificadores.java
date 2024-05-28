package funcoes;

import jogo_da_velha.programa;

public class verificadores {
    public static boolean verificarVitoria(char jogadorAtual) {
        // Verifica vitoria nas linhas
        for (int i = 0; i < 3; i++) {
            if (programa.tabuleiro[i][0] == jogadorAtual && programa.tabuleiro[i][1] == jogadorAtual && programa.tabuleiro[i][2] == jogadorAtual) {
                return true;
            }
        //Verifica vitoria nas colunas    
            if (programa.tabuleiro[0][i] == jogadorAtual && programa.tabuleiro[1][i] == jogadorAtual && programa.tabuleiro[2][i] == jogadorAtual) {
                return true;
            }
        }
        
        // Verifica vitoria nas diagonais
        if (programa.tabuleiro[0][0] == jogadorAtual && programa.tabuleiro[1][1] == jogadorAtual && programa.tabuleiro[2][2] == jogadorAtual) {
            return true;
        }
        
        if (programa.tabuleiro[0][2] == jogadorAtual && programa.tabuleiro[1][1] == jogadorAtual && programa.tabuleiro[2][0] == jogadorAtual) {
            return true;
        }
        return false;
    }
    
    public static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (programa.tabuleiro[i][j] == ' ') { // verifica se todos os indices estão prenchidos, já que para impate não deve haver mais campos vazios
                    return false; 
                }
            }
        }
        return true; // retorna verdadeiro se todos os campos estiverem preenchidos e nenhum dos jogadores estiverem ganhado o jogo
    }
    
    public static boolean posicaoValida(int l, int c, char j) { //Verifica se a posição é valida para a função jogar.
        if (l >= 0 && l < 3 && c >= 0 && c < 3 && programa.tabuleiro[l][c] == ' ') {
            return true;
        } else {
            return false;
        }
    }
}
