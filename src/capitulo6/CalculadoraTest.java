package capitulo6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void deveSomarUmMaisUm() {
		assertEquals(2, new Calculadora().soma(1,1), 0.00001);
	}
	
	@Test
	public void deveSomarUmMaisDois() {
		assertEquals(3, new Calculadora().soma(1,2), 0.00001);
	}
	
	@Test
	public void deveSomarDoisMaisDois() {
		assertEquals(4, new Calculadora().soma(2,2), 0.00001);
	}
	
	// Comentario feito no branch master

}
