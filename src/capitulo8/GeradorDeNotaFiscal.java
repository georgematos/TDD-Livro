package capitulo8;

import java.util.Calendar;
import java.util.List;

public class GeradorDeNotaFiscal {
	
	private List<AcaoAposGerarNota> acoes;
	
	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gerarNota(Pedido pedido) {
		
		NotaFiscal nf = new NotaFiscal(pedido.getCliente(), pedido.getValorTotal() * 0.94, Calendar.getInstance());
		
		for (AcaoAposGerarNota acao : acoes) {
			acao.executa(nf);;
		}
		
		return nf;
	}
	
}
