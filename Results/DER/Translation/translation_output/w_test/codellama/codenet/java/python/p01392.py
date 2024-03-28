<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
18 2

Expected output:
4


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
[/INST]

Here is the Python code that implements the same logic as the Java code:
```python
import math

def primes(N):
    ret = []
    bs = [False] * (N + 1)
    for i in range(2, N + 1):
        if not bs[i]:
            ret.append(i)
            for j in range(i * 2, N + 1, i):
                bs[j] = True
    return ret

def main(A, B):
    L = max(A - B, 2)
    H = A + B
    primes = primes(int(math.sqrt(H) + 1))
    count = [0] * (H - L + 1)
    ok = [True] * (H - L + 1)
    for i in range(len(primes) - 1, -1, -1):
        p = primes[i]
        div = (L + (p - 1)) // p
        for pos in range(div * p, H + 1, p):
            cc = 1
            v = div
            while v % p == 0:
                cc += 1
                v //= p
            if count[pos - L] > cc:
                ok[pos - L] = False
            count[pos - L] = cc
    ret = 0
    for i in range(len(ok)):
        if ok[i]:
            ret += 1
    print(ret)

if __name__ == "__main__":
    A = int(input("Enter A: "))
    B = int(input("Enter B: "))
    main(A, B)
```
Note that the Python code uses the `math` module to perform mathematical operations, and the `input` function to read input from the user. The `range` function is used to iterate over the elements of a list or a string, and the `//` operator is used for integer division. The `math.sqrt` function is used to calculate the square root of a number.</s>
