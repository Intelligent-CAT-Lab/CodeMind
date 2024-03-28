<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
201

Expected output:
625

```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class p01829 {
	char[] ch;
	String S;
	boolean[] use = new boolean[10];

	long minDiff = Long.MAX_VALUE;
	String ansStr;
	String startStr;

	public void dfs(int n)
	{
		if(n == ch.length){
			ansStr = startStr;
			return;
		}

		if(n == 0){
			use[(ch[n] - '0' + 5) % 10] = true;
			startStr = startStr + (char)((ch[n] - '0' + 5) % 10 + '0');
			dfs(n + 1);
			return;
		}

		if(!use[ch[n] - '0']){
			dfs2(n,"");
			use[ch[n] - '0'] = true;
			startStr = startStr + ch[n];
			dfs(n + 1);
			return;
		}
		dfs2(n,"");
	}

	public void dfs2(int n,String s){
		if(n == ch.length){
			long a = Long.valueOf(S.substring(startStr.length()));
			long b = Long.valueOf(s);

			long diff = Math.abs(a - b);

			if(minDiff > diff){
				ansStr = startStr + s;
				minDiff = diff;
			}
			return;
		}

		for(int i = 0;i < 10;i++){
			if(use[i])continue;
			use[i] = true;
			dfs2(n + 1,s + (char)(i + '0'));
			use[i] = false;
		}
	}

	public void solve() {
		S = next();
		ch = S.toCharArray();
		startStr = "";
		ansStr = "";
		dfs(0);
		out.println(ansStr);

	}

	public static void main(String[] args) {
		out.flush();
		new p01829().solve();
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
Here is the Python equivalent of the provided Java code:

```python
import sys

class p01829:
    def __init__(self):
        self.ch = []
        self.S = ""
        self.use = [False]*10
        self.minDiff = float('inf')
        self.ansStr = ""
        self.startStr = ""

    def dfs(self, n):
        if n == len(self.ch):
            self.ansStr = self.startStr
            return

        if n == 0:
            self.use[(ord(self.ch[n]) - ord('0') + 5) % 10] = True
            self.startStr += str((ord(self.ch[n]) - ord('0') + 5) % 10)
            self.dfs(n + 1)
            return

        if not self.use[ord(self.ch[n]) - ord('0')]:
            self.dfs2(n, "")
            self.use[ord(self.ch[n]) - ord('0')] = True
            self.startStr += self.ch[n]
            self.dfs(n + 1)
            return
        self.dfs2(n, "")

    def dfs2(self, n, s):
        if n == len(self.ch):
            a = int(self.S[len(self.startStr):])
            b = int(s)
            diff = abs(a - b)
            if self.minDiff > diff:
                self.ansStr = self.startStr + s
                self.minDiff = diff
            return

        for i in range(10):
            if self.use[i]:
                continue
            self.use[i] = True
            self.dfs2(n + 1, s + str(i))
            self.use[i] = False

    def solve(self):
        self.S = sys.stdin.readline().strip()
        self.ch = list(self.S)
        self.startStr = ""
        self.ansStr = ""
        self.dfs(0)
        print(self.ansStr)

if __name__ == "__main__":
    p01829().solve()
```

Please note that Python's `sys.stdin.readline().strip()` is equivalent to Java's `next()` method. Also, Python's `ord()` function is equivalent to Java's `- '0'`.<｜end▁of▁sentence｜>
