package zmienne;

public class Zasieg1 {

    public static void main(String[] args) {
        int x = 13;
        
        // nie można przedeklarować zmiennej lokalnej
        //NK int x = 33;
        // można najwyżej przypisać nową warość
        x = 15;
        
        // blok - wewnątrz można deklarować zmienne
        {
            int y = x + 15;
            System.out.println(y);
            
            // Nie można "przedeklarować" zmiennej lokalnej, która jest w zasięgu
            //NK int x = 77;
        }
        // koniec bloku - koniec zasięgu zmiennych
        
        // zmienna y jest poza zasięgiem
        //NK System.out.println(y);
        
        // teraz y jest poza zasięgiem - wtedy można ponownie użyć tej nazwy, nawet z innym typem
        String y = "Ala";
        System.out.println(y);
    }

}



