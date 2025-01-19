package herancaPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
		List <Produto> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Normal, usado ou importado? (c/u/i) ");
			String minusculo = sc.nextLine().toLowerCase();
			char ch = sc.next().charAt(0);
			while (ch != 'c' && ch != 'u' && ch != 'i') {
			    System.out.println("Opção inválida");
			    System.out.print("Normal, usado ou importado? (c/u/i) ");
			    minusculo = sc.next().toLowerCase();
				ch = minusculo.charAt(0);
				
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");			
			double preco = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Taxa da Alfândega: ");
				double taxa = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxa));
			}else if(ch == 'u'){
				System.out.print("Data de fabricação: (DD/MM/AAAA): " );
				Date data = dataFormat.parse(sc.next());
				lista.add(new ProdutoUsado(nome, preco, data));
			}else if (ch == 'c'){
				lista.add(new Produto(nome, preco));
			}
		}
		System.out.println();
		System.out.println("Preço da etiqueta: ");
		for(Produto produto : lista) {
			System.out.println(produto.precoEtiqueta());
		}
		
		sc.close();	
		
	}

}
