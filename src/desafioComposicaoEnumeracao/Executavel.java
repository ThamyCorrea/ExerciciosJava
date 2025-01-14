package desafioComposicaoEnumeracao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) throws ParseException {
					
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/YYYY");
			
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				System.out.println("Entre com os dados dos clientes: ");
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.next();
				System.out.print("Data aniversário: ");
				Date data = dataFormat.parse(sc.next());
				
				Cliente cliente = new Cliente(nome, email, data);
				System.out.println(cliente);
			}
			
			
			sc.close();

	}

}
