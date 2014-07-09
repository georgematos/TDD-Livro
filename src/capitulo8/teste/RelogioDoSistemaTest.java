package capitulo8.teste;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import capitulo8.RelogioDoSistema;

public class RelogioDoSistemaTest {

	private RelogioDoSistema relogio;
	
	@Before
	public void inicia() {
		this.relogio = new RelogioDoSistema();
	}
	
	@Test
	public void deveRetornarTrueSeADataPassadaForFimDeSemana() {
		
		Calendar dataFimDeSemana = Calendar.getInstance();
		dataFimDeSemana.set(2014, 6, 6); // ano, mes (inicia de 0), dia	
		
		assertEquals(true, relogio.isFimDeSemana(dataFimDeSemana));
	
	}
	
	@Test
	public void deveRetornarFalseSeADataPassadaNaoForFimDeSemana() {
		
		Calendar data = Calendar.getInstance();
		
		assertEquals(false, relogio.isFimDeSemana(data));
	
	}
	
	@Test
	public void deveRetornarDataPassadaParaProximaSegundaSeFimDeSemana() {
		
		Calendar dataFimDeSemana = Calendar.getInstance();
		dataFimDeSemana.set(2014, 6, 7);
		
		Calendar segundaFeira = Calendar.getInstance();
		segundaFeira.set(2014, 6, 7);
		
		assertEquals(segundaFeira.getTime(), relogio.hoje(dataFimDeSemana).getTime());
		
	}
	
}
