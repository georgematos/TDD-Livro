package capitulo8;

import java.util.Calendar;

public interface Relogio {

	Calendar hoje();
	Calendar hoje(Calendar data);
	boolean isFimDeSemana(Calendar data);
	
}
