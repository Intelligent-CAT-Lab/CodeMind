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

public class Main
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
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
System.out.println("[INST]36;None;INPUT.isEmpty();"+INPUT.isEmpty());
System.out.println("[INST]36;None;INPUT.getBytes();"+INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		long s = System.currentTimeMillis();
System.out.println("[INST]39;s;System.currentTimeMillis();"+s);
		solve();
		out.flush();
System.out.println("[INST]41;None;out.flush();"+out.flush());
		if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
System.out.println("[INST]42;None;INPUT.isEmpty();"+INPUT.isEmpty());
System.out.println("[INST]42;None;System.currentTimeMillis();"+System.currentTimeMillis());
	}
	
	public static void main(String[] args) throws Exception 
	{ new Main().run(); }
	
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
System.out.println("[INST]58;lenbuf;is.read(inbuf);"+lenbuf);
			catch (IOException e) 
			{ throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private boolean isSpaceChar(int c)
	{ return !(c >= 33 && c <= 126); }
	private int skip() 
	{ int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
	
	private double nd() 
	{ return Double.parseDouble(ns()); }
	private char nc()
	{ return (char)skip(); }
	
	private String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b)))
		{ // when nextLine, (isSpaceChar(b) && b != ' ')
			sb.appendCodePoint(b);
System.out.println("[INST]82;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
			b = readByte();
		}
		return sb.toString();
System.out.println("[INST]85;None;sb.toString();"+sb.toString());
	}
	
	private char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b)))
		{
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
System.out.println("[INST]97;None;Arrays.copyOf(buf, p);"+Arrays.copyOf(buf, p));
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
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
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
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
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
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static void tr(Object... o) 
	{ System.out.println(Arrays.deepToString(o)); }
}
