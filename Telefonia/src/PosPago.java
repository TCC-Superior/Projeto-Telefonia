import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
		
		if (numChamadas > 0) {
		this.chamadas[this.numChamadas - 1] = new Chamada(date, duracao);
		this.numChamadas = this.numChamadas - 1;
		
		System.out.println("Chamada concluída. Você ainda possui " + this.numChamadas + " chamadas.");
		} else {
			System.out.println("Você não pode realizar uma chamada");
		}
	}
	
	public void mostrarChamadas() {
        int incremento = 0;
        int contagem = 1;
        //Verifica se o incremento é menor que o tamanho das chamadas
        while (incremento < chamadas.length) {
        	if (chamadas[incremento] == null) {
        		incremento++; 
        	} else {
                		System.out.println(contagem + "chamada: " + this.chamadas[incremento]);
                			incremento++;
                			contagem++;
                	}
        	}
		}
	
    public void imprimirFatura(int mes) {
    	//Define o tipo do calendário
        GregorianCalendar dataGC = new GregorianCalendar();
        int incremento = 0;
        float chamadasValor = 0;

        System.out.println("Chamadas do plano Pós pago: ");
        while (incremento < this.chamadas.length) {
        	//Pega a chamada, verifica se é diferente de nulo e realiza a busca da chamada de acordo com o incremento e pega sua data
            if (this.chamadas[incremento] != null) {
            	dataGC.setTime(this.chamadas[incremento].getData());

                int mesCal = dataGC.get(Calendar.MONTH);

                if (mes == mesCal + 1) {

                    int duracao = this.chamadas[incremento].getDuracao();
                    //Definição dos valores da chamada
                    chamadasValor += Math.round((duracao * 1.04f) * 100) / 100;

                    System.out.println(this.chamadas[incremento].toString() + " Valor dessa chamada é de: R$" + Math.round((duracao * 1.04f) * 100) / 100);

                    incremento++;
                } else {
                	incremento++;
                }
            } else {
            	incremento++;
            }
        }
        // Definição do valor total da assinatura
        System.out.println("Preço total da assinatura é de: R$" + Math.round((this.assinatura * 100.0) / 100.0) + "E sua fatura total é de: R$" + Math.round((chamadasValor *100) / 100));
    }
		
	}
