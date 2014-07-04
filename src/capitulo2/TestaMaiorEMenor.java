package capitulo2;

import org.junit.Assert;
import org.junit.Test;

public class TestaMaiorEMenor {
	
	@Test
	public void ordemDecrescente() {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		carrinho.adiciona(new Produto("Liquidificador", 250.0));
		carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
		
		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);
		
		// Resultado esperado, Resultado retornado.
		Assert.assertEquals("Jogo de pratos", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());
		
	}
	
	@Test
	public void apenasUmProduto() {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		Produto produto = new Produto("Geladeira", 450.0);
		
		carrinho.adiciona(produto);
		
		MaiorEMenor algoritmo = new MaiorEMenor();
		
		algoritmo.encontra(carrinho);
		
		Assert.assertEquals(produto, algoritmo.getMenor());
		Assert.assertEquals(produto, algoritmo.getMaior());
		
	}
	
}
