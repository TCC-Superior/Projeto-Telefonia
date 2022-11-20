import java.text.SimpleDateFormat;
import java.util.Date;

public class Chamada {
	private Date data;
	private int duracao;

	public Chamada(Date data, int duracao) {
		super();
		this.data = data;
		this.duracao = duracao;
	}
	
	public Date getData() {
		return data;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setData(Date date) {
		this.data = date;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
    
  public void tostring() {
  SimpleDateFormat formatacaoData = new SimpleDateFormat("dd-MM-yyyy");
	String dataFormatada = formatacaoData.format(data.getTime());
		System.out.println("Data: " + dataFormatada);
  }
    
  public void duracao() {
    System.out.println("Duração: " + duracao);
  }	
}