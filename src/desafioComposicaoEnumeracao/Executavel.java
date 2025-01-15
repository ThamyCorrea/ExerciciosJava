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
			SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.println("Entre com os dados dos clientes: ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();				
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Data aniversário: (DD/MM/AAAA): ");
			Date dataNasc = dataFormat.parse(sc.next());
				
			Cliente cliente = new Cliente(nome, email, dataNasc);	
					
			System.out.println("Entre com os dados do Produto");
			System.out.print("Status: ");
			StatusPedido status = StatusPedido.valueOf(sc.next()) ;	
			
			Pedido pedido = new Pedido(new Date(), status, cliente);
					
			System.out.print("Quantos item o pedido terá? ");
			int n = sc.nextInt();			
			for(int i = 0; i < n; i++) {
				System.out.println("Ente com o dado do item #" + (i + 1));
				System.out.print("Nome do produto: ");
				sc.nextLine();
				String nomeProduto = sc.nextLine();
				System.out.println("Valor do produto: ");
				double precoProduto = sc.nextDouble();
				System.out.println("Quantidade: ");
				int quantidade = sc.nextInt();
				
				Produto produto = new Produto(nomeProduto, precoProduto);
				
				ItemPedido item = new ItemPedido(quantidade, precoProduto, produto);
				
				pedido.addItem(item);				
			}
			
			System.out.println();
			System.out.println(pedido);
			
			sc.close();

	}

}
