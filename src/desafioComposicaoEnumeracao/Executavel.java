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
			
			Pedido pedido = new Pedido(null, null, null, null);
				
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				System.out.println("Entre com os dados dos clientes: ");
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				sc.next();
				System.out.print("Email: ");
				String email = sc.next();
				System.out.print("Data aniversário: ");
				Date data = dataFormat.parse(sc.next());
				
				Cliente cliente = new Cliente(nome, email, data);	
				
							
			}
			
			System.out.println("Entre com os dados do Produto");
			System.out.print("Status: ");
			String nivel = sc.next();
			
			System.out.println("Quantos item irá comprar? ");
			int qntItem = sc.nextInt();
			
			for(int i = 0; i < qntItem; i++) {
				System.out.println("Ente com o dado do item #" + (i + 1));
				System.out.println("Nome do produto: ");
				String nomeProduto = sc.next();
				System.out.println("Valor do produto: ");
				double preco = sc.nextDouble();
				System.out.println("Quantidade: ");
				int quantidade = sc.nextInt();
				
				ItemPedido item = new ItemPedido(quantidade, preco);			
				Produto produto = new Produto(nomeProduto, preco);
			}
			
			
			
			System.out.println(pedido);
			
			
			
			
			sc.close();

	}

}
