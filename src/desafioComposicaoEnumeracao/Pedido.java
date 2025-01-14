package desafioComposicaoEnumeracao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	
	private Date data;
	private StatusPedido status;
	
	List<ItemPedido> itens = new ArrayList<>();
	
	private Produto produto;
	private Cliente cliente;
	
	public Pedido() {
		
	}

	public Pedido(Date data, StatusPedido status, Produto produto, Cliente cliente) {
		super();
		this.data = data;
		this.status = status;
		this.produto = produto;
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<ItemPedido> getItem() {
		return itens;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addItem(ItemPedido item){
		itens.add(item);
	}
	
	public void removerItem(ItemPedido item){
		itens.remove(item);
	}
	
	public Double total() {
		double total = 0;
		for(ItemPedido item : itens) {
			total += item.getPreco();
		}return total;
	}

	@Override
	public String toString() {
		
		
		SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String data = dataFormat.format(this.data);
		
		StringBuilder sb = new StringBuilder();
		sb.append(data);
		sb.append(status);
		sb.append(cliente.getNome());
		sb.append(cliente.getDataNasc());
		sb.append(cliente.getEmail());
		sb.append(produto.getNome());
		sb.append(produto.getPreco());
		for(ItemPedido item : itens) {
			sb.append(item.getQuantidade());
			sb.append(item.subTotal());
		}
		sb.append(total());
		
	
		
		return sb.toString();
	}
	
	
	

}
