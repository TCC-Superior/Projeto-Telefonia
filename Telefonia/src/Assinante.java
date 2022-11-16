public class Assinante {
	private long cpf;
	private String nome;
	private String numero;
	
	public Assinante(long cpf, String nome, String numero) {
		this.cpf = cpf;
		this.nome = nome;
		this.numero = numero;
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
