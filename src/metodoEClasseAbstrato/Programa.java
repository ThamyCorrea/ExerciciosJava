package metodoEClasseAbstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Ente com o número de contribuintes: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Contribuinte #" + (i + 1));
            System.out.print("Pessoa Física ou pessoa jurídica (f/j)? ");
            String minuscula = sc.next().toLowerCase();
            char ch = minuscula.charAt(0);
            while(ch != 'f' &&  ch != 'j'){
                System.out.println("Opção incorreta!");
                System.out.print("Pessoa Física ou pessoa jurídica (f/j)? ");
                minuscula = sc.next().toLowerCase();
                ch = minuscula.charAt(0);
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: R$ ");
            double renda = sc.nextDouble();
            if(ch == 'f'){
                System.out.print("Gasto anual com saúde? R$ ");
                double gastoSaude = sc.nextDouble();

                pessoas.add(new PessoaFisica(nome, renda, gastoSaude));

            }else if(ch == 'j'){
                System.out.print("Numero de funcionários? ");
                int numFunc = sc.nextInt();

                pessoas.add(new PessoaJuridica(nome, renda, numFunc));

            }

        }

        System.out.println("Impostos pagos: ");
        for(Pessoa p : pessoas){
            System.out.println(p.getNome() + ": R$ " + String.format("%.2f", p.calculoImposto()));
        }

        sc.close();
    }
}

