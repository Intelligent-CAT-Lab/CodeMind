<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
19 30 3

Expected output:
1


```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class p01892 {
	long A,B;
	int N;
	public void solve() {
		A = nextLong();
		B = nextLong();
		N = nextInt();

		long ans = Math.abs(A - B);
		for(int i = 1;i <= N;i++){
			for(int j = 1;j <= N;j++){
				if(i * B % j!= 0)continue;
				ans = Math.min(ans, Math.abs(A - i * B / j));
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		out.flush();
		new p01892().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() &&!isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

class p01892:
	def __init__(self):
		self.A = 0
		self.B = 0
		self.N = 0
		self.ans = 0

	def solve(self):
		self.A = int(sys.stdin.readline())
		self.B = int(sys.stdin.readline())
		self.N = int(sys.stdin.readline())

		self.ans = abs(self.A - self.B)
		for i in range(1, self.N + 1):
			for j in range(1, self.N + 1):
				if i * self.B % j!= 0:
					continue
				self.ans = min(self.ans, abs(self.A - i * self.B / j))

		print self.ans


if __name__ == '__main__':
	p01892().solve()
```
<|endoftext|>
