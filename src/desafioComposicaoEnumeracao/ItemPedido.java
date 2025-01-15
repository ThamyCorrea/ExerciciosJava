package desafioComposicaoEnumeracao;


public class ItemPedido {
	
	private Integer quantidade;
	private Double preco;
	
	private Produto produto;
	
	public ItemPedido() {
		
	}

	public ItemPedido(Integer quantidade, Double preco, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}


	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double subTotal() {
		return preco * quantidade;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
			sb.append(getProduto().getNomeProduto() + ", ");
			sb.append("R$" + getProduto().getPrecoProduto());
			sb.append(" Quantidade: " + getQuantidade());			
			sb.append(", Subtotal" + String.format("%.2f", subTotal()) );
		
		return sb.toString();
	}
	
	

}
