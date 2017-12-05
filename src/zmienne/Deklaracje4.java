package zmienne;

import java.time.LocalTime;

public class Deklaracje4 {

    public static void main(String[] args) {
        // final to nie jest to samo co "stała",
        // tutaj kompilator nie wie z góry jaka będzie wartość sekunda
        // final oznacza, że raz wpisanej wartości nie można później zmienić
        final int sekunda = LocalTime.now().getSecond();
        System.out.println(sekunda);
        
        int y;
        if(sekunda < 100) {
            y = 100;
            System.out.println(y);
        }

        // Kompilator znowu nie wie czy y będzie zainicjowany
        //NK System.out.println(y);    
    }

}