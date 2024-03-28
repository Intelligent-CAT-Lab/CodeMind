<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3

Expected output:
91

```
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class p03924 {
	public static void main(String[] args) {
		FS r = new FS();
		int N = r.nextInt();
		int M = r.nextInt();
		int MOD = 1000000007;
		// dp[days][added town][looped size]
		int[][][] dp = new int[M+1][N+1][N+1];
		dp[0][1][1] = 1;
		for(int i=0; i<M; i++) {
			for(int j=0; j<=N; j++) {
				for(int k=0; k<=N; k++) {
					// add town unused
					if(j!=N) {
						dp[i+1][j+1][k] += (int)(((long)dp[i][j][k]*(N-j))%MOD);
						dp[i+1][j+1][k] %= MOD;
					}
					// add town used but not in loop
					dp[i+1][j][k] += (int)(((long)dp[i][j][k]*(j-k))%MOD);
					dp[i+1][j][k] %= MOD;
					// add town used and in loop
					dp[i+1][j][j] += (int)(((long)dp[i][j][k]*k)%MOD);
					dp[i+1][j][j] %= MOD;
				}
			}
		}
		System.out.println(dp[M][N][N]);
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

Here is the Python code that translates the Java code:
```python
import sys

class FS:
    def __init__(self):
        self.in = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.in.readinto(self.buffer)
            except IOError:
                pass
            if self.buflen <= 0:
                return False

    def read_byte(self):
        return self.has_next_byte() and self.buffer[self.ptr]

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1

    def has_next(self):
        self.skip_unprintable()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise NoSuchElementException()
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return "".join(sb)

    def next_int(self):
        return int(self.next_long())

    def next_long(self):
        if not self.has_next():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.read_byte()
        if b == "-":
            minus = True
            b = self.read_byte()
        if b < "0" or "9" < b:
            raise NumberFormatException()
        while True:
            if "0" <= b and b <= "9":
                n *= 10
                n += ord(b) - ord("0")
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.read_byte()

def main():
    r = FS()
    N = r.next_int()
    M = r.next_int()
    MOD = 1000000007
    # dp[days][added town][looped size]
    dp = [[[0] * (N + 1) for _ in range(N + 1)] for _ in range(M + 1)]
    dp[0][1][1] = 1
    for i in range(M):
        for j in range(N + 1):
            for k in range(N + 1):
                # add town unused
                if j != N:
                    dp[i + 1][j + 1][k] += (dp[
