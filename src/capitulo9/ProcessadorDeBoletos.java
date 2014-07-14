package capitulo9;

import java.util.List;

public class ProcessadorDeBoletos {

	public void processa(List<Boleto> boletos, Fatura fatura, MeioDePagamento meioDePagamento) {
		
		/**
		 * Em códigos orientados a objetos, geralmente dizemos que as classes não devem fazer perguntas e tomar
		 * decisões baseadas nas respostas, mas sim mandar o objeto executar uma ação, e ele por conta própria
		 * tomar a decisão certa. Essa ideia é conhecida por Tell, Don’t Ask.
		 */
		
		for(Boleto boleto : boletos) {			
			Pagamento pagamento = new Pagamento(boleto.getValor(), meioDePagamento);
			fatura.pagar(pagamento);
		}		
		
	}
	
}
