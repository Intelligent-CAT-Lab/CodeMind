<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class p01392 {
	static Scanner sc = new Scanner(System.in);

	static ArrayList<Integer> primes(int N) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		BitSet bs = new BitSet(N + 1);
		for (int i = 2; i <= N; i = bs.nextClearBit(i + 1)) {
			ret.add(i);
			for (int j = i * 2; j <= N; j += i) {
				bs.set(j);
			}
		}
		return ret;
	}

	static int ans = 0;
	static ArrayList<Integer> primes;
	static long L, H;

	public static void main(String[] args) throws Exception {
		long A = sc.nextLong();
		long B = sc.nextLong();
		L = Math.max(A - B, 2);
		H = A + B;
		primes = primes((int) (Math.sqrt(H) + 1));
		int[] count = new int[(int) (H - L + 1)];
		boolean[] ok = new boolean[(int) (H - L + 1)];
		Arrays.fill(ok, true);
		for (int i = primes.size() - 1; i >= 0; --i) {
			int p = primes.get(i);
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
```

python code:<fim_suffix><fim_middle>
"""
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

class p01392:
	def __init__(self):
		self.sc = Scanner(System.in);
		self.ans = 0;
		self.primes = None;
		self.L = 0;
		self.H = 0;

	def primes(self, N):
		ret = ArrayList<Integer>();
		bs = BitSet(N + 1);
		for i in range(2, N + 1):
			ret.add(i);
			for j in range(i * 2, N + 1, i):
				bs.set(j);
		return ret;

	def main(self):
		A = self.sc.nextLong();
		B = self.sc.nextLong();
		self.L = Math.max(A - B, 2);
		self.H = A + B;
		self.primes = self.primes((int) (Math.sqrt(H) + 1));
		count = [0] * (int) (H - L + 1);
		ok = [True] * (int) (H - L + 1);
		Arrays.fill(ok, True);
		for i in range(self.primes.size() - 1, -1, -1):
			p = self.primes.get(i);
			div = (L + (p - 1)) / p;
			for pos in range(div * p, H + 1, p):
				cc = 1;
				v = div;
				while v % p == 0:
					cc += 1;
					v /= p;
				if count[(int) (pos - L)] > cc:
					ok[(int) (pos - L)] = False;
				count[(int) (pos - L)] = cc;
		ret = 0;
		for i in range(len(ok)):
			if ok[i]:
				ret += 1;
		System.out.println(ret);

p01392().main();
<|endoftext|>
