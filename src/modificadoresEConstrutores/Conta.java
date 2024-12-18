package modificadoresEConstrutores;

public class Conta {
	
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}


	public Conta(int numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	
	public int getNumeroConta() {
		return numeroConta;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public double getSaldo() {
		return saldo;
	}

		
	public double deposito(double valor) {
		return saldo += valor;
	}
	
	
	public double saque(double valor) {
		
		return saldo -= valor + 5.0;
	}
	
	

	@Override
	public String toString() {
		return "Conta " 
				+ numeroConta 
				+ ", nome: " 
				+ nome 
				+ ", saldo: R$ " 
				+ String.format("%.2f", saldo);
	}
	
	

}
