import java.util.Date;

public class PosPago extends Assinante{
	private float assinatura;

	public PosPago(long cpf, String nome, int numero, int numChamadas, float assinatura) {
		super(cpf, nome, numero, numChamadas);
		this.assinatura = assinatura;
	}
	
	public float getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(float assinatura) {
		this.assinatura = assinatura;
	}
	
	public void fazerChamada(Date date, int duracao) {
		this.assinatura =  duracao * 1.04f; 
		//this.chamadas.add(new Chamada(data, duracao));
		
		//if numChamadas > 0
		this.chamadas[this.numChamadas - 1] = new Chamada(date, duracao);
		this.numChamadas = this.numChamadas - 1;
		
		System.out.println(this.numChamadas);
	}
	
	public void mostrarChamadas() {
		for(int i = 0; i < 2; i ++) {
			System.out.println(this.chamadas[i]);
		}
	}
	
	public static void main(String[] args) {
		PosPago p = new PosPago(1233211234, "Victoria", 1399112978, 2, 10f);
	
		p.fazerChamada(new Date(),10);
		p.fazerChamada(new Date(),100);
		
		p.mostrarChamadas();
	}
}
