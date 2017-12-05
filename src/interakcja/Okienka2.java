package interakcja;

import javax.swing.JOptionPane;

public class Okienka2 {

	public static void main(String[] args) {
		String imie = JOptionPane.showInputDialog("Imie: ");
		JOptionPane.showMessageDialog(null,"witaj :"+ imie);
		String wiekStr = JOptionPane.showInputDialog("ile masz lat?: ");
		int wiek = Integer.parseInt(wiekStr);
		if(wiek >=18)
		{
			JOptionPane.showConfirmDialog(null, imie +" mozesz kupic bronka");
		}else {
			JOptionPane.showConfirmDialog(null, imie +" za mlody");
		}

	}

}
