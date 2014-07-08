package capitulo8;

public class NotaFiscalDao implements AcaoAposGerarNota {

	public void persiste(NotaFiscal nf) {
		// persiste NF
	}

	@Override
	public void executa(NotaFiscal nf) {
		persiste(nf);
	}
	
}
