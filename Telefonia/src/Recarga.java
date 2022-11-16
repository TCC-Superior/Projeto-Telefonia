import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Recarga {
	private GregorianCalendar data;
	private float valor;
	
	public Recarga(GregorianCalendar data, float valor) {
		super();
		this.data = data;
		this.valor = valor;
	}
	
	public GregorianCalendar getData() { 
		return data; 
	}
	
	public void setData(GregorianCalendar data) { 
		this.data = data; 
	}
	
	public float getValor() { 
		return valor; 
	}
	
	public void setValor(float valor) { 
		this.valor = valor; 
	}
	
	public static String toString(GregorianCalendar data) {
		SimpleDateFormat formatacaoData = new SimpleDateFormat("dd-MM-yyyy");
		String dataFormatada = formatacaoData.format(data.getTime());
		System.out.print("Data formatada: " + dataFormatada);
		return dataFormatada;
	}
	
}
