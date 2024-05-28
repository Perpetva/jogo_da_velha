/*********************************************************************/
/** Centro Universitario Senac **/
/** ADS - 1o semestre de 2024 **/
/** Fernando Almeida **/
/** **/
/** Projeto SEMESTRAL I **/
/** Arquivo: Projeto Jogo da Velha **/
/** **/
/** Richard Martins Costa Santos **/
/** Gustavo Almeida Do Vale **/
/** Caroline Cristine de Souza **/
/** **/
/** 28/05/2024 **/
/*********************************************************************/

package jogo_da_velha;

import java.util.Scanner;
import funcoes.menu;
import tabuleiro.campo;

public class programa {

    public static char[][] tabuleiro = new char[3][3]; // Unica variavel global, matriz do tabuleiro 3x3

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        campo.inicializarTabuleiro();
        char jogadorAtual = 'X'; // o jogador inicial é X

        int pontosX = 0;
        int pontosO = 0;
            
        if (menu.imprimeMenuPrincipal() == 2) { 
        	System.out.println("Você escolheu jogar contra a maquina!\n"
        			 + "Escolha a dificuldade da maquina:\n"
					 + "1 - Facil\n"
					 + "2 - Dificil");
        	int escolhaDificuldade = sc.nextInt(); // sem verificação se a pessoa digitar uma letra, o programa quebra
        	while (escolhaDificuldade != 1 && escolhaDificuldade != 2) { 
				System.out.println("Você digitou algo diferente de 1 ou 2, tente novamente.");
				escolhaDificuldade = sc.nextInt(); 
			}
        	
        	if (escolhaDificuldade == 1) { // escolhendo a dificuldade da maquina
        		modos.modoFacil(jogadorAtual, pontosX, pontosO);
        	} else {
        		modos.modoDificil(jogadorAtual, pontosX, pontosO);
        	}
        	
        } else {  
        	modos.modoJogador(jogadorAtual, pontosX, pontosO); // modo jogador caso a resposta seja 1, verificação já implementada na função imprimeMenuPrincipal
        }
        
        sc.close();
    }
    
    
}
