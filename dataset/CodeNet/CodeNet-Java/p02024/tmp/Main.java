import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextInt();
System.out.println("[INST]5;h;sc.nextInt();"+h);
		long w = sc.nextInt();
System.out.println("[INST]6;w;sc.nextInt();"+w);
		long s = sc.nextInt();
System.out.println("[INST]7;s;sc.nextInt();"+s);
		long t = sc.nextInt();
System.out.println("[INST]8;t;sc.nextInt();"+t);
		if (h * w % 2 == 1 && (s * w + t) % 2 == 1) {
		    System.out.println("No");
		} else {
		    System.out.println("Yes");
		}
	}
}

