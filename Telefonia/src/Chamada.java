import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Chamada {
	private GregorianCalendar data;
	private int duracao;
	private String toString;
	
	public Chamada(GregorianCalendar data, int duracao) {
		super();
		this.data = data;
		this.duracao = duracao;
	}
	

	public GregorianCalendar getData() {
		return data;
	}


	public int getDuracao() {
		return duracao;
	}
	
	public void setData(GregorianCalendar data) {
		this.data = data;
	}


	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public static String toString(GregorianCalendar data) {
		SimpleDateFormat formatacaoData = new SimpleDateFormat("dd-MM-yyyy");
		String dataFormatada = formatacaoData.format(data.getTime());
		System.out.print("Data formatada: " + dataFormatada);
		return dataFormatada;
	}
	
    public static void main(String[] args)
    {
 
        GregorianCalendar gcal = new GregorianCalendar();
        gcal.set(GregorianCalendar.YEAR, 2019);
 
        gcal.set(GregorianCalendar.MONTH, 03);
 
        gcal.set(GregorianCalendar.DATE, 03);

        System.out.println("Gregorian date: " + gcal.getTime());

        toString(gcal);
    }
	
}
