import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
System.out.println("[INST]7;x;sc.nextInt();"+x);
System.out.println("[INST]7;a;sc.nextInt();"+a);
System.out.println("[INST]7;b;sc.nextInt();"+b);
		
		System.out.println(Math.abs(x-a) > Math.abs(x-b) ? 'B' : 'A');
	}

}
