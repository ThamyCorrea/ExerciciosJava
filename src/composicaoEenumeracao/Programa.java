/*Cadastro de Colaboradores: Adicione informações sobre novos colaboradores.
 * Cadastro de Departamentos: Crie departamentos.
 * Gestão de Contratos: Crie e exclua contratos.
 * Gestão de Contratos: Crie e exclua contratos.
 * Visualização de Contratos: Exiba contratos na tela com base na data (mês/ano) selecionada.
 */

package composicaoEenumeracao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o departamento do trabalhador: ");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println("Entre com os dados do Trabalhador: ");
		System.out.print("Nome: ");
		String nomeColaborador = sc.nextLine();
		System.out.print("Nível: ");
		String nivelColaborador = sc.nextLine();
		System.out.print("Salário base: ");
		Double salarioColaborador = sc.nextDouble();
		Colaborador colaborador = new Colaborador(nomeColaborador, NivelFuncionario.valueOf(nivelColaborador), salarioColaborador, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos para este trabalhador? ");
		Integer n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Dados do Contrato #" + (i + 1));
			
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = dataFormatada.parse(sc.next());			
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Total de horas: ");
			int totalDeHoras = sc.nextInt();			
			
			ContratoHoras cont = new ContratoHoras(dataContrato, valorPorHora, totalDeHoras);
			
			colaborador.addContrato(cont);
		}
		
		System.out.println();
		System.out.print("Entre com o mês e o ano no formato (MM/YYYY: ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2)); //mudo a String para Int, numeros são a posicao
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Nome: " + colaborador.getNome());
		System.out.println("Departamento: " + colaborador.getDepartamento().getNome());
		System.out.println("Quanto ganhou no mes e ano informado? " + String.format("%.2f",colaborador.renda(ano, mes)));
		
		sc.close();

	}

}
