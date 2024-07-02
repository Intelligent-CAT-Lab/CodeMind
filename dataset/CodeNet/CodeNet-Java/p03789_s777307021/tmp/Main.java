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
	
	static void solve()
	{
		char[] s = ns().toCharArray();
		int n = s.length;
		long[] has = new long[n+1];
		for(int i = 1;i <= n;i++){
			has[i] = s[i-1]-'0';
		}
		
		long low = 0, high = 1000000000;
		outer:
		while(high - low > 1){
			long h = high+low>>1;
			long[] lhas = Arrays.copyOf(has, n+1);
System.out.println("[INST]25;lhas;Arrays.copyOf(has, n+1);"+lhas);
			long to = h;
			for(int i = n;i >= 1;i--){
				if(lhas[i] > to){
					low = h;
					continue outer;
				}
				long plus = Math.max(0, (to-lhas[i])/10);
System.out.println("[INST]32;plus;Math.max(0, (to-lhas[i])/10);"+plus);
				lhas[i-1] -= plus;
				lhas[i] += plus * 10;
				to = lhas[i];
			}
			high = h;
		}
		out.println((high+8)/9);
	}
	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
System.out.println("[INST]44;S;System.currentTimeMillis();"+S);
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
System.out.println("[INST]45;None;INPUT.isEmpty();"+INPUT.isEmpty());
System.out.println("[INST]45;None;INPUT.getBytes();"+INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
System.out.println("[INST]49;None;out.flush();"+out.flush());
		long G = System.currentTimeMillis();
System.out.println("[INST]50;G;System.currentTimeMillis();"+G);
		tr(G-S+"ms");
	}
	
	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;
		
		try {
			is.mark(1000);
System.out.println("[INST]61;None;is.mark(1000);"+is.mark(1000));
			while(true){
				int b = is.read();
System.out.println("[INST]63;b;is.read();"+b);
				if(b == -1){
					is.reset();
System.out.println("[INST]65;None;is.reset();"+is.reset());
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
System.out.println("[INST]68;None;is.reset();"+is.reset());
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
System.out.println("[INST]85;lenbuf;is.read(inbuf);"+lenbuf);
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
System.out.println("[INST]103;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
			b = readByte();
		}
		return sb.toString();
System.out.println("[INST]106;None;sb.toString();"+sb.toString());
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
System.out.println("[INST]117;None;Arrays.copyOf(buf, p);"+Arrays.copyOf(buf, p));
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
System.out.println("[INST]175;None;INPUT.length();"+INPUT.length());
}
