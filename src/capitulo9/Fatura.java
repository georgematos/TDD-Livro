package capitulo9;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

	private String cliente;
	private double valor;
	private List<Pagamento> pagamentos;
	private boolean pago;

	public Fatura(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		pagamentos = new ArrayList<>();
		pago = false;
	}
	
	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public boolean isPago() {
		
		return pago;
		
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
