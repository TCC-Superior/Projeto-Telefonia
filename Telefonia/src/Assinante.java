import java.util.Arrays;
import java.util.Scanner;

public abstract class Assinante {
	protected long cpf;
	protected String nome;
	protected int numero;
	protected Chamada[] chamadas;
	protected int numChamadas;

	public Assinante(long cpf, String nome, int numero, int numChamadas) {
		this.cpf = cpf;
		this.nome = nome;
		this.numero = numero;

		this.chamadas = new Chamada[numChamadas];
		this.numChamadas = numChamadas;
		Chamada[] chamadas = new Chamada[numChamadas];
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
	
	public int getNumero() { 
		return numero; 
	}
	
	public void setNumero(int numero) { 
		this.numero = numero; 
	}
	
	public Chamada[] getChamadas() {
		return chamadas;
	}
	
	public void setChamadas(Chamada[] chamadas) {
		this.chamadas = chamadas;
	}
	
	public int getNumChamadas() {
		return numChamadas;
	}
	
	public void setNumChamadas(int numChamadas) {
		this.numChamadas = numChamadas;
	}
	
	@Override
	
	public String toString() {
		String dadosAssinante = "Os atributos do Assinante são: Assinante: " + nome + " CPF: " + cpf + " Número: " + numero + "Quantidade de chamadas: " + numChamadas + Arrays.toString(chamadas);
		System.out.print(dadosAssinante);
		return dadosAssinante;

	}

}
