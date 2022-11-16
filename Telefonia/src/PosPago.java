import java.util.Date;

public class PosPago extends Assinante{
	private float assinatura;
	
	public PosPago(long cpf, String nome, String numero, float assinatura) {
		super(cpf, nome, numero);
		this.assinatura = assinatura;
		
	}
	
	public float getAssinatura() { 
		return assinatura; 
	}
	
	public void setAssinatura(float assinatura) { 
		this.assinatura = assinatura; 
	}
	
	public void fazerChamada(Date data, int duracao) { 
		this.assinatura = duracao * 1.04f;

		this.chamadas[this.numChamadas -1] = new Chamada(data, duracao);
		this.numChamadas = this.numChamadas -1;

		PosPago p = new PosPago(2, 10f);

	}
	
	public void imprimirFatura(int mes) { 
		
	}
}
