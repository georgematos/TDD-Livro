package apresentacao.teste1;

public class CalculadoraDeMedia {

	public double calcula(double ... numeros) {
		
		double soma = 0;
		
		for (double numero : numeros) {
			soma += numero;
		}
		
		return soma / numeros.length;
		
	}
	
}
