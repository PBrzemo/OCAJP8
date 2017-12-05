package zmienne;
public class Deklaracje1 {

    public static void main(String[] args) {
        // nie wolno używać niezadeklarowanych zmiennych
        //NK System.out.println(x);
        //NK x = 14;
        
        // deklaracja zmiennej lokalnej
        int x;
        // nie wolno odczytywać niezainicjowanych zmiennych lokalnych
        //NK System.out.println(x);
        
        // przypisanie - od tej pory mogę już odczytywać x
        x = 13;
        
        // teraz OK
        System.out.println(x);

    }

}



