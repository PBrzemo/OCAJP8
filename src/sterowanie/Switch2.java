package sterowanie;

public class Switch2 {
    
    static String nazwa(int nr) {
        switch(nr) {
        case 1 : return "poniedziałek";
        case 2 : return "wtorek";
        case 3 : return "środa";
        case 4 : return "czwartek";
        case 5 : return "piątek";
        case 6 : return "sobota";
        case 7 : return "niedziela";
        default: throw new IllegalArgumentException("nie ma takiego dnia");
        }
    }

    public static void main(String[] args) {
        int nr = 2;
        
        String napis = nazwa(nr);
        System.out.println("Ten dzień to: " + napis);
        
    }

}



