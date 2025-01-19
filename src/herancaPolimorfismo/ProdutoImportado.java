package herancaPolimorfismo;

public class ProdutoImportado extends Produto {
	
	private Double taxaAlfandega;
	
	public ProdutoImportado() {
		
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public ProdutoImportado(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
		
	public Double precoTotal() {
		return super.getPreco() + taxaAlfandega;
	}

	@Override
	public String precoEtiqueta() {
		return getNome() + " R$ "
		+ String.format("%.2f", precoTotal())
		+ " (Taxa da alfandega: R$ " + taxaAlfandega + ")";
		
		
		
		
	}
	
	
	
}
