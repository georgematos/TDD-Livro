package apresentacao;

public class CalculadoraDeMedia {

	public double media(double ... numeros) {

		if (numeros.length <= 1) {

			throw new IllegalArgumentException("É preciso no mínimo 2 numeros para realizar o cálculo da média.");

		}

		double soma = 0;

		for (double n : numeros) {
			soma += n;
		}

		return soma / numeros.length;

	}

}