import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Chamada {
	private Date data;
	private int duracao;

	public Chamada(Date date, int duracao) {
		super();
		this.data = date;
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

	public boolean equals(Object obj) {
		if (this == obj)
				return true;
		if (obj == null)
				return false;
		if (getClass() != obj.getClass())
				return false;

		Chamada other = (Chamada) obj;
		return Objects.equals(data, other.data) && Objects.equals(duracao, other.duracao);
	}
}
