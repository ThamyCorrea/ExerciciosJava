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
			Integer id = sc.nextInt();
			while(buscarId(lista, id)) {
				System.out.println("ID já existe, tente novamente");
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			//sc.nextDouble();
			System.out.print("Salario R$ ");
			Double salario = sc.nextDouble();
			
			Funcionarios func = new Funcionarios(id, nome, salario);
			
			lista.add(func);
		}
		
		System.out.println();
		System.out.print("Entre com o ID do funcionario que haverá incremento salarial: ");
		int id = sc.nextInt();
		
		Integer posicao = posicaoID(lista, id);		
		if(posicao == null) {
			System.out.println("ID não existe!");
		}else {
			System.out.println("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			lista.get(posicao).porcentagemAumentoSal(porcentagem);
		}
		
		
		System.out.println();
		System.out.println("Lista dos funcionarios: ");
		
		for(Funcionarios item : lista) {
			System.out.println(item);
		}
			
		
		
		sc.close();

	}
	
	public static Integer posicaoID(List<Funcionarios> listaId, int id) {
		for(int i = 0; i < listaId.size(); i++) {
			if(listaId.get(i).getId() == id) {
				return i;
			}
		}
		return null;

	}
	
	public static boolean buscarId(List<Funcionarios> lista, int id) {
		Funcionarios func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}
}
