package capitulo9;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FaturaTest {
	
	private ProcessadorDeBoletos processador;
	
	@Before
	public void inicia() {
		processador = new ProcessadorDeBoletos();
	}

	@Test
	public void deveMarcarFaturaComoPagaCasoUmBoletoPagueTudo() {
		
		Fatura fatura = new Fatura("Cliente", 150.0);
		Boleto b1 = new Boleto(150.0);
		List<Boleto> boletos = Arrays.asList(b1);
		
		processador.processa(boletos, fatura, MeioDePagamento.CARTÃO_DE_CREDITO);
		
		assertTrue(fatura.isPago());
		
	}

	@Test
	public void deveMarcarFaturaComoPagaCasoMaisDeUmBoletoPagueTudo() {
		
		Fatura fatura = new Fatura("Cliente", 150.0);
		Boleto b1 = new Boleto(120.0);
		Boleto b2 = new Boleto(30.0);
		List<Boleto> boletos = Arrays.asList(b1, b2);
		
		processador.processa(boletos, fatura, MeioDePagamento.BOLETO);
		
		assertTrue(fatura.isPago());
		
	}
	
	@Test
	public void naoDeveMarcarFaturaComoPagaCasoBoletoPagueParteDaFatura() {
		
		Fatura fatura = new Fatura("Cliente", 150.0);
		Boleto b1 = new Boleto(140.0);
		List<Boleto> boletos = Arrays.asList(b1);
		
		processador.processa(boletos, fatura, MeioDePagamento.CARTÃO_DE_CREDITO);
		
		assertTrue(!fatura.isPago());
		
	}
	
}
