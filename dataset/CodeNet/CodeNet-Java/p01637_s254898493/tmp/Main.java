import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	int INF = 1 << 28;
	double EPS = 1e-10;

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		long M = sc.nextLong();
System.out.println("[INST]13;M;sc.nextLong();"+M);
		long rd = sc.nextLong();
System.out.println("[INST]14;rd;sc.nextLong();"+rd);
		long rr = sc.nextLong();
System.out.println("[INST]15;rr;sc.nextLong();"+rr);
		long cd = sc.nextLong();
System.out.println("[INST]16;cd;sc.nextLong();"+cd);
		long cr = sc.nextLong();
System.out.println("[INST]17;cr;sc.nextLong();"+cr);
		long r = 0;
		long l = 1000L * 1000L * 1000L * 1000L + 1;
		for (int i = 0; i < 1000; i++) {
			long mid = (r + l) / 2;
			if (cd <= rd * mid / 100) {
				l = mid;
			} else {
				r = mid;
			}
		}
		long x = l;
		r = 0;
		l = M;
		for (int i = 0; i < 1000; i++) {
			long mid = (r + l) / 2;
			if (cr <= rr * mid / 100) {
				l = mid;
			} else {
				r = mid;
			}
		}
		long y = l;
		if (x + y > M) {
			System.out.println(-1);
		} else {
			long D = rd * x / 100;
			long R = rr * y / 100;
			long ans = M - x - y;
			if (D < cd || R < cr) {
				System.out.println(-1);
			} else {
				ans += 100 * (D - cd) / rd;
				ans += 100 * (R - cr) / rr;
				System.out.println(ans);
			}
		}
	}
}