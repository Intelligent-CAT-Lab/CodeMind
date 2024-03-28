<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
```python
import sys

def next_int():
    global buf, ptr, buflen
    while ptr < buflen:
        if not is_printable(buf[ptr]):
            ptr += 1
        else:
            yield buf[ptr]
            ptr += 1

def is_printable(c):
    return 33 <= c and c <= 126

def skip_unprintable():
    global ptr
    while has_next() and not is_printable(next()):
        ptr += 1

def has_next():
    skip_unprintable()
    return next_byte() != -1

def next_byte():
    global buf, ptr, buflen
    if not has_next():
        raise NoSuchElementException()
    return buf[ptr - 1]

def next_int():
    global buf, ptr, buflen
    if not has_next():
        raise NoSuchElementException()
    n = 0
    minus = False
    b = next_byte()
    if b == '-':
        minus = True
        b = next_byte()
    if not (b >= '0' and b <= '9'):
        raise NumberFormatException()
    while True:
        if b >= '0' and b <= '9':
            n *= 10
            n += b - '0'
        elif b == -1 or not is_printable(b):
            return minus * n if minus else n
        else:
            raise NumberFormatException()
        b = next_byte()

if __name__ == '__main__':
    N, M = map(int, next_int().split())
    MOD = 1000000007
    dp = [[[0 for _ in range(N + 1)] for _ in range(M + 1)] for _ in range(N + 1)]
    dp[0][1][1] = 1
    for i in range(M):
        for j in range(N):
            for k in range(N):
                # add town unused
                if j != N:
                    dp[i + 1][j + 1][k] += (int)(((10 ** (N - j)) % MOD) * (N - j))
                    dp[i + 1][j + 1][k] %= MOD
                # add town used but not in loop
                dp[i + 1][j][k] += (int)(((10 ** (j - k)) % MOD) * (j - k))
                dp[i + 1][j][k] %= MOD
                # add town used and in loop
                dp[i + 1][j][j] += (int)(((10 ** (j * k)) % MOD) * k)
                dp[i + 1][j][j] %= MOD
    print(dp[M][N][N])
```</s>
