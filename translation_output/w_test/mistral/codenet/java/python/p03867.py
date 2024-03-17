<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2

Expected output:
6


```
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Collections;

public class p03867 {
	public static long MOD = 1000000007;

	// calcurate n^k
	public static long pow(long n, long k) {
		long ans = 1;
		long tmp = n;
		while(true) {
			if(k==0) {
				return ans;
			}
			if(k % 2 == 1) {
				ans = (ans * tmp) % MOD;
			}
			tmp = (tmp * tmp) % MOD;
			k /= 2;
		}
	}

	public static ArrayList<Integer> divisors(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i*i <= n; i++) {
			if(n % i == 0) {
				list.add(i);
				if(i != n/i) list.add(n/i);
			}
		}
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		FS r = new FS();
		int N = r.nextInt();
		int K = r.nextInt();
		ArrayList<Integer> divisor = divisors(N);
		long[] num = new long[divisor.size()];
		long tmpSum = 0;
		for(int i=0; i<divisor.size(); i++) {
			num[i] = pow(K, (divisor.get(i)+1)/2);
			for(int j=0; j<i; j++) {
				if(divisor.get(i) % divisor.get(j) == 0) {
					num[i] -= num[j];
				}
			}
			while(num[i]<0) num[i] += MOD;
			tmpSum += num[i];
			tmpSum %= MOD;
		}
		long ans = 0;
		for(int i=0; i<divisor.size(); i++) {
			if(num[i]<0) num[i] += MOD;
			num[i] = num[i] % MOD;
		}
		for(int i=0; i<divisor.size(); i++) {
			long d = (long)divisor.get(i);
			if(d%2==0) ans += num[i]*d/2;
			else ans += num[i]*d;
			ans = ans % MOD;
		}
		System.out.println(ans);
	}

	// Read Class
	static class FS {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}

		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public int nextInt() {
			return (int)nextLong();
		}
		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}

```
[/INST]
```python
import math

def pow(n, k):
    ans = 1
    while k != 0:
        if k % 2 == 1:
            ans = (ans * n) % 1000000007
        n = (n * n) % 1000000007
        k //= 2
    return ans

def divisors(n):
    divisors = []
    for i in range(1, int(math.sqrt(n))+1):
        if n % i == 0:
            divisors.append(i)
            if i != n//i:
                divisors.append(n//i)
    divisors.sort()
    return divisors

N, K = map(int, input().split())
divisors = divisors(N)
num = [pow(K, (divisor+1)//2) for divisor in divisors]
for i in range(len(divisors)):
    for j in range(i, len(divisors)):
        if divisors[i] % divisors[j] == 0:
            num[i] -= num[j]
    num[i] %= 1000000007
ans = sum(num) % 1000000007
for divisor in divisors:
    d = divisor
    if divisor % 2 == 0:
        ans += num[i]*d//2
    else:
        ans += num[i]*d
ans %= 1000000007
print(ans)
```</s>
