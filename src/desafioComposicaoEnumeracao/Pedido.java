package desafioComposicaoEnumeracao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	private SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date data;
	private StatusPedido status;
	
	List<ItemPedido> itens = new ArrayList<>();
		
	private Cliente cliente;
	
	public Pedido() {
		
	}

	public Pedido(Date data, StatusPedido status, Cliente cliente) {
		super();
		this.data = data;
		this.status = status;		
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
			total += item.subTotal();
		}return total;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Data do pedido: ");
		sb.append(dataFormat.format(new Date()) + "\n");
		sb.append("Status: " + status + "\n");
		sb.append("Cliente: " + cliente.getNome());
		sb.append(cliente);
		sb.append("Itens do Pedido: " + "\n");
		for(ItemPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total: R$" + String.format("%.2f", total()));	
		return sb.toString();
	}
	
	
	

}
