package liczby;

public class Ciekawostki {
public static void main (String[] args) {
	
	System.out.println(2*1000000000);
	System.out.println(3*1000000000);
	System.out.println(4*1000000000);
	System.out.println(5*1000000000);
	
	
	int a = 150;
	double wspolczynik = 0.23;
	double wynik;
	
	System.out.println(" ");
	wynik = a * 100 / wspolczynik;
	System.out.println(wynik);
	System.out.println(" ");
	wynik = a * wspolczynik / 100;
	System.out.println(wynik);
	System.out.println(" ");
	wynik = a * 100.0 / wspolczynik;
	System.out.println(wynik);
	
	
	// a / 100 jest dzieleniem całkowitym, czyli wynik jest obcinany do liczby całkowitej (zawsze w kierunku zera)
    // czyli tu a / 100 to jest 1
    wynik = a / 100 * wspolczynik;
    System.out.println(wynik);

    // najpierw liczone a * wspolczynnik, wynik mnozenia jest double
    // i dzielnie przez 100 jest już robione na double
    wynik = a * wspolczynik / 100;
    System.out.println(wynik);        

    // generalnie warto w takich wzorach wpisywać literały liczbowe od razu z ułamkiem, np. 100.0
    wynik = a / 100.0 * wspolczynik;
    System.out.println(wynik);

	}
}
