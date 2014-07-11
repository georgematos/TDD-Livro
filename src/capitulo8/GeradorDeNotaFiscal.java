package capitulo8;

import java.util.List;

public class GeradorDeNotaFiscal {
	
	private List<AcaoAposGerarNota> acoes;
	private Relogio relogio;
	
	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes, Relogio relogio) {
		this.acoes = acoes;
		this.relogio = relogio;
	}
	
	// Alguns testes não passam um relógio para o Gerador, para não quebrá-los 
	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
		this.relogio = new RelogioDoSistema();
	}

	public NotaFiscal gerarNota(Pedido pedido) {
		
		NotaFiscal nf = new NotaFiscal(pedido.getCliente(), pedido.getValorTotal() * 0.94, relogio.hoje());
		
		for (AcaoAposGerarNota acao : acoes) {
			acao.executa(nf);;
		}
		
		return nf;
	}
	
}
