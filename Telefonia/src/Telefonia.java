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
		
		Set<Chamada> chamada = new HashSet<>();
		
		GregorianCalendar dataChamada = new GregorianCalendar();
		dataChamada.set(2022, GregorianCalendar.OCTOBER, 18);
		
		GregorianCalendar dataChamada2 = new GregorianCalendar();
		dataChamada.set(2022, GregorianCalendar.MARCH, 28);

		Chamada chamada1 = new Chamada(dataChamada.getTime(), 50);
		Chamada chamada2 = new Chamada(dataChamada2.getTime(), 30);

		chamada.add(chamada1);
		chamada.add(chamada2);
		
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
		chamada.toString();
  
		String escolha = JOptionPane.showInputDialog(null, String.format(texto, tamanho, tamanho));
		
		switch (escolha) {
		case "1":
			JOptionPane.showMessageDialog(null, "Cadastrar Assinante");
			Integer tipoAssinante = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual tipo de assinante? Responda 1 para pré pago ou 2 para pós pago."));
			
			if (tipoAssinante == 1) {
				JOptionPane.showMessageDialog(null, "Assinante pré pago");
				
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
				
				PosPago PosPagoAssinante = new PosPago(1234567890, "Victoria", 991129784, 2, 10f);
				PosPagoAssinante.fazerChamada(new Date(),10);
				PosPagoAssinante.fazerChamada(new Date(),100);
				
				PosPagoAssinante.mostrarChamadas();
						
				SimpleDateFormat formatacaoData = new SimpleDateFormat("MMMM");
				System.out.println("Data: " + formatacaoData.format(dataChamada.getTime()) + chamada1.getDuracao());
				
				break;

			} else if (tipoAssinante == 2) {
				JOptionPane.showMessageDialog(null, "Assinante pós pago");
				break;
				
			} else {
				JOptionPane.showMessageDialog(null, "Digite uma opção válida");
				break;
			}
		case "2":
			JOptionPane.showMessageDialog(null, "Listar Assinantes");
			break;
		case "3":
			JOptionPane.showMessageDialog(null, "Fazer chamada");
			break;
		case "4":
			JOptionPane.showMessageDialog(null, "Fazer recarga");
			break;
		case "5":
			JOptionPane.showMessageDialog(null, "Imprimir faturas");
			break;
		case "6":
			break;
		default:
			JOptionPane.showMessageDialog(null, "Digite uma opção válida");
			break;
		}
	}
}