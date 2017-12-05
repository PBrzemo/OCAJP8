package interakcja;

import javax.swing.JOptionPane;

public class Okienka3 {

	public static void main(String[] args) {
		        String imie = JOptionPane.showInputDialog("Jak masz na imię?");        
		        String wiekStr = JOptionPane.showInputDialog("Ile masz lat?");
		        int wiek = Integer.parseInt(wiekStr);
		        
		        String tekst;
		        if(wiek >= 18) {
		            tekst = "możesz kupić piwo";
		        } else {
		            tekst = "dla ciebie tylko cukierki";
		        }        

		        JOptionPane.showMessageDialog(null, imie + ", " + tekst);
		    }
		}

