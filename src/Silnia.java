import java.math.BigInteger;
import java.util.stream.LongStream;

public class Silnia {
    
    public static int silniaR(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return n * silniaR(n-1);
        }
    }
    
    public static int silnia(int n) {
        int wynik = 1;
        for(int i = 1; i <= n; i++) {
            // wynik = wynik * i;
            
            // inny zapis:
            wynik *= i;
        }
        return wynik;
    }

    public static long silniaLong(int n) {
        long wynik = 1;
        for(int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    // poza egzaminem
    // BigInteger - liczby całkowite bez ograniczeń
    // BigDecimal - liczby z ułamkiem dziesiętnym, najlepsze do liczenia pieniędzy
    public static BigInteger silniaBig(int n) {
        BigInteger wynik = BigInteger.ONE;
        for(int i = 1; i <= n; i++) {
            wynik = wynik.multiply(BigInteger.valueOf(i));
        }
        return wynik;
    }
    
    // tutaj po przekroczeniu zakresu wyjdzie zły wynik
    public static long silniaFun(int n) {
        return LongStream.rangeClosed(1, n).reduce(1, (x,y) -> x*y);
    }
    
    // po przekoczeniu zakresu będzie wyjątek
    public static long silniaFun2(int n) {
        return LongStream.rangeClosed(1, n).reduce(1, Math::multiplyExact);
    }
    
    public static void main(String[] args) {
        
        System.out.println(silnia(2)); // 1
        System.out.println(silnia(5)); // 120
        System.out.println(silnia(10));
        System.out.println(silnia(20));
        System.out.println(silnia(35));
        System.out.println(silnia(1000));
        System.out.println();
        
        System.out.println(silniaLong(20)); // OK
        System.out.println(silniaLong(35)); // zle
        System.out.println();
        
        System.out.println(silniaBig(5));
        System.out.println(silniaBig(35));
        System.out.println();

        System.out.println(silniaFun(5));
        System.out.println(silniaFun(10));

    }

}



