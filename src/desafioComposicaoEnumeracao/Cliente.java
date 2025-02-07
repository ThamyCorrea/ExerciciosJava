package desafioComposicaoEnumeracao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date dataNasc;
	
	public Cliente() {
		
	}
	

	public Cliente(String nome, String email, Date dataNasc) {
		this.nome = nome;
		this.email = email;
		this.dataNasc = dataNasc;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}


	@Override
	public String toString() {
		return nome + " (" + sdf.format(dataNasc) + ")" + 
				" - " + email + "\n";
	}
	

}
