package zmienne;

import java.time.LocalTime;

public class Zasieg2 {

    public static void main(String[] args) {
        if(LocalTime.now().getSecond() % 2 == 0) {
            int z = 15;
            System.out.println(z);
        } else {
            String z = "Ala ma kota";
            System.out.println(z);
        }
    }

}



