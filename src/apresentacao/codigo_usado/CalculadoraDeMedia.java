package apresentacao.codigo_usado;

public class CalculadoraDeMedia {
	
	public double calcularMedia(double ... numeros) {
	
		if(numeros.length < 2) {			
			throw new IllegalArgumentException();
		}
		
		double soma = 0;
		
		for (double numero : numeros) {
			
			soma += numero;
			
		}
		
		return soma / numeros.length;
		
	}

}
