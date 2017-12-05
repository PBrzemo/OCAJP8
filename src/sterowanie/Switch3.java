package sterowanie;

public class Switch3 {
    
    static int dajNumer(String nazwa) {
        switch(nazwa) {
        case "poniedziałek" : return 1;
        case "wtorek" : return 2;
        case "środa" : return 3;
        case "czwartek" : return 4;
        case "piątek" : return 5;
        case "sobota" : return 6;
        case "niedziela" : return 7;
        default: throw new IllegalArgumentException("nie ma takiego dnia");
        }
    }

    public static void main(String[] args) {
        String dzien = "środa";
        
        System.out.println(dajNumer(dzien));
        
    }

}



