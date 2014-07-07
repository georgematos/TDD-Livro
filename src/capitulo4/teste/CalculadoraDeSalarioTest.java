package capitulo4.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import capitulo4.CalculadoraDeSalario;
import capitulo4.Cargo;
import capitulo4.Funcionario;

public class CalculadoraDeSalarioTest {

	CalculadoraDeSalario calculadora;

	public CalculadoraDeSalarioTest() {
		this.calculadora = new CalculadoraDeSalario();
	}
	
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {
		
		// Execução da ação sob teste
		double salario = calculadora.calcularSalario(new Funcionario("Ciclano", 1500.0, Cargo.DESENVOLVEDOR));
		
		// Garantindo que o comportamento foi executado como esperado (resultado esperado, resultado obtido)
		assertEquals(1350.0, salario, 0.00001);
	
	}
	
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
		
		double salario = calculadora.calcularSalario(new Funcionario("Fulano", 4000.0, Cargo.DESENVOLVEDOR));
		assertEquals(3200.0, salario, 0.00001);
	
	}
	
	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {
		
		double salario = calculadora.calcularSalario(new Funcionario("Beltrano", 1200.0, Cargo.DBA));
		assertEquals(1020.0, salario, 0.00001);
		
	}
	
	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAcimaDoLimite() {
		
		double salario = calculadora.calcularSalario(new Funcionario("Juliano", 1600.0, Cargo.DBA));
		assertEquals(1200.0, salario, 0.00001);
		
	}
	
	@Test
	public void deveCalcularSalarioParaTestadoresComSalarioAcimaDoLimite() {
		
		double salario = calculadora.calcularSalario(new Funcionario("Herculano", 1600.0, Cargo.TESTADOR));
		assertEquals(1200.0, salario, 0.00001);
		
	}
	
}
