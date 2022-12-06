import java.util.Date;
import java.util.GregorianCalendar;

public class PrePago extends Assinante{
	private float creditos;
	private int numRecargas;
	
	private Recarga[] recargas;
	
	public PrePago(long cpf, String nome, int numero, float creditos, int numRecargas) {
		super(cpf, nome, numero, numRecargas);
		this.creditos = creditos;
		this.numRecargas = numRecargas;
		this.recargas = new Recarga[numRecargas];
		Recarga[] recargas = new Recarga[numRecargas];

	}

	public void recarregar(GregorianCalendar data, float saldo) {
		 if (numRecargas > 0) {
	            this.recargas[this.numRecargas - 1] = new Recarga(data, saldo);
	            this.numRecargas = this.numRecargas - 1;
	            this.creditos += saldo;

	            System.out.println("Recarga concluída. Seu saldo atual é de: R$" + Math.round(this.creditos * 100) / 100);
	        } else {
	            System.out.println("Recarga não realizada. Tente novamente.");
	        }
	}
	
	public void fazerChamada(Date data, int duracao) {
		 if (numChamadas > 0) {
	            float cobrança = creditos - (duracao * 1.45f);

	            if (cobrança > 0) {
	                this.creditos = cobrança;
	                this.chamadas[this.numChamadas - 1] = new Chamada(data, duracao);
	                this.numChamadas = this.numChamadas - 1;
	                System.out.println("Chamada feita. Chamadas que você ainda possui: " + this.numChamadas + "Seu saldo atual é de: R$" + Math.round(this.creditos * 100) / 100);
	            } else {
	                System.out.println("Você não possui créditos suficientes para comletar está ligação. Por favor recarregue em uma de nossas centrais.");
	            }
	        } else {
	            System.out.println("A chamada não pode ser realizada, tente novamente.");
	        }
	}
	
	public void imprimirFatura(int mes) {
		
	}
}
