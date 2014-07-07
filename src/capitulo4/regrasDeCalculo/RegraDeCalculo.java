package capitulo4.regrasDeCalculo;

import capitulo4.Funcionario;

public abstract class RegraDeCalculo {

	public double calcularSalario(Funcionario funcionario) {
		if (funcionario.getSalario() > limite()) {
			return funcionario.getSalario() * porcentagemAcimaDoLimite();
		}
		return funcionario.getSalario() * porcentagemBase();
	}

	protected abstract int limite();

	protected abstract double porcentagemAcimaDoLimite();

	protected abstract double porcentagemBase();

}