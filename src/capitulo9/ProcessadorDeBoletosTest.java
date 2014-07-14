package capitulo9;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ProcessadorDeBoletosTest {
	
	private ProcessadorDeBoletos processador;
	
	@Before
	public void inicia() {
		processador = new ProcessadorDeBoletos();
	}
	
	@Test
	public void deveProcessarPagamentoViaBoletoUnico() {
		
		Fatura fatura = new Fatura("Cliente", 150.0);
		Boleto b1 = new Boleto(150.0);
		List<Boleto> boletos = Arrays.asList(b1);
		
		processador.processa(boletos, fatura, MeioDePagamento.BOLETO);
		
		assertEquals(1, fatura.getPagamentos().size());
		assertEquals(150.0, fatura.getPagamentos().get(0).getValor(), 0.00001);
	}
	
	@Test
	public void deveProcessarPagamentoViaMuitosBoletos() {
		
		Fatura fatura = new Fatura("Cliente", 300.0);
		Boleto b1 = new Boleto(100.0);
		Boleto b2 = new Boleto(200.0);
		List<Boleto> boletos = Arrays.asList(b1, b2);
		
		processador.processa(boletos, fatura, MeioDePagamento.BOLETO);
		
		assertEquals(2, fatura.getPagamentos().size());
		assertEquals(100.0, fatura.getPagamentos().get(0).getValor(), 0.00001);
		assertEquals(200.0, fatura.getPagamentos().get(1).getValor(), 0.00001);
	}
	

}
