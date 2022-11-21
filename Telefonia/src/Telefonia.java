import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

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
		
		String escolha = JOptionPane.showInputDialog(null, String.format(texto, tamanho, tamanho));

		switch (escolha) {
		case "1":
			JOptionPane.showMessageDialog(null, "Cadastrar Assinante");
			break;
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
			chamada.toString();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Digite uma opção válida");
			break;
		}
	}
}

