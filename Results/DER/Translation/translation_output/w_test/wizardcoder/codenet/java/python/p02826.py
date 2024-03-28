Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 998244353

Expected output:
3


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p02826 {
	
	static int MOD, N;
	static int[][] table;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		N = sc.nextInt();
		MOD = sc.nextInt();
		
		table = new int[N + 1][N + 1];
		for (int rem = 0; rem < N + 1 ; rem++) {
			table[N][rem] = rem;
		}
		for (int pos = N - 1; pos >= 1; pos--) {
			for (int rem = 0; rem < N + 1; rem++) {
				table[pos][rem] = table[pos + 1][rem];
				int factor = Math.min(pos, N + 1 - pos);
				if (factor < rem) {
					table[pos][rem] += table[pos][rem-factor];
					table[pos][rem] %= MOD;
				}
			}
		}
		out.println(table[1][N]);
		
		out.flush();
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null ||!tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}

```

### Response:
```python
import sys

MOD = int(sys.stdin.readline().strip())
N = int(sys.stdin.readline().strip())

table = [[0] * (N+1) for _ in range(N+1)]

for i in range(N+1):
    table[N][i] = i

for i in range(N-1, 0, -1):
    for j in range(N+1):
        table[i][j] = table[i+1][j]
        if j >= i:
            table[i][j] += table[i][j-i]
            table[i][j] %= MOD

print(table[1][N])
```<|endoftext|>
