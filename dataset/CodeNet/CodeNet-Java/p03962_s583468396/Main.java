import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        
        int n = 3;
        
        if(a==b&&a==c) n -= 2;
        else if(a == b) n--;
        else if(a == c) n--;
        else if(b == c) n--;

        System.out.print( n );
        System.out.println();
	}
}