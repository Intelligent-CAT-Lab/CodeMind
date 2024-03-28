<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 1 2 5

Expected output:
40


```
import java.io.*;
import java.util.*;

public class p03332 {
	static final StdIn in = new StdIn();
	static final PrintWriter out = new PrintWriter(System.out);
	static final long M=998244353;
	
	public static void main(String[] args) {
		long n=in.nextLong(), a=in.nextLong(), b=in.nextLong(), k=in.nextLong(), ans=0;
		long[] nck = new long[(int)n+1];
		nck[0]=1;
		for(int i=1; i<=n; ++i)
			nck[i]=nck[i-1]*(n-i+1)%M*modI(i, M)%M;
		for(int i=0; i<=n&&a*i<=k; ++i) {
			if((k-a*i)%b==0&&(k-a*i)/b<=n)
				ans+=nck[i]*nck[(int)((k-a*i)/b)]%M;
		}
		out.println(ans%M);
		out.close();
	}
	
	static long modI(long a, long m) {
		if((a%=m)<=1)
			return 1;
		return ((1-modI(m%a, a)*m)/a+m)%m;
	}
	
	static class StdIn {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;
		public StdIn() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		public StdIn(InputStream in) {
			try{
				din = new DataInputStream(in);
			} catch(Exception e) {
				throw new RuntimeException();
			}
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		public String next() {
			int c;
			while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
			StringBuilder s = new StringBuilder();
			while (c != -1)
			{
				if (c == ' ' || c == '\n'||c=='\r')
					break;
				s.append((char)c);
				c=read();
			}
			return s.toString();
		}
		public String nextLine() {
			int c;
			while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
			StringBuilder s = new StringBuilder();
			while (c != -1)
			{
				if (c == '\n'||c=='\r')
					break;
				s.append((char)c);
				c = read();
			}
			return s.toString();
		}
		public int nextInt() {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
				ret = ret * 10 + c - '0';
			while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}
		public int[] readIntArray(int n, int os) {
			int[] ar = new int[n];
			for(int i=0; i<n; ++i)
				ar[i]=nextInt()+os;
			return ar;
		}
		public long nextLong() {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
				ret = ret * 10 + c - '0';
			while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}
		public long[] readLongArray(int n, long os) {
			long[] ar = new long[n];
			for(int i=0; i<n; ++i)
				ar[i]=nextLong()+os;
			return ar;
		}
		public double nextDouble() {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
				ret = ret * 10 + c - '0';
			while ((c = read()) >= '0' && c <= '9');
			if (c == '.')
				while ((c = read()) >= '0' && c <= '9')
					ret += (c - '0') / (div *= 10);
			if (neg)
				return -ret;
			return ret;
		}
		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}
		private byte read() {
			try{
				if (bufferPointer == bytesRead)
					fillBuffer();
				return buffer[bufferPointer++];
			} catch(IOException e) {
				throw new RuntimeException();
			}
		}
		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
}
```

### Response:
```python
import sys

M = 998244353

def modI(a, m):
    if ((a %= m) <= 1):
        return 1
    return ((1 - modI(m % a, a) * m) // a + m) % m

def nck(n):
    nck = [1]*(n+1)
    for i in range(1, n+1):
        nck[i] = nck[i-1]*(n-i+1) % M * modI(i, M) % M
    return nck

def solve(n, a, b, k):
    ans = 0
    nck = nck(n)
    for i in range(n+1):
        if (a*i <= k):
            if ((k-a*i) % b == 0 and (k-a*i)//b <= n):
                ans += nck[i]*nck[(k-a*i)//b] % M
    return ans % M

def main():
    n, a, b, k = map(int, sys.stdin.readline().split())
    print(solve(n, a, b, k))

if __name__ == "__main__":
    main()
```

This Python code reads the input from the standard input, and prints the output to the standard output. The input is expected to be a line containing four space-separated integers. The output is the answer to the problem.
<|EOT|>
