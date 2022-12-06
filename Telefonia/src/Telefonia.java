import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Telefonia {

	public static void main(String[] args) {
        
		//Painel de escolha
        String texto = "<html><body width='%1s'><h1>Sistema de Telefonia</h1>"
        		+ "<h2>Desenvolvido por Mikael Vital e Victoria Ribeiro</h2>"
        		+ "<h3>As opções são: </h3>"
                + "<p>1 - Cadastrar Assinante. <br>"
                + "2 - Listar Assinantes. <br>"
                + "3 - Fazer chamada. <br>"
                + "4 - Fazer recarga. <br>"
                + "5 - Imprimir faturas. <br>"
                + "6 - Sair do programa. <br><br>"
                + "Digite a opção desejada abaixo: <br><br>";
        int tamanho = 500;
        
        String escolha = JOptionPane.showInputDialog(null, String.format(texto, tamanho, tamanho));
        
		//Resultado da escolha feita no painel
        switch (escolha) {
        case "1":
        	JOptionPane.showMessageDialog(null, "Cadastrar Assinante");
        	Integer tipoAssinante = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual tipo de assinante ele é? Responda 1 para pós pago ou 2 para pré pago."));
        	
    		// Verificação do tipo assinante
        	if (tipoAssinante == 1) {
        		JOptionPane.showMessageDialog(null, "Assinante pós pago");
        		
        		System.out.println("Digite seu CPF: ");
                Scanner cadastrarCpf = new Scanner(System.in);
                long cpf = cadastrarCpf.nextLong();
                
                System.out.println("Digite seu nome: ");
                Scanner cadastrarNome = new Scanner(System.in);
                String nome = cadastrarNome.next();

                System.out.println("Digite seu número (sem o DDD): ");
                Scanner cadastrarNumero = new Scanner(System.in);
                int numero = cadastrarNumero.nextInt();
                
                System.out.println("Os dados do assinante cadastrado são: ");
                System.out.println("CPF: " + cpf);
                System.out.println("Nome: " + nome);
                System.out.println("Número: (13)" + numero);	
                
        		break;
        	} else if (tipoAssinante == 2) {
        		JOptionPane.showMessageDialog(null, "Assinante pré pago");
        		JOptionPane.showMessageDialog(null, "O sistema não está disponível para cadastrar um assinante pré pago, por favor tente mais tarde.");
        		break;
        	}  else {
        		JOptionPane.showMessageDialog(null, "Digite uma opção válida");
        		break;
        	} 
        	
        //Listagem de Assinantes
        case "2":
        	JOptionPane.showMessageDialog(null, "Listar Assinantes");
        	JOptionPane.showMessageDialog(null, "Os assinantes cadastrados no sistema são: ");
        	
        	PosPago PosPagoAssinante2 = new PosPago(1320183585, "Victoria", 997262828, 2, 10f);
        	PosPago PosPagoAssinante3 = new PosPago(1234567890, "Mikael", 991129784, 4, 15f);
        	System.out.println("Assinante: " + PosPagoAssinante2);
        	System.out.println("Assinante: " + PosPagoAssinante3);
        	
            break;
        //Fazer a chamada
        case "3":
        	JOptionPane.showMessageDialog(null, "Fazer chamada");
        	Integer tipoChamada = Integer.parseInt(JOptionPane.showInputDialog(null, "Para fazer uma chamada, escolha o seu tipo de assinatura. Digite 1 para Pós Pago e 2 para Pré Pago"));
        	if (tipoChamada == 1) {
        		JOptionPane.showMessageDialog(null, "Você escolheu uma chamada Pós Paga");
        		Set<Chamada> chamada = new HashSet<>();
        		
        		GregorianCalendar dataChamada = new GregorianCalendar();
        		dataChamada.set(2022, GregorianCalendar.OCTOBER, 18);
        		
        		GregorianCalendar dataChamada2 = new GregorianCalendar();
        		dataChamada.set(2022, GregorianCalendar.MARCH, 28);

                Chamada chamada1 = new Chamada(dataChamada.getTime(), 50);
                Chamada chamada2 = new Chamada(dataChamada2.getTime(), 30);

                chamada.add(chamada1);
          
                chamada.add(chamada2);
                
            	chamada.toString();
      
                PosPago PosPagoAssinante = new PosPago(1234567890, "Aroldo", 991129784, 2, 10f);
                PosPagoAssinante.fazerChamada(new Date(),10);
                PosPagoAssinante.fazerChamada(new Date(),100);
                
                PosPagoAssinante.mostrarChamadas();
        	} else if (tipoChamada == 2){
        		JOptionPane.showMessageDialog(null, "Você escolheu uma chamada Pré Paga");
            	JOptionPane.showMessageDialog(null, "O sistema não está disponível para realizar uma chamada pós paga, por favor tente mais tarde.");
        		break;
        	}
        	else {
        		JOptionPane.showMessageDialog(null, "Digite uma opção válida");
        		break;
        	}
            break;
        //Fazer recarga
        case "4":
        	JOptionPane.showMessageDialog(null, "Fazer recarga");
        	JOptionPane.showMessageDialog(null, "O sistema não está disponível para realizar uma recarga, por favor tente mais tarde.");
        	break;
        //Imprimir as faturas
        case "5":
        	JOptionPane.showMessageDialog(null, "Imprimir faturas");
        	Integer tipoFatura = Integer.parseInt(JOptionPane.showInputDialog(null, "Esse assinante pertence a qual plano? Responda 1 para pré pago ou 2 para pós pago."));
        	//Verificação se a fatura é pré paga ou pós paga
        	if (tipoFatura == 1) {
        		JOptionPane.showMessageDialog(null, "Faturas do assinante PréPago");
        		
        		JOptionPane.showMessageDialog(null, "O sistema não está disponível para visualizar as faturas, por favor tente mais tarde.");
        	} else if (tipoFatura == 2) {
        		JOptionPane.showMessageDialog(null, "Faturas do assinante PósPago");
        		
        		JOptionPane.showMessageDialog(null, "O sistema não está disponível para visualizar as faturas, por favor tente mais tarde.");
        	}
            break;
            //Encerrar a aplicação
        case "6":
            break;

            //Tratamento de possíveis erros na escolha do painel
        default:
        	JOptionPane.showMessageDialog(null, "Digite uma opção válida");
            break;
        }
		
	}

}
