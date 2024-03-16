Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
				if(i!= n/i) list.add(n/i);
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

		private int readByte() { return hasNextByte()? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() &&!isPrintableChar(buffer[ptr])) ptr++;}

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
				} else if(b == -1 ||!isPrintableChar(b)) {
					return minus? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}

```

### Response:
```python
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Collections;

class p03867:
    MOD = 1000000007

    # calcurate n^k
    def pow(self, n, k):
        ans = 1
        tmp = n
        while True:
            if k == 0:
                return ans
            if k % 2 == 1:
                ans = (ans * tmp) % self.MOD
            tmp = (tmp * tmp) % self.MOD
            k //= 2

    def divisors(self, n):
        list = []
        for i in range(1, int(n**0.5)+1):
            if n % i == 0:
                list.append(i)
                if i!= n//i:
                    list.append(n//i)
        list.sort()
        return list

    def main(self):
        r = self.FS()
        N = r.nextInt()
        K = r.nextInt()
        divisor = self.divisors(N)
        num = [0]*len(divisor)
        tmpSum = 0
        for i in range(len(divisor)):
            num[i] = self.pow(K, (divisor[i]+1)//2)
            for j in range(i):
                if divisor[i] % divisor[j] == 0:
                    num[i] -= num[j]
            while num[i] < 0:
                num[i] += self.MOD
            tmpSum += num[i]
            tmpSum %= self.MOD
        ans = 0
        for i in range(len(divisor)):
            if num[i] < 0:
                num[i] += self.MOD
            num[i] %= self.MOD
        for i in range(len(divisor)):
            d = divisor[i]
            if d % 2 == 0:
                ans += num[i]*d//2
            else:
                ans += num[i]*d
            ans %= self.MOD
        print(ans)

    # Read Class
    class FS:
        def __init__(self):
            self.in_ = System.in
            self.buffer_ = bytearray(1024)
            self.ptr_ = 0
            self.buflen_ = 0

        def hasNextByte(self):
            if self.ptr_ < self.buflen_:
                return True
            else:
                self.ptr_ = 0
                try:
                    self.buflen_ = self.in_.read(self.buffer_)
                except IOException as e:
                    e.printStackTrace()
                if self.buflen_ <= 0:
                    return False
            return True

        def readByte(self):
            if self.hasNextByte():
                return self.buffer_[self.ptr_+1]
            else:
                return -1

        def isPrintableChar(self, c):
            return 33 <= c <= 126

        def skipUnprintable(self):
            while self.hasNextByte() and not self.isPrintableChar(self.buffer_[self.ptr_]):
                self.ptr_ += 1

        def hasNext(self):
            self.skipUnprintable()
            return self.hasNextByte()

        def next(self):
            if not self.hasNext():
                raise NoSuchElementException()
            sb = StringBuilder()
            b = self.readByte()
            while self.isPrintableChar(b):
                sb.appendCodePoint(b)
                b =
