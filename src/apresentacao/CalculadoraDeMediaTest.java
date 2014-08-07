package apresentacao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraDeMediaTest {

	private CalculadoraDeMedia calculadora;

	@Before
	public void inicio() {
		calculadora = new CalculadoraDeMedia();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void deveRetornarExcecaoCasoNenhumArgumentoForPassado() {

		calculadora.media();

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void deveRetornarExcecaoCasoApenasUmNumeroForPassado() {
		
		calculadora.media(9.0);
		
	}

	@Test
	public void deveCalcularMediaDeDoisNumeros() {
		
		assertEquals((9.0 + 8.0) / 2, calculadora.media(9.0, 8.0), 0.00001);
		
	}

	@Test
	public void deveCalcularMediaDeTresNumeros() {

		assertEquals((9.0 + 8.6 + 7.4) / 3, calculadora.media(9.0, 8.6, 7.4), 0.00001);

	}

}