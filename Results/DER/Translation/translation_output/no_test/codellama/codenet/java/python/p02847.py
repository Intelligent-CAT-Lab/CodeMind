<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

days = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]

def get_day_index(day):
    for i, d in enumerate(days):
        if d == day:
            return i
    return -1

def get_next_day(day):
    idx = get_day_index(day)
    if idx == -1:
        return -1
    return (idx + 1) % 7

def main():
    day = sys.stdin.readline().strip()
    next_day = get_next_day(day)
    if next_day == -1:
        print("Invalid input")
    else:
        print(days[next_day])

if __name__ == "__main__":
    main()
```
This is a Python implementation of the Java code you provided. It uses the `sys` module to read input from stdin and the `enumerate` function to iterate over the days of the week. The `get_day_index` function returns the index of the day in the `days` list, and the `get_next_day` function returns the next day in the week based on the input day. The `main` function reads a line of input from stdin, calls `get_next_day` with the input day, and prints the result.</s>
