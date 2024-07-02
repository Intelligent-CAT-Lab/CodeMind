import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
System.out.println("[INST]5;t1;sc.nextInt();"+t1);
		int t2 = sc.nextInt();
System.out.println("[INST]6;t2;sc.nextInt();"+t2);
		int r1 = sc.nextInt();
System.out.println("[INST]7;r1;sc.nextInt();"+r1);
		int r2 = sc.nextInt();
System.out.println("[INST]8;r2;sc.nextInt();"+r2);
		if (r1 == -1 || r2 == -1) {
		    r1 = -t1;
		    r2 = -t2;
		}
		if (r1 == r2) {
		    System.out.println("Draw");
		} else if (r1 < r2) {
		    System.out.println("Bob");
		} else {
		    System.out.println("Alice");
		}
	}
}

