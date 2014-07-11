package capitulo8;

import java.util.Calendar;

public interface Relogio {

	// Deve retornar a data do sistema empurrada para segunda-feira caso seja um fim-de-semana.
	Calendar hoje(); 
	
	// Deve receber uma data qualquer e caso seja fim-de-semana empurra essa data para a proxima segunda-feira.
	Calendar hoje(Calendar data); 

	// Deve receber uma data e retornar true caso seja fim-de-semana ou false caso contrário.
	boolean isFimDeSemana(Calendar data); 
	
}