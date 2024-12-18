package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
					
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double maiorAltura = 0;
		double menorAltura = 2;
		double mediaAlturaM = 0;
		double alturaF = 0;
		int numeroAlturaM = 0;
		int numeroH = 0;
		
		double altura [] = new double[n];
		char genero[] = new char[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Altura da " + i + 1 + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + i + 1 + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		for(int i = 0; i < n; i++) {
			if(genero[i] == 'm') {
				numeroH++;
			}else {
				numeroAlturaM++;
				alturaF += altura[i];
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		mediaAlturaM = alturaF / numeroAlturaM;
		
		System.out.println("Numerto de Homens" + numeroH);
		System.out.printf("Media das altura das Mulheres %.2f", mediaAlturaM);
		System.out.println("Menor altura " + menorAltura);
		System.out.println("Maior altura " + maiorAltura);
		
		
		
			
		sc.close();

	}

}
