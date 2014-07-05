package capitulo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> itens;
	
	public CarrinhoDeCompras() {
		this.itens = new ArrayList<Item>();
	}
	
	public void adiciona(Item item) {
		this.itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public double getMaiorPreco(CarrinhoDeCompras carrinho) {
		
		if(carrinho.getItens().size() == 0) return 0;
		
		Item itemMaior = carrinho.getItens().get(0);
			
		for(Item item : carrinho.getItens()) {
			if(item.getValorTotal() > itemMaior.getValorTotal()) {
				itemMaior = item;
			}
		}
		return itemMaior.getValorTotal();
	}
	
}
