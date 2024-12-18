package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		- Imprimir todos os elementos do vetor
		- Mostrar na tela a soma e a média dos elementos do vetor*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce irá digitar? ");
		int n = sc.nextInt(); 
		
		double vetor[] = new double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		System.out.print("Valores = ");
		for(double num : vetor) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.print("Soma = " + soma);
		System.out.println();
		System.out.print("Media = " + soma / n);
		
		
		sc.close();
	}

}
