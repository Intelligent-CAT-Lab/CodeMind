import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n1 = sc.nextInt();
System.out.println("[INST]10;n1;sc.nextInt();"+n1);
		int n2 = sc.nextInt();
System.out.println("[INST]11;n2;sc.nextInt();"+n2);
		int n3 = sc.nextInt();
System.out.println("[INST]12;n3;sc.nextInt();"+n3);
		int n4 = sc.nextInt();
System.out.println("[INST]13;n4;sc.nextInt();"+n4);

		int[] cnt = new int[10];
		cnt[n1]++;
		cnt[n2]++;
		cnt[n3]++;
		cnt[n4]++;
		
		if (cnt[1] == 1 && cnt[9] == 1 && cnt[7] == 1 && cnt[4] == 1) {
			pr.println("YES");
		} else {
			pr.println("NO");
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
