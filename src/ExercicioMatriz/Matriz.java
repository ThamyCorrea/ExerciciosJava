/*Fazer um programa para ler dois numeros inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo 
 * números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada 
 * ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.*/

package ExercicioMatriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int linhas = sc.nextInt();
		int colunas = sc.nextInt();
		
		int matriz [][] = new int[linhas][colunas];
		
		for(int l = 0; l < matriz.length; l++ ) {
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = sc.nextInt();
			}
		}
		
		
		int x = sc.nextInt();
		
		for(int l = 0; l < matriz.length; l++ ) {
			for(int c = 0; c < matriz[l].length; c++) {
				if(matriz[l][c] == x) {
					x = matriz[l][c];
					System.out.println("Posição: " + x);
					if(c > 0) {
						int esquerda = matriz[l][c - 1];
						System.out.println("Esquerda: " + esquerda);
					}if(l > 0) {
						int acima = matriz[l - 1][c];
						System.out.println("Acima: " + acima);
					}if(c < matriz[l].length-1) {
						int direita = matriz[l][c + 1];
						System.out.println("Direita: " + direita);
					}if(l < matriz.length-1) {
						int abaixo = matriz[l + 1][c];
						System.out.println("Abaixo: " + abaixo);
					}		
					
				}
			}
				
		}
		
		
		sc.close();

	}

}


