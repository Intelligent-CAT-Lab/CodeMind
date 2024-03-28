Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
4

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
			if (tokenizer == null ||!tokenizer.hasMoreTokens()) {
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

class p02331:
    def __init__(self):
        self.MOD = 1000000007

    def main(self):
        sc = self.SC(sys.stdin)
        n, k = map(int, sc.next().split())
        ans = 1
        for i in range(n):
            ans = (ans * k) % self.MOD
        self.pl(ans)

    def pl(self, o):
        print(o)

    def p(self, o):
        print(o, end='')

    class SC:
        def __init__(self, f):
            self.f = f
            self.buf = ''

        def next(self):
            while True:
                if '\n' in self.buf:
                    i = self.buf.index('\n')
                    r = self.buf[:i]
                    self.buf = self.buf[i+1:]
                    return r
                try:
                    self.buf += self.f.readline().strip()
                except:
                    return None

        def nextInt(self):
            return int(self.next())

        def nextLong(self):
            return long(self.next())

        def nextDouble(self):
            return float(self.next())

        def nextLine(self):
            return self.next()

if __name__ == '__main__':
    p02331().main()
```<|endoftext|>
