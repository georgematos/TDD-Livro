package capitulo9;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

	private String cliente;
	private double valor;
	private List<Pagamento> pagamentos;

	public Fatura(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		pagamentos = new ArrayList<>();
	}

	public String getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

}
