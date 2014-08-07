package apresentacao.teste2;

public class CalculadoraDeMedia {

	public double media(double ... numeros) {

		if (numeros.length > 1) {

			double soma = 0;

			for (double n : numeros) {
				soma += n;
			}

			return soma / numeros.length;

		} else {

			throw new IllegalArgumentException("É preciso no mínimo 2 numeros para realizar o cálculo da média.");
	
		}

	}

}