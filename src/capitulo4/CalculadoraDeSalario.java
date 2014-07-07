package capitulo4;

public class CalculadoraDeSalario {

	public double calcularSalario(Funcionario funcionario) {
		
		return funcionario.getCargo().getRegra().calcularSalario(funcionario);
	
	}
	
}