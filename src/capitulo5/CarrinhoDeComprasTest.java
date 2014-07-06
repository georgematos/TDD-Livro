package capitulo5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarrinhoDeComprasTest {

	private CarrinhoDeCompras carrinho;
	private CarrinhoDeComprasBuilder carrinhoBuilder;
	
	/**
	 *	O método inicializa é anotado com @Before para que o JUnit se encarrege de executá-lo antes
	 *	dos testes
	 */
	@Before 
	public void inicializa() {
		this.carrinho = new CarrinhoDeCompras();
		this.carrinhoBuilder = new CarrinhoDeComprasBuilder();
	}
	
	@Test
	public void deveAdicionarItens() {
		// Garante que o carrinho está vazio antes de testar o método adiciona
		assertEquals(0, carrinho.getItens().size());
		
		Item item = new Item("Item", 1 , 199.0);
		carrinho.adiciona(item);
		
		// Testa se o item foi adicionado ao carrinho
		assertEquals(1, carrinho.getItens().size());
		
		// Teste se o item adicionado ao carrinho é o mesmo objeto retornado
		assertEquals(item, carrinho.getItens().get(0));
	}
	
	@Test
	public void deveRetornarZeroCasoCarrinhoVazio() {
		assertEquals(0, carrinho.getMaiorPreco(carrinho), 0.00001);
	}
	
	@Test
	public void deveRetornarPrecoDoItemCasoCarrinhoSoTenhaEle() {
		carrinho = carrinhoBuilder.comItens(69.9).cria();
		assertEquals(69.9, carrinho.getMaiorPreco(carrinho), 0.00001);
	}
	
	@Test
	public void deveRetornarPrecoDoMaiorItem() {
		carrinho = carrinhoBuilder.comItens(39.9, 59.9, 69.9).cria();
		assertEquals(69.9, carrinho.getMaiorPreco(carrinho), 0.00001);
	}
	
}
