/*A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0 a 9.
* Fazer um programa que inicia com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de estudantes 
* que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos estudantes, bem como qual dos quartos ele 
* escolheu(0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações 
* do pensionato, por ordem de quarto, com: número aluguel, nome, email, quarto*/

package desafioVetores;

import java.util.Locale;
import java.util.Scanner;


public class Pensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vetor = new Aluguel[10];
			
		System.out.print("Quantos alunos irão alugar os quartos? ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel " + i);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.println("Número do quarto: ");
			int numQuarto = sc.nextInt();
			
			vetor[numQuarto] = new Aluguel(nome, email);
		}
		
		
		System.out.println("Relatórios de reservas: ");
		for(int i = 0; i < 10; i++) {
			if(vetor[i] != null) {
				System.out.println(i + ":" + vetor[i]);
			}
		}
		
		          
        

       
		 
		
		
		
		sc.close();
		
		
		
	}
}
