<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Python version of your Java code:

```python
import math

def primes(N):
    sieve = [True] * (N + 1)
    for x in range(2, int(N**0.5) + 1):
        if sieve[x]:
            for i in range(x*x, N + 1, x):
                sieve[i] = False
    return [x for x in range(2, N + 1) if sieve[x]]

def main():
    A, B = map(int, input().split())
    L = max(A - B, 2)
    H = A + B
    primes_list = primes(int(math.sqrt(H)) + 1)
    count = [0] * (H - L + 1)
    ok = [True] * (H - L + 1)
    for p in primes_list[::-1]:
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
    print(sum(ok))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as your Java code. It generates all prime numbers up to the square root of `H`, then for each prime number, it iterates over the range from `L` to `H`. For each number, it counts the number of times the prime number divides it, and updates the `count` and `ok` lists accordingly. Finally, it prints the number of elements in `ok` that are `True`.
<|EOT|>
