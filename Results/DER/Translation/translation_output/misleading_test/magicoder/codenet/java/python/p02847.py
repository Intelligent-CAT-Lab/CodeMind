<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    days = ["MON", "TUE", "WED", "THU", "FRI","SAT","SUN"]
    inp = sys.stdin.readline().strip()
    idx = days.index(inp)
    ans = (6 - idx + 7) % 7
    if ans == 0:
        print(7)
    else:
        print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a day of the week from the standard input, finds its index in the list of days, calculates the number of days until the next Saturday (or 7 if it's Saturday), and prints the result.<｜end▁of▁sentence｜>
