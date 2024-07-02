import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
System.out.println("[INST]5;h;sc.nextInt();"+h);
		int w = sc.nextInt();
System.out.println("[INST]6;w;sc.nextInt();"+w);
		int x = sc.nextInt();
System.out.println("[INST]7;x;sc.nextInt();"+x);
		int y = sc.nextInt();
System.out.println("[INST]8;y;sc.nextInt();"+y);
		if (h * w % 2 == 1 && (x + y) % 2 == 1) {
		    System.out.println("No");
		} else {
		    System.out.println("Yes");
		}
	}
}

