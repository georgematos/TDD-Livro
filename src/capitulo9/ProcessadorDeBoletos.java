package capitulo9;

import java.util.List;

public class ProcessadorDeBoletos {

	public void processa(List<Boleto> boletos, Fatura fatura) {
		
		double somaDosBoletos = 0;
		
		for(Boleto boleto : boletos) {			
			Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
			fatura.getPagamentos().add(pagamento);
			
			somaDosBoletos += boleto.getValor();
		}
		
		if(somaDosBoletos >= fatura.getValor()) {
			fatura.setPago(true);
		}
		
	}
	
}
