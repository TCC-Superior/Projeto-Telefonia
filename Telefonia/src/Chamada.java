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
    
  @Override
	public String toString() {
		SimpleDateFormat formatacaoData = new SimpleDateFormat("dd-MM-yyyy");
		String dataFormatada = formatacaoData.format(data);
		System.out.println("Data: " + dataFormatada + " Duração: " + duracao + " minutos.");
		return "A chamada registrada é da data: " + dataFormatada + " e sua duração é de: " + duracao + " minutos.";
  }
}