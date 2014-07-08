package capitulo8;

public class SAP implements AcaoAposGerarNota {

	public void envia(NotaFiscal nf) {
		// envia NF para o SAP
	}

	@Override
	public void executa(NotaFiscal nf) {
		envia(nf);
	}
	
}
