Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 20

Expected output:
70

```
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class p03479
{
	InputStream is;
	PrintWriter out;
	String INPUT = "";
	void solve()
	{
		long x=nl(),y=nl();
		int ans=0;
		for(long i=x;i<=y;i=i*2) {
			ans++;
		}
		out.println(ans);

	}
	
	
		
	void run() throws Exception
	{
		is = INPUT.isEmpty()? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
	}
	
	public static void main(String[] args) throws Exception 
	{ new p03479().run(); }
	
	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;
	
	private int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf)
		{
			ptrbuf = 0;
			try 
			{ lenbuf = is.read(inbuf); } 
			catch (IOException e) 
			{ throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private boolean isSpaceChar(int c)
	{ return!(c >= 33 && c <= 126); }
	private int skip() 
	{ int b; while((b = readByte())!= -1 && isSpaceChar(b)); return b; }
	
	private double nd() 
	{ return Double.parseDouble(ns()); }
	private char nc()
	{ return (char)skip(); }
	
	private String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b)))
		{ // when nextLine, (isSpaceChar(b) && b!='')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	private char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n &&!(isSpaceChar(b)))
		{
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p? buf : Arrays.copyOf(buf, p);
	}
	
	private char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}
	
	private int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}
	
	private int ni()
	{
		int num = 0, b;
		boolean minus = false;
		while((b = readByte())!= -1 &&!((b >= '0' && b <= '9') || b == '-'));
		if(b == '-')
		{
			minus = true;
			b = readByte();
		}
		
		while(true)
		{
			if(b >= '0' && b <= '9')
			{
				num = num * 10 + (b - '0');
			}else
			{
				return minus? -num : num;
			}
			b = readByte();
		}
	}
	
	private long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte())!= -1 &&!((b >= '0' && b <= '9') || b == '-'));
		if(b == '-')
		{
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9')
			{
				num = num * 10 + (b - '0');
			}else
			{
				return minus? -num : num;
			}
			b = readByte();
		}
	}
	
	private static void tr(Object... o) 
	{ System.out.println(Arrays.deepToString(o)); }
}

```

### Response:
```python
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.math.BigDecimal
import java.math.BigInteger
import java.util.ArrayDeque
import java.util.ArrayList
import java.util.Arrays
import java.util.Collections
import java.util.HashSet
import java.util.InputMismatchException
import java.util.Stack
import java.util.TreeMap
import java.util.TreeSet

class p03479:
    def __init__(self):
        self.is = None
        self.out = None
        self.INPUT = ""

    def solve(self):
        x = self.nl()
        y = self.nl()
        ans = 0
        for i in range(x, y+1):
            if i & (i-1) == 0:
                ans += 1
        self.out.println(ans)

    def run(self):
        self.is = INPUT.isEmpty() and System.in or ByteArrayInputStream(INPUT.getBytes())
        self.out = PrintWriter(System.out)

        s = System.currentTimeMillis()
        self.solve()
        self.out.flush()
        if not INPUT.isEmpty():
            tr(System.currentTimeMillis()-s+"ms")

    def readByte(self):
        if self.lenbuf == -1:
            raise InputMismatchException()
        if self.ptrbuf >= self.lenbuf:
            self.ptrbuf = 0
            try:
                self.lenbuf = self.is.read(self.inbuf)
            except IOException as e:
                raise InputMismatchException()
            if self.lenbuf <= 0:
                return -1
        return self.inbuf[self.ptrbuf]

    def isSpaceChar(self, c):
        return not (c >= 33 and c <= 126)

    def skip(self):
        b = self.readByte()
        while b!= -1 and self.isSpaceChar(b):
            b = self.readByte()
        return b

    def nd(self):
        return Double.parseDouble(self.ns())

    def nc(self):
        return chr(self.skip())

    def ns(self):
        b = self.skip()
        sb = StringBuilder()
        while not self.isSpaceChar(b):
            sb.appendCodePoint(b)
            b = self.readByte()
        return sb.toString()

    def ns(self, n):
        buf = [0] * n
        b = self.skip()
        p = 0
        while p < n and not self.isSpaceChar(b):
            buf[p] = b
            p += 1
            b = self.readByte()
        return p == n and buf or Arrays.copyOf(buf, p)

    def nm(self, n, m):
        map = [0] * n
        for i in range(n):
            map[i] = self.ns(m)
        return map

    def na(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.ni()
        return a

    def ni(self):
        num = 0
        b = self.readByte()
        minus = False
        while b!= -1 and not ((b >= '0' and b <= '9') or b == '-'):
            b = self.
