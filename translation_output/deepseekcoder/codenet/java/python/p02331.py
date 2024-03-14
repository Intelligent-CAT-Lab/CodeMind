<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;


class p02331{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		//åºå¥ã§ãããã¼ã«ãåºå¥ã§ããç®±ã«å¥ããå¥ãæ¹ã¯ã
		//1ã¤ã®ãã¼ã«ã«ä»ããç®±ã®åæ°éãæããããããç¬ç«ãªã®ã§ã
		//n kãä¸ããããæ k^nã§ããã
		long MOD=1000000007;
		long n=sc.nextLong();
		long k=sc.nextLong();
		long ans=1;
		for(long i=0; i<n; i++) {
			ans=(ans*k)%MOD;
		}
		pl(ans);

	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
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
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
}

```

### Response:
```python
import sys

class SC:
    def __init__(self, inp=sys.stdin):
        self.reader = inp

    def next(self):
        return self.reader.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())


def pl(o):
    print(o)


def p(o):
    print(o, end='')


MOD = 1000000007
sc = SC()
n = sc.next_long()
k = sc.next_long()
ans = 1
for _ in range(n):
    ans = (ans * k) % MOD
pl(ans)
```

This Python code does the same thing as the Java code. It reads two long integers from the standard input, calculates the result of `k^n` modulo `1000000007`, and prints the result. The `SC` class is a simple scanner that reads from the standard input. The `pl` and `p` functions are shortcuts for `print`.
<|EOT|>
