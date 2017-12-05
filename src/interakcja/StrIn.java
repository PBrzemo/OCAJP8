package interakcja;

import java.io.IOException;

public class StrIn {
	public static void main(String[] args) {
		System.out.println("jak masz na imie?: ");
		try {
			int x = System.in.read();
			System.out.println("odczytano" +" "+ x);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
