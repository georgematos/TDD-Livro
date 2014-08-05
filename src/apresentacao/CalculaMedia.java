package apresentacao;

import java.util.List;

public class CalculaMedia {

	public double media(List<Double> numeros) {
		
		double media = 0.0;
		
		for (Double n : numeros) {
			media += n.doubleValue();
		}
		
		return media;
		
	}
	
}
