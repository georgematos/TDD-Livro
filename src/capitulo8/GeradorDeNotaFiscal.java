package capitulo8;

import java.util.Calendar;

public class GeradorDeNotaFiscal {
	
	private NotaFiscalDao dao;
	private SAP sap;
	
	public GeradorDeNotaFiscal(NotaFiscalDao dao, SAP sap) {
		this.dao = dao;
		this.sap = sap;
	}

	public NotaFiscal gerarNota(Pedido pedido) {
		
		NotaFiscal nf = new NotaFiscal(pedido.getCliente(), pedido.getValorTotal() * 0.94, Calendar.getInstance());
		
		dao.persiste(nf);
		sap.envia(nf);
		
		return nf;
	}
	
}
