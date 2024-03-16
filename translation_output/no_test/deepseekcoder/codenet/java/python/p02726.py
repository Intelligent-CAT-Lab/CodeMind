<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    sc = Scanner(sys.stdin)
    n, x, y = sc.in_arr(3)
    x -= 1
    y -= 1
    edges = [0]*n
    for i in range(n):
        for j in range(i+1, n):
            edge = min(j-i, min(abs(x-i)+abs(j-y), abs(y-i)+abs(j-x))) + 1
            edges[edge] += 1
    for i in range(1, n):
        print(edges[i])

class Scanner:
    def __init__(self, inp):
        self.inp = inp
        self.st = None

    def next(self):
        while(self.st == None or len(self.st)==0):
            self.st = self.inp.readline().split()
        return self.st.pop(0)

    def next_int(self):
        return int(self.next())

    def in_arr(self, n):
        return [int(x) for x in self.inp.readline().split()[:n]]

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer `n`, two integers `x` and `y`, and then `n` integers from the input. It then calculates the minimum distance between each pair of indices in the range `0` to `n-1`, and increments the corresponding index in the `edges` list. Finally, it prints the values in the `edges` list, excluding the first value (which is always 0).
<|EOT|>
