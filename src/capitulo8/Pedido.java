package capitulo8;

public class Pedido {

	private String cliente;
	private double valorTotal;
	private int quantidadeDeItens;

	public Pedido(String cliente, double valorTotal, int quantidadeDeItens) {
		this.cliente = cliente;
		this.valorTotal = valorTotal;
		this.quantidadeDeItens = quantidadeDeItens;
	}

	public String getCliente() {
		return cliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

}
