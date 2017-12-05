package zmienne;

public class ZmienneKlasowe {
    // instance variable = field = attribute
    int instancyjna;
    
    // static variable = static field
    static int statyczna;
    
    // zmienne z poziomu klasy są automatycznie inicjalizowane na domyslne wartości 0 lub null

    public static void main(String[] args) {
        // można odczytywać zmienne definiowne na poziomie klasy bez potrzeby inicjalizacji
        System.out.println("statyczna: " + statyczna);
        
        // nie można w main - metodzie statycznej - odwoływać do zmiennych instancyjnych
        //NK System.out.println("instancyjna: " + instancyjna);
        
        // chyba że utworzymy obiekt ("instancję")
        ZmienneKlasowe obiekt = new ZmienneKlasowe();
        System.out.println("obiekt.instancyjna: " + obiekt.instancyjna);
        obiekt.metoda();
    }
    
    void metoda() {
        System.out.println("instancyjna w metodzie: " + instancyjna);
    }

}



