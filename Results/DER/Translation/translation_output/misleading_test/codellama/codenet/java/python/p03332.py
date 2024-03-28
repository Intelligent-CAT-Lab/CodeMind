<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 1 2 5

Expected output:
113

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class StdIn:
    def __init__(self):
        self.buffer = []
        self.buffer_size = 1 << 16
        self.buffer_pointer = 0
        self.bytes_read = 0

    def read(self):
        if self.buffer_pointer == self.bytes_read:
            self.fill_buffer()
        return self.buffer[self.buffer_pointer++]

    def fill_buffer(self):
        self.bytes_read = sys.stdin.read(self.buffer_size)
        if self.bytes_read == -1:
            self.buffer[0] = -1

    def next(self):
        c = self.read()
        while c != -1 and (c == ' ' or c == '\n' or c == '\r'):
            c = self.read()
        s = ''
        while c != -1 and (c != ' ' and c != '\n' and c != '\r'):
            s += chr(c)
            c = self.read()
        return s

