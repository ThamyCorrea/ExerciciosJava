package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor: ");
		int n = sc.nextInt();
		
		double vetor[] = new double[n];
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();			
		}
		
		
		double pares = 0;
		double quantidade = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				pares += vetor[i];
				quantidade ++;
			}	
		}
		
		if(quantidade > 0) {
			System.out.println("MEDIA DOS PARES: " + pares/quantidade);
		}else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		
		
		
		/*
		
		if(media > 0) {
			System.out.printf("MEDIA DOS NUMEROS PARES: %.1f ", media);
		}else {
			System.out.printf("NENHUM NÚMERO PAR");
		}*/
		sc.close();
	}

}
