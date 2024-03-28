<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
9


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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class SC:
    def __init__(self, inp):
        self.reader = inp
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except UncheckedIOException as e:
                raise e
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        try:
            return self.reader.readLine()
        except UncheckedIOException as e:
            raise e

MOD = 1000000007

n = SC(sys.stdin).nextLong()
k = SC(sys.stdin).nextLong()
ans = 1
for i in range(n):
    ans = (ans * k) % MOD

print(ans)
```
Note that the `SC` class is not included in the Python standard library, so you will need to define it yourself. Also, the `StringTokenizer` class is not included in the Python standard library, so you will need to define it yourself or use a different method to tokenize the input.</s>
