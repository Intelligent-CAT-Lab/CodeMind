<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    sc = MScanner(sys.stdin)
    pw = sys.stdout
    days = ["MON", "TUE", "WED", "THU", "FRI","SAT","SUN"]
    inp = sc.nextLine()
    idx = 0
    for i in range(len(days)):
        if days[i] == inp:
            idx = i
            break
    ans = ((6 - idx + 7) % 7)
    if ans == 0:
        pw.write(str(7) + '\n')
    else:
        pw.write(str(ans) + '\n')
    pw.flush()

class MScanner:
    def __init__(self, inp):
        self.inp = inp

    def next(self):
        return self.inp.readline().strip()

    def nextLine(self):
        return self.inp.readline().strip()

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextChar(self):
        return self.next()[0]

    def nextLong(self):
        return long(self.next())

    def ready(self):
        return self.inp.ready()

    def waitForInput(self):
        time.sleep(3)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a day of the week from the standard input, calculates the number of days until the next Saturday, and writes the result to the standard output. The `MScanner` class is a Python equivalent of the `MScanner` class in the Java code. It provides methods for reading various types of input from the standard input.
<|EOT|>
