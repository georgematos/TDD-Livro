package capitulo6;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calculadora;
	
	@Before
	public void inicia() {
		this.calculadora = new Calculadora();
	}
	
	/**
	 * Nomes dos testes representam suas classes de equivalência, ou seja, evitam repetição de testes inuteis como
	 * deveSomarUmMaisUm() e deveSomarDoisMaisDois(), os dois testes nesse caso seriam redundantes pois ambos estão
	 * somando dois numeros inteiros positivos
	 */
	@Test
	public void deveSomarDoisNumerosInteirosPositivos() {
		assertEquals(3, calculadora.soma(1,2), 0.00001);
	}
	
	@Test
	public void deveSomarDoisNumerosReaisPositivos() {
		assertEquals(8.4, calculadora.soma(5.2,3.2), 0.00001);
	}
	
	@Test
	public void deveSomarDoisNumerosInteriosNegativos() {
		assertEquals(-6, calculadora.soma(-4,-2), 0.00001);
	}
	
	@Test
	public void deveSomarUmNumeroInteiroPositivoComUmInteiroNegativo() {
		assertEquals(-1, calculadora.soma(1,-2), 0.00001);
	}
	
	@Test
	public void deveSomarUmNumeroRealNegativoComUmRealPositivo() {
		assertEquals(-2.9, calculadora.soma(-5.1,2.2), 0.00001);
	}
	
	@Test
	public void deveSomarUmNumeroInteiroNegativoComUmPositivo() {
		assertEquals(2, calculadora.soma(-2,4), 0.00001);
	}
	
	@Test
	public void deveSomarComZero() {
		assertEquals(3, calculadora.soma(3, 0), 0.00001);
	}
	
}
