package capitulo8;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio {
	
	private static Calendar agora = Calendar.getInstance();
	
	public Calendar hoje() {
		
		if (agora.get(Calendar.DAY_OF_WEEK) == 1) {
			agora.add(Calendar.DAY_OF_WEEK, 1);
			return agora;
		}
		
		if (agora.get(Calendar.DAY_OF_WEEK) == 7) {
			agora.add(Calendar.DAY_OF_WEEK, 2);
			return agora;
		}
		
		return agora;

	}
	
	@Override
	public Calendar hoje(Calendar data) {
		
		if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			data.add(Calendar.DATE, 1);
			return data;
		}
		
		if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			data.add(Calendar.DATE, 2);
			return data;
		}
		
		return data;
	}
	
	public boolean isFimDeSemana(Calendar data) {
		
		if(data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
