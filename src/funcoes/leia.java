package funcoes;

import java.util.Scanner;

public class leia {
	// Arquivo que tem as funções que lê as coordenadas
	
	public static int leiaCoordenadaLinha() {
		Scanner sc = new Scanner(System.in); 
		int linha = sc.nextInt() - 1; // escolhemos deixar -1 pois não tem coluna ou linha 0, o entendimento ficou melhor dessa forma
		return linha;
	}
	
	public static int leiaCoordenadaColuna() {
		Scanner sc = new Scanner(System.in);
		int coluna = sc.nextInt() - 1;
		return coluna;
	}

}
