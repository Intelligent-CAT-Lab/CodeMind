import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();

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
