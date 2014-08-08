package apresentacao.codigo_usado;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraDeMediaTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void deveLancarExcecaoCasoNumeroDeArgumentosMenorQueDois() {
		
		CalculadoraDeMedia calculadora = new CalculadoraDeMedia();
		
		calculadora.calcularMedia();
		
	}
	
	@Test
	public void deveRetornarMediaDeDoisNumeros() {
		
		CalculadoraDeMedia calculadora = new CalculadoraDeMedia();
		
		assertEquals(6.5, calculadora.calcularMedia(5.0, 8.0), 0.1);

		assertEquals(10.0, calculadora.calcularMedia(5.0, 15.0), 0.1);
		
	}

}
