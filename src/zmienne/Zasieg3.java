package zmienne;

public class Zasieg3 {
    
    static String s = "Ala";

    public static void main(String[] args) {
        System.out.println("1 " + s);
        
        if(true) {
            System.out.println("2 " + s);
            
            // można zadeklarować zmienną lokalną o takiej samej nazwie jak pole będące w zasięgu
            String s = "Ola";
            System.out.println("3 " + s);
            metoda();
            System.out.println("4 " + s);
        }
        
        System.out.println("5 " + s);
        
    }

    static void metoda() {
        s += " ma kota";
        System.out.println("M " + s);
    }
    
}



