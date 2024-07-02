import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static ArrayList<Integer> primes(int N) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		BitSet bs = new BitSet(N + 1);
		for (int i = 2; i <= N; i = bs.nextClearBit(i + 1)) {
System.out.println("[INST]11;i;bs.nextClearBit(i + 1);"+i);
			ret.add(i);
System.out.println("[INST]12;None;ret.add(i);"+ret.add(i));
			for (int j = i * 2; j <= N; j += i) {
				bs.set(j);
System.out.println("[INST]14;None;bs.set(j);"+bs.set(j));
			}
		}
		return ret;
	}

	static int ans = 0;
	static ArrayList<Integer> primes;
	static long L, H;

	public static void main(String[] args) throws Exception {
		long A = sc.nextLong();
System.out.println("[INST]25;A;sc.nextLong();"+A);
		long B = sc.nextLong();
System.out.println("[INST]26;B;sc.nextLong();"+B);
		L = Math.max(A - B, 2);
System.out.println("[INST]27;L;Math.max(A - B, 2);"+L);
		H = A + B;
		primes = primes((int) (Math.sqrt(H) + 1));
System.out.println("[INST]29;None;Math.sqrt(H);"+Math.sqrt(H));
		int[] count = new int[(int) (H - L + 1)];
		boolean[] ok = new boolean[(int) (H - L + 1)];
		Arrays.fill(ok, true);
System.out.println("[INST]32;None;Arrays.fill(ok, true);"+Arrays.fill(ok, true));
		for (int i = primes.size() - 1; i >= 0; --i) {
System.out.println("[INST]33;None;primes.size();"+primes.size());
			int p = primes.get(i);
System.out.println("[INST]34;p;primes.get(i);"+p);
			long div = (L + (p - 1)) / p;
//			System.out.println(p + " " + div + " " + (div * p));
			for (long pos = div * p; pos <= H; pos += p, ++div) {
				int cc = 1;
				long v = div;
				while (v % p == 0) {
					++cc;
					v /= p;
				}
//				System.out.println(p + " " + div + " " + cc + " " + count[(int) (pos - L)]);
				if (count[(int) (pos - L)] > cc) {
					ok[(int) (pos - L)] = false;
				}
				count[(int) (pos - L)] = cc;
			}
		}

		int ret = 0;
		for (int i = 0; i < ok.length; ++i) {
			if (ok[i]) {
//				System.out.println(i + L);
				++ret;
			}
		}
		System.out.println(ret);
	}
}