<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class p03570 {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			char[] s = in.next().toCharArray();
			int[] d = new int[1 << 26];
			Arrays.fill(d, s.length);
			d[0] = 0;
			int mask = 0;
			int ans = s.length;
			for (int i = 0; i < s.length; i++) {
				int c = s[i] - 'a';
				mask ^= 1 << c;
				for (int j = -1; j < 26; j++) {
					int m = j < 0 ? 0 : (1 << j);
					int cur = 1 + d[m ^ mask];
					d[mask] = Math.min(d[mask], cur);
					if (i == s.length - 1) {
						ans = Math.min(ans, cur);
					}
				}
			}
			out.println(ans);
		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

	}
}


```
[/INST]
```python
import sys

def solve(input, output):
    s = input.readline().strip()
    d = [2**i for i in range(26)]
    d[0] = 0
    mask = 0
    ans = len(s)
    for i in range(len(s)):
        c = s[i] - 'a'
        mask ^= 1 << c
        for j in range(-1, 26):
            m = j < 0 and 0 or (1 << j)
            cur = 1 + d[m ^ mask]
            d[mask] = min(d[mask], cur)
            if i == len(s) - 1:
                ans = min(ans, cur)
    output.write(str(ans) + '\n')

if __name__ == '__main__':
    input = sys.stdin
    output = sys.stdout
    solve(input, output)
```</s>
