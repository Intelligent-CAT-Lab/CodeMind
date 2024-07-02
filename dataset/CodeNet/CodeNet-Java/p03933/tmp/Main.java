import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	static double[] sins;
	
	static void solve()
	{
		int n = ni();
		long K = nl();
		K--;
		sins = new double[n+1];
		for(int i = 0;i <= n;i++){
			sins[i] = Math.sin(2*Math.PI*i/n)/2;
System.out.println("[INST]20;None;Math.sin(2*Math.PI*i/n);"+Math.sin(2*Math.PI*i/n));
		}
		
		double low = 0, high = 2*Math.PI;
		for(int rep = 0;rep < 50;rep++){
			double h = (low+high)/2;
			if(count(h, n) <= K){
				low = h;
			}else{
				high = h;
			}
		}
		out.printf("%.14f\n", high);
System.out.println("[INST]32;None;out.printf('%.14f\n', high);"+out.printf("%.14f\n", high));
	}
	
	static long count(double h, int n)
	{
		// a b
		// 
		long ret = 0;
		for(int len = 1;len <= n-1;len++){
			int low = 0, high = (n-len)/2+1;
			while(high-low > 1){
				int q = high+low>>1;
				if(S(len, q, n-len-q) <= h){
					low = q;
				}else{
					high = q;
				}
			}
			ret += low*2;
			if(low == (n-len)/2 && (n-len)%2 == 0){
				ret--;
			}
		}
		assert ret*n % 3 == 0;
		return ret*n/3;
	}
	
	static double S(int a, int b, int c)
	{
		return sins[a]+sins[b]+sins[c];
	}
	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
System.out.println("[INST]66;S;System.currentTimeMillis();"+S);
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
System.out.println("[INST]67;None;INPUT.isEmpty();"+INPUT.isEmpty());
System.out.println("[INST]67;None;INPUT.getBytes();"+INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
System.out.println("[INST]71;None;out.flush();"+out.flush());
		long G = System.currentTimeMillis();
System.out.println("[INST]72;G;System.currentTimeMillis();"+G);
		tr(G-S+"ms");
	}
	
	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;
		
		try {
			is.mark(1000);
System.out.println("[INST]83;None;is.mark(1000);"+is.mark(1000));
			while(true){
				int b = is.read();
System.out.println("[INST]85;b;is.read();"+b);
				if(b == -1){
					is.reset();
System.out.println("[INST]87;None;is.reset();"+is.reset());
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
System.out.println("[INST]90;None;is.reset();"+is.reset());
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
System.out.println("[INST]107;lenbuf;is.read(inbuf);"+lenbuf);
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
//	private static boolean isSpaceChar(int c) { return !(c >= 32 && c <= 126); }
	private static int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
	
	private static double nd() { return Double.parseDouble(ns()); }
	private static char nc() { return (char)skip(); }
	
	private static String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){
			sb.appendCodePoint(b);
System.out.println("[INST]125;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
			b = readByte();
		}
		return sb.toString();
System.out.println("[INST]128;None;sb.toString();"+sb.toString());
	}
	
	private static char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
System.out.println("[INST]139;None;Arrays.copyOf(buf, p);"+Arrays.copyOf(buf, p));
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
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
System.out.println("[INST]197;None;INPUT.length();"+INPUT.length());
}
