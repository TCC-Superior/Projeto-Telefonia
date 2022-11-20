import java.util.Date;
import javax.swing.JOptionPane;

public class Telefonia {

	public static void main(String[] args) {
		Chamada chamada = new Chamada(null, 0);
		chamada.setData(new Date());
        chamada.setDuracao(100);
        chamadaTeste(chamada);
	}

	public static void chamadaTeste(Chamada chamada) {
		float opcao = Float.parseFloat(JOptionPane.showInputDialog("Para ver os detalhes da chamada, aperte 1"));
		
		if(opcao == 1) {
			chamada.tostring();
			chamada.duracao();
		} else { 
			System.out.println("Digite uma opção válida");
		}
	}
}

