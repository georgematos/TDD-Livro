package capitulo4.regrasDeCalculo;



public class QuinzeOuVinteCincoPorCento extends RegraDeCalculo {

	@Override
	protected int limite() {
		return 1500;
	}

	@Override
	protected double porcentagemAcimaDoLimite() {
		return 0.75;
	}

	@Override
	protected double porcentagemBase() {
		return 0.85;
	}
	
}
