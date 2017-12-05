package interakcja;

import java.io.IOException;
import java.util.Arrays;


public class StrBit {
	public static void main(String[] args) {
		System.out.println("jak masz na imie?: ");
		try {
			byte[] buffor = new byte [100];
			int ile = System.in.read(buffor);
			System.out.println("Wczytałem " + ile +" bajtów");
			System.out.println(Arrays.toString(buffor));
			String imie = new String(buffor, 0, ile);
			System.out.println("Witaj:" + imie);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
