package apresentacao.teste;

public class CalculadoraDeMedia {
	
	public double calcularMedia(double ... numeros) {
		
		if(numeros.length < 2) {
			throw new IllegalArgumentException("A quantidade de numeros deve ser maior ou igual dois");
		}
		
		double soma = 0;
		
		for (double n : numeros) {
			soma += n;
		}
		
		return soma / numeros.length;
		
	}

}
