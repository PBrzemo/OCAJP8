package interakcja;

import javax.swing.JOptionPane;

public class Okienka1 {

	public static void main(String[] args) {
		String imie = JOptionPane.showInputDialog("Imie: ");
		JOptionPane.showMessageDialog(null,"witaj :"+ imie);
		
	}

}
