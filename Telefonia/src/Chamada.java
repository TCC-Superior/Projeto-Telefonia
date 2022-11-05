import java.time.LocalDate;

public class Chamada {
	protected LocalDate data = LocalDate.now();
	protected int duracao;
	
	public Chamada(LocalDate data, int duracao) {
		super();
		this.data = data;
		this.duracao = duracao;
	}
	
	public LocalDate getData() {
		return data;
	}


	public int getDuracao() {
		return duracao;
	}
}
