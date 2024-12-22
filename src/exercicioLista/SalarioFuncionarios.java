package exercicioLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionarios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> lista = new ArrayList<>();
			
		System.out.print("Quantos funcionários irá registrar? ");
		int numFuncionarios = sc.nextInt();
		
				
		System.out.println();
		for(int i = 0; i < numFuncionarios; i++) {
			System.out.println("Funcionário #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			//sc.nextDouble();
			System.out.print("Salario R$ ");
			Double salario = sc.nextDouble();
			
			lista.add(new Funcionarios(id, nome, salario));
				
		}
		
		System.out.println();
		System.out.print("Entre com o ID do funcionario que haverá incremento salarial: ");
		int id = sc.nextInt();
		Funcionarios func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(func == null) {
			System.out.println("ID informado não existe! ");
		}else {
			System.out.print("Valor da porcentagem: ");
			double porcentagem = sc.nextDouble();
			func.porcentagemAumentoSal(porcentagem);
		}
		
			
		System.out.println();
		System.out.println("Lista dos funcionarios: ");
		
		for(Funcionarios item : lista) {
			System.out.println(item);
		}
		
		//List<Funcionarios> resultado = lista.stream().filter()
		
	
			
		
		
		
		
		
		
			
		
			
		
		
		
		sc.close();

	}

}
