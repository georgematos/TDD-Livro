package apresentacao.teste1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraDeMediaTest {

	@Test
	public void deveCalcularMediaDeDoisNumeros() {
		
		CalculadoraDeMedia calculadora = new CalculadoraDeMedia();
		
		assertEquals(8.5, calculadora.calcula(8.0, 9.0), 0.00001);
		
	}
	
}
