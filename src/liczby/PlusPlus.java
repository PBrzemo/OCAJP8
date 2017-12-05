package liczby;

public class PlusPlus {
public static void main(String[] args) {
	int x =1;
	System.out.println(x++);
	System.out.println(x);	
	System.out.println(++x);
	System.out.println(x);
	
	System.out.println(x+=10);
	System.out.println(x);
	
	x=1;
	while((x*=2)<1000000)
		System.out.println(x);
}
}