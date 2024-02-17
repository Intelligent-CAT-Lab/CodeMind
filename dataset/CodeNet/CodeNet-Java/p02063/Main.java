import java.util.Scanner;

public class Main {
	static long startTime = System.currentTimeMillis();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long A = sc.nextLong();
		long B = sc.nextLong();
		for (long i = B + 1; ; i++) {
			if ((i & 0xFF) == 0 && System.currentTimeMillis() - startTime > 3500) break;
			long ca = i / A + i % A;
			long remb = i % B;
			long cb = i / B + remb / A + remb % A;
			if (ca < cb) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

}

