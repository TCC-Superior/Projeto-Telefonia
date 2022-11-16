import java.util.Date;

public class PrePago extends Assinante{
	private float creditos;
	private int numRecargas;
	
	public PrePago(long cpf, String nome, String numero, float creditos, int numRecargas) {
		super(cpf, nome, numero);
		this.creditos = creditos;
		this.numRecargas = numRecargas;
	}
	
	public float getCreditos() { 
		return creditos; 
	}
	
	public void setCreditos(float creditos) { 
		this.creditos = creditos; 
	}
	
	public int getNumRecargas() { 
		return numRecargas; 
	}
	
	public void setNumRecargas(int numRecargas) { 
		this.numRecargas = numRecargas; 
	}
	
	public void recarregar(Date data, float valor) { 
		
	}
	
	public void fazerChamada(Date data, int duracao) { 
		
	}
	
	public void imprimirFatura(int mes) { 
		
	}
}
