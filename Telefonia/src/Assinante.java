public class Assinante {
	private long cpf;
	private String nome;
	private String numero;
	protected Chamada[] chamadas; //Não pode ser um array List mas sim um vetor primitivo
	protected Integer numChamadas;
	
	public abstract Assinante(long cpf, String nome, String numero, Integer numero) {
		this.cpf = cpf;
		this.nome = nome;
		this.numero = numero;

		this.chamadas = new Chamada[numero];
		this.numChamadas = numero;
	}

	public long getCpf() { 
		return cpf; 
	}
	
	public void setCpf(long cpf) { 
		this.cpf = cpf; 
	}

	public String getNome() { 
		return nome; 
	}
	
	public void setNome(String nome) { 
		this.nome = nome; 
	}
	
	public String getnumero() { 
		return numero; 
	}
	
	public void setNumero(String numero) { 
		this.numero = numero; 
	}
	
	public static String toString(long cpf, String nome, String numero) {
		String dadosAssinante = "Os atributos do Assinante são: Assinante: " + nome + " CPF: " + cpf + " Número: " + numero;
		System.out.print(dadosAssinante);
		return dadosAssinante;

	}

}
