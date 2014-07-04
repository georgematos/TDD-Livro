package capitulo4;

public class CalculadoraDeSalario {

	public double calcularSalario(Funcionario funcionario) {
		
		if (funcionario.getCargo() == Cargo.DESENVOLVEDOR) {
			
			if(funcionario.getSalario() < 3000) {
				return funcionario.getSalario() * 0.9; // desconto de 10%
			}
			return funcionario.getSalario() * 0.8; // desconto de 20%
		}
		
		if (funcionario.getCargo() == Cargo.DBA || funcionario.getCargo() == Cargo.TESTADOR) {
			
			if(funcionario.getSalario() < 1500) {
				return funcionario.getSalario() * 0.85; // desconto de 15%
			}
			return funcionario.getSalario() * 0.75; // desconto de 25%
		}
		
		return 0;
		
	}
	
}