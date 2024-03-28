Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7

Expected output:
4
1 1 1 1


```
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class p03769 {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		long n = nl();
		List<Integer> perm = permutationWhoseNumberOfIncreasingSequenceIsK(n);
		out.println(perm.size()*2);
		for(int i = 1;i <= perm.size();i++){
			if(i > 1)out.print(" ");
			out.print(i);
		}
		for(int i = 0;i < perm.size();i++){
			out.print(" ");
			out.print(perm.get(i)+1);
		}
		out.println();
	}
	
	public static List<Integer> permutationWhoseNumberOfIncreasingSequenceIsK(long K)
	{
		long cur = Long.highestOneBit(K+1)-1;
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i < Long.bitCount(cur);i++){
			list.add(i);
		}
		int p = Long.bitCount(cur);
		for(int d = Long.bitCount(cur)-1;d >= 0;d--){
			long x = 1L<<d;
			if(cur + x <= K){
				cur += x;
				list.add(d, p++);
			}
		}
		return list;
	}
	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
		is = INPUT.isEmpty()? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
		long G = System.currentTimeMillis();
		tr(G-S+"ms");
	}
	
	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;
		
		try {
			is.mark(1000);
			while(true){
				int b = is.read();
				if(b == -1){
					is.reset();
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
					return false;
				}
			}
		} catch (IOException e) {
			return true;
		}
	}
	
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;
	
	private static int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private static boolean isSpaceChar(int c) { return!(c >= 33 && c <= 126); }
//	private static boolean isSpaceChar(int c) { return!(c >= 32 && c <= 126); }
	private static int skip() { int b; while((b = readByte())!= -1 && isSpaceChar(b)); return b; }
	
	private static double nd() { return Double.parseDouble(ns()); }
	private static char nc() { return (char)skip(); }
	
	private static String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	private static char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n &&!(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p? buf : Arrays.copyOf(buf, p);
	}
	
	private static char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}
	
	private static int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}
	
	private static int ni()
	{
		int num = 0, b;
		boolean minus = false;
		while((b = readByte())!= -1 &&!((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus? -num : num;
			}
			b = readByte();
		}
	}
	
	private static long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte())!= -1 &&!((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus? -num : num;
			}
			b = readByte();
		}
	}
	
	private static void tr(Object... o) { if(INPUT.length()!= 0)System.out.println(Arrays.deepToString(o)); }
}

```

### Response:
```python
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.util.ArrayList
import java.util.Arrays
import java.util.InputMismatchException
import java.util.List

class p03769:
    is = None
    out = None
    INPUT = ""

    def solve(self):
        n = self.nl()
        perm = self.permutationWhoseNumberOfIncreasingSequenceIsK(n)
        self.out.println(perm.size() * 2)
        for i in range(1, perm.size() + 1):
            if i > 1:
                self.out.print(" ")
            self.out.print(i)
        for i in range(perm.size()):
            self.out.print(" ")
            self.out.print(perm.get(i) + 1)
        self.out.println()

    def permutationWhoseNumberOfIncreasingSequenceIsK(self, K):
        cur = (1 << 63) - 1
        list = ArrayList()
        for i in range(64):
            if (cur & (1 << i))!= 0:
                list.add(i)
        p = list.size()
        for d in range(63, -1, -1):
            x = 1 << d
            if cur + x <= K:
                cur += x
                list.add(d, p)
                p += 1
        return list

    def main(self, args):
        S = System.currentTimeMillis()
        self.is = INPUT.isEmpty() and System.in or ByteArrayInputStream(INPUT.getBytes())
        self.out = PrintWriter(System.out)

        self.solve()
        self.out.flush()
        G = System.currentTimeMillis()
        self.tr(G - S + "ms")

    def eof(self):
        if self.lenbuf == -1
