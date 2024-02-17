import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int X0 = sc.nextInt();
		if (X0 == 0) {
			System.out.println(0);
			return;
		}
		long DIV = 1L << 52;
		long SHIFT = -(Long.MIN_VALUE / DIV);
		int[] c = new int[(int) (Long.MAX_VALUE / DIV + SHIFT + 1)];
		long x = X0;
		for (int i = 0; i < N; ++i) {
			c[(int) (x / DIV + SHIFT)]++;
			x ^= x << 13;
			x ^= x >>> 7;
			x ^= x << 17;
		}
		int pos = 0;
		while (true) {
			K -= c[pos];
			if (K <= 0) {
				K += c[pos];
				break;
			}
			++pos;
		}
		long[] list = new long[c[pos]];
		int ai = 0;
		x = X0;
		for (int i = 0; i < N; ++i) {
			int idx = (int) (x / DIV + SHIFT);
			if (idx == pos) list[ai++] = x;
			x ^= x << 13;
			x ^= x >>> 7;
			x ^= x << 17;
		}
		Arrays.sort(list);
		System.out.println(list[K - 1]);
	}

}