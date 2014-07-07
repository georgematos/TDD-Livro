package capitulo8.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import capitulo8.GeradorDeNotaFiscal;
import capitulo8.NotaFiscal;
import capitulo8.NotaFiscalDao;
import capitulo8.Pedido;
import capitulo8.SAP;

public class GeradorDeNotaFiscalTest {
	
	private GeradorDeNotaFiscal gerador;
	private NotaFiscalDao dao;
	private SAP sap;
	
	@Before
	public void inicia() {
		/**
		 * Observe que para simular o comportamento de métodos de outras classes nos testes dessa classe, podemos usar mocks,
		 * para usá-los precisamos passá-los para a classe através de seu construtor, aqui estou crinando os mocks que serão necessários.
		 * Uma vantagem disso é que para usar mocks serei obrigado a passar essas dependências para o seu construtor fazendo com que
		 * elas fiquem explícitas, afinal esse é a unica forma de passar um mock para a classe.
		 */
		dao = Mockito.mock(NotaFiscalDao.class); // cria o mock para verificar se o método persist foi invocado
		sap = Mockito.mock(SAP.class);
		gerador = new GeradorDeNotaFiscal(dao, sap);
	}
	
	@Test
	public void deveGerarNFComValorDeImpostoDescontado() {
		Pedido pedido = new Pedido("Fulano", 1000, 1);
		NotaFiscal nf = gerador.gerarNota(pedido);
		
		assertEquals(940.0, nf.getValor(), 0.00001); // desconta 6%
	}

	@Test
	public void devePersistirANFCriada() {		
		Pedido pedido = new Pedido("Fulano", 1000, 1);
		
		NotaFiscal nf = gerador.gerarNota(pedido);
		
		// verificando se o método foi invocado
		Mockito.verify(dao).persiste(nf);
	}
	
	@Test
	public void deveEnviarNFGeradaParaSAP() {
		Pedido pedido = new Pedido("Fulano", 2000, 1);
		
		NotaFiscal nf = gerador.gerarNota(pedido);
		
		// verificando se a nota foi enviada para o SAP
		Mockito.verify(sap).envia(nf);
	}
	
}
