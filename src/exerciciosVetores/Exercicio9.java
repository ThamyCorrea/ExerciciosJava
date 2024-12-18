package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você irá digitar? ");
		int n = sc.nextInt();
		
		String nome[] = new String [n];
		int idade[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a primeira pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();		
		}
		
			
		double maior = idade[0];
	    int posmaior = 0;

	    for (int i=1; i<n; i++) {
	        if (idade[i] > maior) {
	            maior = idade[i];
	            posmaior = i;
	            
	        }
	    }
		
		System.out.print("Pessoa mais velha: " + nome[posmaior]);
		sc.close();

	}

}
