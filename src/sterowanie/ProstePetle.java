package sterowanie;

import java.util.Scanner;

public class ProstePetle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ile razy?");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            System.out.println("dzień dobry po raz " + i);
        }

    }

}



