package capitulo3;

import static org.junit.Assert.*;
import org.junit.Test;


public class ConversorDeNumeroRomanoTest {

	private ConversorDeNumeroRomano romano;
	
	public ConversorDeNumeroRomanoTest() {
		romano = new ConversorDeNumeroRomano();
	}

	@Test
	public void deveEntenderSimbolosIsolados() {
		assertEquals(1, romano.converte("I"));
	}
	
	@Test
	public void deveEntenderSimbolosCompostos() {
		assertEquals(20, romano.converte("XX"));
	}
	
	@Test
	public void deveEntenderSimbolosComValorMenorAEsquerda() {
		assertEquals(4, romano.converte("IV"));
	}
	
	@Test
	public void deveEntenderNumerosComplexosComoXXIV() {
		assertEquals(24, romano.converte("XXIV"));
	}
	
	@Test
	public void deveEntenderNumerosGrandesComoMDLI() {
		assertEquals(1551, romano.converte("MDLI"));
	}
	
}
