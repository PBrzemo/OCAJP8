package sterowanie;

public class Switch4 {
    
    public static void main(String[] args) {        
        //String s = "a";
        //String s = "b";
        String s = "c";
        //String s = null;
        
        switch(s) {
        case "a" : System.out.println("Ala");
        default  : System.out.println("default");
        case "b" : System.out.println("Bolek");
        //NK case null : System.out.println("nullek");
        }
        
        s = null;
        switch(s) {
        }
        // NPE
        
        System.out.println("Koniec");
        
    }

}



