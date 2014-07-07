package capitulo4;

import capitulo4.regrasDeCalculo.DezOuVintePorCento;
import capitulo4.regrasDeCalculo.RegraDeCalculo;
import capitulo4.regrasDeCalculo.QuinzeOuVinteCincoPorCento;


public enum Cargo {

	DESENVOLVEDOR(new DezOuVintePorCento()),
	DBA(new QuinzeOuVinteCincoPorCento()),
	TESTADOR(new QuinzeOuVinteCincoPorCento());
	
	private final RegraDeCalculo regra;
	
	// O construtor inicia a regra de acordo com o new das enums
	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra() {
		return regra;
	}
	
}
