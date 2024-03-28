<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
SAT

Expected output:
29

```
import java.io.*;
import java.util.*;


public class p02847 {
	public static void main(String[] args) throws Exception {
		MScanner sc = new MScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		String days[]= {"MON", "TUE", "WED", "THU", "FRI","SAT","SUN"};
		String in=sc.nextLine();
		int idx=0;
		for(int i=0;i<days.length;i++) {
			if(days[i].equals(in)) {
				idx=i;break;
			}
		}
		int ans=((6-idx+7)%7);
		if(ans==0) {
			pw.println(7);
		}
		else
		pw.println(ans);
		pw.flush();
	}

	static class MScanner {
		StringTokenizer st;
		BufferedReader br;

		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int[] takearr(int n) throws IOException {
			int[] in = new int[n];
			for (int i = 0; i < n; i++)
				in[i] = nextInt();
			return in;
		}

		public long[] takearrl(int n) throws IOException {
			long[] in = new long[n];
			for (int i = 0; i < n; i++)
				in[i] = nextLong();
			return in;
		}

		public Integer[] takearrobj(int n) throws IOException {
			Integer[] in = new Integer[n];
			for (int i = 0; i < n; i++)
				in[i] = nextInt();
			return in;
		}

		public Long[] takearrlobj(int n) throws IOException {
			Long[] in = new Long[n];
			for (int i = 0; i < n; i++)
				in[i] = nextLong();
			return in;
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class MScanner:
    def __init__(self, system):
        self.br = sys.stdin

    def next(self):
        return self.br.readline().strip()

    def takearr(self, n):
        in = []
        for i in range(n):
            in.append(self.nextInt())
        return in

    def takearrl(self, n):
        in = []
        for i in range(n):
            in.append(self.nextLong())
        return in

    def takearrobj(self, n):
        in = []
        for i in range(n):
            in.append(self.nextInt())
        return in

    def takearrlobj(self, n):
        in = []
        for i in range(n):
            in.append(self.nextLong())
        return in

    def nextLine(self):
        return self.br.readline().strip()

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextChar(self):
        return self.next()[0]

    def nextLong(self):
        return int(self.next())

    def ready(self):
        return self.br.ready()

    def waitForInput(self):
        time.sleep(3)

def main():
    sc = MScanner(sys.stdin)
    pw = sys.stdout
    days = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
    in = sc.nextLine()
    idx = 0
    for i in range(len(days)):
        if days[i] == in:
            idx = i
            break
    ans = ((6 - idx + 7) % 7)
    if ans == 0:
        pw.write("7\n")
    else:
        pw.write(str(ans) + "\n")
    pw.flush()

if __name__ == "__main__":
    main()
```
Note that this code uses the `sys` module to read from standard input and write to standard output, and the `time` module to sleep for 3 seconds.</s>
