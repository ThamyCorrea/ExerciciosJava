package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
		terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
		o vetor C gerado.*/
		
		System.out.print("Quantos vetores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int vetorA[] = new int [n];
		int vetorB[] = new int [n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("Vetor resultante: ");
		int soma = 0;
		for(int i = 0; i < n; i++) {
			soma = vetorA[i] + vetorB[i];
			System.out.println(soma);
			
		}		
		
		sc.close();
		
	}

}
