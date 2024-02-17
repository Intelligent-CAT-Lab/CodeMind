import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b == 100) b = 101;
		if(a == 0) System.out.println(b);
		else if(a == 1) System.out.println(100 * b);
		else System.out.println(10000 * b);
		
	}
}