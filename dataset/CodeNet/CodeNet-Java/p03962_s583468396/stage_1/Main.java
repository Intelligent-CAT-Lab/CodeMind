import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);

var newVariable_0 = sc.next();        int a = Integer.parseInt(newVariable_0);
var newVariable_1 = sc.next();        int b = Integer.parseInt(newVariable_1);
var newVariable_2 = sc.next();        int c = Integer.parseInt(newVariable_2);
        
        int n = 3;
        
        if(a==b&&a==c) n -= 2;
        else if(a == b) n--;
        else if(a == c) n--;
        else if(b == c) n--;

        System.out.print( n );
        System.out.println();
	}
}