package capitulo5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrinhoDeComprasTest {

	private CarrinhoDeCompras carrinho;
	
	public CarrinhoDeComprasTest() {
		this.carrinho = new CarrinhoDeCompras();
	}
	
	@Test
	public void deveRetornarZeroCasoCarrinhoVazio() {
		assertEquals(0, carrinho.getMaiorPreco(carrinho), 0.00001);
	}
	
	@Test
	public void deveRetornarPrecoDoItemCasoCarrinhoSoTenhaEle() {
		Item item = new Item("Calça Jeans", 1, 69.9);
		carrinho.adiciona(item);
		assertEquals(69.9, carrinho.getMaiorPreco(carrinho), 0.00001);
	}
	
	@Test
	public void deveRetornarPrecoDoMaiorItem() {
		Item item2 = new Item("Camisa Polo", 1, 39.9);
		Item item3 = new Item("Camisa Social", 1, 59.9);
		Item item1 = new Item("Calça Jeans", 1, 69.9);
		carrinho.adiciona(item1);
		carrinho.adiciona(item2);
		carrinho.adiciona(item3);
		assertEquals(69.9, carrinho.getMaiorPreco(carrinho), 0.00001);
	}
	
}
