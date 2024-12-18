package modificadoresEConstrutores;

import java.util.Locale;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
			 		
		System.out.print("Entre com o numero da conta: ");
		int numeroConta = sc.nextInt();
		
				
		System.out.print("Entre com seu nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
			
		
		System.out.print("Há valor inicial de deposito? s/n ");
		char resposta = sc.next().charAt(0);
				
		 if(resposta == 'y') {
			System.out.print("Entre com o valor inicial do deposito:  ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, nome, depositoInicial);
		 }else {
			 conta = new Conta(numeroConta, nome);
			 
		 }
		 
		 System.out.println();
		 System.out.print("Ddos da conta: ");
		 System.out.println(conta);
		 
		 System.out.println();
		 System.out.print("Qual o valor de depósito? R$ ");
		 double deposito = sc.nextDouble();
		 conta.deposito(deposito);
		 System.out.print("Foi depositado: ");
		 System.out.println(conta);
		 
		 System.out.println();
		 System.out.print("Qual o valor do saque? R$ ");
		 double saque = sc.nextDouble();
		 conta.saque(saque);
		 System.out.println(conta);
		 
		 	
		
		
		sc.close();
	}

}
