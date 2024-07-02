import java.util.Scanner;

public class Main {
	static long startTime = System.currentTimeMillis();
System.out.println("[INST]3;startTime;System.currentTimeMillis();"+startTime);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long A = sc.nextLong();
System.out.println("[INST]7;A;sc.nextLong();"+A);
		long B = sc.nextLong();
System.out.println("[INST]8;B;sc.nextLong();"+B);
		for (long i = B + 1; ; i++) {
			if ((i & 0xFF) == 0 && System.currentTimeMillis() - startTime > 3500) break;
System.out.println("[INST]10;None;System.currentTimeMillis();"+System.currentTimeMillis());
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

