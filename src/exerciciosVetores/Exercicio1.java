package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		
		int vetor[] = new int [n];
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for(int num : vetor) {
			if(num < 0) {
			 System.out.println(num);
			}
		}
		
		
		
		sc.close();
	}
	
	

}
