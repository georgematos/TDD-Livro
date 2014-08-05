package apresentacao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MediaTest {

	@Test
	public void deveRetornarMedia() {
		CalculaMedia calcula = new CalculaMedia();
		
		List<Double> numeros = new ArrayList<>();
		
		numeros.add(4.2);
		numeros.add(5.2);
		numeros.add(9.2);
		
		double media = calcula.media(numeros);
		
		assertEquals(18.6, media, 0.00001);
	}
	
}
