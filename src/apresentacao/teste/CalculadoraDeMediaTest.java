package apresentacao.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraDeMediaTest {

	@Test(expected = IllegalArgumentException.class)
	public void deveRetornarExceptionCasoNumeroDeArgumentosSejaMenorQueDois() {
		
		CalculadoraDeMedia calculadora = new CalculadoraDeMedia();
		
		calculadora.calcularMedia(8.0);
		
	}
	
	@Test
	public void deveRetornarAMediaDeDoisNumeros() {
		CalculadoraDeMedia calculadora = new CalculadoraDeMedia();
		
		assertEquals((9.0 + 6.0) / 2, calculadora.calcularMedia(9.0, 6.0), 0.1);
	}
	
	@Test
	public void deveRetornarAMediaDeCincoNumeros() {
		CalculadoraDeMedia calculadora = new CalculadoraDeMedia();
		
		assertEquals((9.0 + 6.0 + 5.3 + 3.4 + 2.0) / 5, calculadora.calcularMedia(9.0, 6.0, 5.3, 3.4, 2.0), 0.1);
	}
	
}
