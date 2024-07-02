import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
System.out.println("[INST]4;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]5;b;sc.nextInt();"+b);
		if(b == 100) b = 101;
		if(a == 0) System.out.println(b);
		else if(a == 1) System.out.println(100 * b);
		else System.out.println(10000 * b);
		
	}
}