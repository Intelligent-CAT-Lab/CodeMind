<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2 4

Expected output:
5
4
1
0


```
import java.io.*;
import java.util.*;
import java.awt.Point;
public class p02726 {
	static Scanner sc;
	static PrintWriter out;
	static ArrayList<Integer> red,green,colorless;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		sc = new Scanner(System.in); 
		out = new PrintWriter(System.out);
		int n = sc.nextInt(), x = sc.nextInt()-1, y = sc.nextInt()-1;
		int[] edges = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				int edge = Math.min(j-i, Math.min(Math.abs(x-i)+Math.abs(j-y), Math.abs(y-i)+Math.abs(j-x))+1);
				edges[edge]++;
			}
		}
		for (int i = 1; i < n; i++) {
			out.println(edges[i]);
		}
		out.close();
	}
	static class Scanner{
		private BufferedReader br;
		private StringTokenizer st;
		public Scanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}
		public String next() throws IOException{
			while(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
		public int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException{
			return Long.parseLong(next());
		}
		public double nextDouble() throws IOException{
			return Double.parseDouble(next());
		}
		public int[] inArr(int n) throws Exception{
			int a [] = new int[n];
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			return a;
		}
	}

}
```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class Scanner:
    def __init__(self, inp):
        self.inp = inp
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = sys.stdin.readline()
        return self.st.nextToken()

    def nextLine(self):
        return sys.stdin.readline()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def inArr(self, n):
        a = [0] * n
        self.st = sys.stdin.readline()
        for i in range(n):
            a[i] = int(self.st.nextToken())
        return a


class p02726:
    def __init__(self):
        self.sc = Scanner(sys.stdin)
        self.out = sys.stdout
        self.red = []
        self.green = []
        self.colorless = []

    def main(self):
        n = self.sc.nextInt()
        x = self.sc.nextInt() - 1
        y = self.sc.nextInt() - 1
        edges = [0] * n
        for i in range(n):
            for j in range(i + 1, n):
                edge = min(j - i, min(abs(x - i) + abs(j - y), abs(y - i) + abs(j - x)) + 1)
                edges[edge] += 1
        for i in range(1, n):
            self.out.write(str(edges[i]) + "\n")
        self.out.close()


if __name__ == "__main__":
    p02726().main()
```
Note that the `Scanner` class in Python is similar to the `Scanner` class in Java, but it uses the `sys.stdin` and `sys.stdout` streams instead of the `System.in` and `System.out` streams. The `inArr` method in Python is similar to the `inArr` method in Java, but it uses the `sys.stdin.readline()` method instead of the `br.readLine()` method.</s>
