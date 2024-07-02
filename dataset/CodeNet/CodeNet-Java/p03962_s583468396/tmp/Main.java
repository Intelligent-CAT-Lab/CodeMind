import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
System.out.println("[INST]7;a;Integer.parseInt(sc.next());"+a);
System.out.println("[INST]7;None;sc.next();"+sc.next());
        int b = Integer.parseInt(sc.next());
System.out.println("[INST]8;b;Integer.parseInt(sc.next());"+b);
System.out.println("[INST]8;None;sc.next();"+sc.next());
        int c = Integer.parseInt(sc.next());
System.out.println("[INST]9;c;Integer.parseInt(sc.next());"+c);
System.out.println("[INST]9;None;sc.next();"+sc.next());
        
        int n = 3;
        
        if(a==b&&a==c) n -= 2;
        else if(a == b) n--;
        else if(a == c) n--;
        else if(b == c) n--;

        System.out.print( n );
        System.out.println();
	}
}