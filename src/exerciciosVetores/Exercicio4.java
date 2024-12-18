package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai difitar? ");
		int num = sc.nextInt();
		int totalPar = 0;
		
		int vetor [] = new int[num];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();	
			
		}	
		System.out.println();
		System.out.println("NUMEROS PARES: ");	
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				totalPar ++;
			}	
		}
		System.out.println();
		System.out.println();
		System.out.print("Quantidade de pares: " + totalPar);
			sc.close();
		}
	}


