package zmienne;

public class Deklaracje2 {

    public static void main(String[] args) {
        int x = 13;
        System.out.println(x);
        
        int y;
        if(x > 5) {
            y = 100;
            System.out.println(y);
        }
        
        // kompilator nie ma pewności czy y jest zainicjowany
        //NK System.out.println(y);
        
        if(x > 0) {
            y = 11;
        } else {
            y = 18;
        }
        // teraz OK, na y na pewno jest jakaś wartość
        System.out.println(y);
    }

}



