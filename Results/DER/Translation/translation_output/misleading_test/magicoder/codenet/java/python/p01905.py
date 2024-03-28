<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 0

Expected output:
-91

```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class p01905 {
	int N,M;
	int[] a;
	public void solve() {
		N = nextInt();
		M = nextInt();

		a = new int[N];

		for(int i = 0;i < M;i++){
			a[i] = nextInt();
		}
		boolean[] b = new boolean[N * 2 - 1];
		Arrays.fill(b,true);
		for(int i = 0;i < M;i++){
			b[a[i]+N-1] = false;
		}

		for(int i = N*2-2;i > 0;i-=2){
			if(b[i] && b[i-1])b[(i-2)/2] = true;
			else if(b[i] || b[i-1])b[(i-2)/2] = true;
			else b[(i-2)/2] = false;
		}

		int ans = 0;
		for(int i = 0;i < N-1;i++){
			if(b[i*2+1] && b[i*2+2])ans++;
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		out.flush();
		new p01905().solve();
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
		while (hasNextByte() && !isPrint(buffer[p])) {
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

@@ Response
```python
import sys

class p01905:
    def __init__(self):
        self.N, self.M = map(int, sys.stdin.readline().split())
        self.a = list(map(int, sys.stdin.readline().split()))

    def solve(self):
        b = [True] * (self.N * 2 - 1)
        for i in self.a:
            b[i + self.N - 1] = False

        for i in range(self.N * 2 - 2, 0, -2):
            if b[i] and b[i - 1]:
                b[(i - 2) // 2] = True
            elif b[i] or b[i - 1]:
                b[(i - 2) // 2] = True
            else:
                b[(i - 2) // 2] = False

        ans = 0
        for i in range(self.N - 1):
            if b[i * 2 + 1] and b[i * 2 + 2]:
                ans += 1

        print(ans)

p01905().solve()
```

This Python code does the same thing as the Java code. It reads the input, performs the same operations, and prints the result. The input is read using the `sys.stdin.readline()` function, which reads a line of input from the standard input. The `map()` function is used to convert the input into integers. The `list()` function is used to convert the input into a list of integers. The `print()` function is used to output the result.<｜end▁of▁sentence｜>
