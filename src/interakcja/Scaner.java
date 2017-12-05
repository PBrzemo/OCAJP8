package interakcja;

import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Jak masz na imię?");
		String imie = sc.nextLine();
		System.out.println("wittaj "+imie);
		
		System.out.println("Ile masz lat "+imie+"?");
		int wiek = sc.nextInt();
		String tekst;
		if(wiek >= 18) {
            tekst = "możesz kupić piwo";
        } else {
            tekst = "dla ciebie tylko cukierki";
        }        
		System.out.println(imie+"."+ tekst);
	}

}
