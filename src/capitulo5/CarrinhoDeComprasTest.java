package capitulo5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarrinhoDeComprasTest {

	private CarrinhoDeCompras carrinho;
	private CarrinhoDeComprasBuilder builder;
	
	/**
	 *	O método inicializa é anotado com @Before para que o JUnit se encarrege de executá-lo antes
	 *	dos testes
	 */
	@Before 
	public void inicializa() {
		this.carrinho = new CarrinhoDeCompras();
		this.builder = new CarrinhoDeComprasBuilder();
	}
	
	@Test
	public void deveRetornarZeroCasoCarrinhoVazio() {
		assertEquals(0, carrinho.getMaiorPreco(carrinho), 0.00001);
	}
	
	@Test
	public void deveRetornarPrecoDoItemCasoCarrinhoSoTenhaEle() {
		carrinho = builder.comItens(69.9).cria();
		assertEquals(69.9, carrinho.getMaiorPreco(carrinho), 0.00001);
	}
	
	@Test
	public void deveRetornarPrecoDoMaiorItem() {
		carrinho = builder.comItens(39.9, 59.9, 69.9).cria();		
		assertEquals(69.9, carrinho.getMaiorPreco(carrinho), 0.00001);
	}
	
}
