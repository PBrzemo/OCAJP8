package sterowanie;

public class PetlaNieskaczona {

	 public static void losowanie() {
	        for (;;) {
	            double x = Math.random();
	            System.out.println("Wylosowałem " + x);
	            if (x > 0.8)
	                break;
	        }
	        System.out.println("za pętlą");
	    }
}
