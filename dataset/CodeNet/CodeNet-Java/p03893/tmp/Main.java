import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
System.out.println("[INST]5;x;sc.nextInt();"+x);
		long next = 2;
		for (int i = 0; i < x; i++) {
			next = (next + 1) * 2;
		}
		System.out.println(next);
	}
}
