package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
	    double alturamedia;

	    System.out.print("Quantas pessoas serao digitadas? ");
	    n = sc.nextInt();

	    String[] nomes = new String[n];
	    int[] idades = new int[n];
	    double[] alturas = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.printf("Dados da %da pessoa:\n", i + 1);
	    	System.out.print("Nome: ");
	        nomes[i] = sc.next();
	        System.out.print("Idade: ");
	        idades[i] = sc.nextInt();
	        System.out.print("Altura: ");
	        alturas[i] = sc.nextDouble();
	    }

		double soma = 0.0;
		for (int i=0; i<n; i++) {
	        soma += alturas[i];
	    }

	    alturamedia = soma / n;
	    
	    System.out.println();
	    System.out.printf("Altura media = %.2f cm%n", alturamedia);
	    
	        
	    int contador = 0;
	    for(int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	        	contador++;
	        }
	    }
	    
	    double porcentagemMenores = contador * 100.0 / n;
	    
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%", porcentagemMenores);
	    
	    for(int i=0; i<n; i++) {
	    	if(idades[i] < 16) {
	    		System.out.println(nomes[i]);
	    	}
	    }

		sc.close();
	}
}