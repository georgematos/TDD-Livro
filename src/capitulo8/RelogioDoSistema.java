package capitulo8;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio {
	
	
	public Calendar hoje() {
		
		Calendar agora = Calendar.getInstance();
		
		return trataData(agora);

	}
	
	@Override
	public Calendar hoje(Calendar data) {
		
		return trataData(data);
	
	}
	
	/**
	 * Verifica se a data recebida é um fim-de-semana, caso seja, retorna a próxima segunda-feira
	 * @param data
	 * @return data
	 */
	private Calendar trataData(Calendar data) {
		
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
