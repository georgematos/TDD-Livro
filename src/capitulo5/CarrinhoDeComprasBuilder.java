package capitulo5;

public class CarrinhoDeComprasBuilder {

	/**
	 *	Esta classe é um Test Data Builder, ela serve para ajudar na construção de cenários complexos para testes.
	 *	Esta classe em específico, ajuda na criação do objeto de testes da classe CerrinhoDeCompras.
	 *	Ela usa o padrão de projeto Builder para realizar a tarefa.
	 */
	
	private CarrinhoDeCompras carrinho;
	
	public CarrinhoDeComprasBuilder() {
		this.carrinho = new CarrinhoDeCompras();
	}
	
	/**
	 * Este método retorna uma instancia da própria classe para que se possa chamar outro método dela mesma.
	 * @param valores
	 * @return
	 */
	public CarrinhoDeComprasBuilder comItens(double... valores) {
		for(double valor : valores) {
			carrinho.adiciona(new Item("Item", 1, valor));
		}
		return this;
	}
	
	/**
	 * O método cria() retorna uma instância de CarrinhoDeCompras construída a partir deste builder pelos métodos anteriores.
	 * @return
	 */
	public CarrinhoDeCompras cria() {
		return carrinho;
	}
	
}
