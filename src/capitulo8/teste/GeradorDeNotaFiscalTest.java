package capitulo8.teste;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import capitulo8.AcaoAposGerarNota;
import capitulo8.GeradorDeNotaFiscal;
import capitulo8.NotaFiscal;
import capitulo8.NotaFiscalDao;
import capitulo8.Pedido;
import capitulo8.SAP;

public class GeradorDeNotaFiscalTest {
	
	private GeradorDeNotaFiscal gerador;
	private NotaFiscalDao dao;
	private SAP sap;
	private List<AcaoAposGerarNota> acoes;
	
	@Before
	public void inicia() {
		/**
		 * Observe que para simular o comportamento de métodos de outras classes nos testes dessa classe, podemos usar mocks,
		 * para usá-los precisamos passá-los para a classe através de seu construtor, aqui estou crinando os mocks que serão necessários.
		 * Uma vantagem disso é que para usar mocks serei obrigado a passar essas dependências para o seu construtor fazendo com que
		 * elas fiquem explícitas, afinal essa é a unica forma de passar um mock para a classe.
		 */
		dao = Mockito.mock(NotaFiscalDao.class); // cria o mock para verificar se o método persist foi invocado
		sap = Mockito.mock(SAP.class);
		
		/**
		 * Para evitar que a classe de testes cresça muito (sinal de um teste ruim) podemos fazer uso da orientação a objetos, fazendo as
		 * classes que são dependências da classe sob teste implementarem uma interface que forcem-as a executar um método expecífico que
		 * simulem o comportamento que deve ser executado após a geração da nota fiscal. Podemos então criar uma lista com os Mocks das clas-
		 * ses e passar apenas essa lista como depencia da classe sob teste, nesse caso a classe GeradorDeNotaFiscal.
		 */
		acoes = new ArrayList<>();
		acoes.add(dao);
		acoes.add(sap);
		gerador = new GeradorDeNotaFiscal(acoes);
		
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
		Mockito.verify(dao).executa(nf);
	}
	
	@Test
	public void deveEnviarNFGeradaParaSAP() {
		Pedido pedido = new Pedido("Fulano", 2000, 1);
		
		NotaFiscal nf = gerador.gerarNota(pedido);
		
		// verificando se a nota foi enviada para o SAP
		Mockito.verify(sap).executa(nf);
	}
	
}
