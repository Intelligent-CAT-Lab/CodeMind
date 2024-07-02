import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int n = ni();
		
		long[] a = new long[11];
		a[0] = 1;
		for(int i = 1;i < 11;i++){
			outer:
			for(int v = 1;;v++){
				Set<Long> set = new HashSet<>();
				set.add((long)v);
System.out.println("[INST]24;None;set.add((long)v);"+set.add((long)v));
				for(int k = 0;k < i;k++){
					if(!set.add(a[k]))continue outer;
System.out.println("[INST]26;None;set.add(a[k]);"+set.add(a[k]));
					if(!set.add(a[k]+v))continue outer;
System.out.println("[INST]27;None;set.add(a[k]+v);"+set.add(a[k]+v));
					for(int l = 0;l < k;l++){
						if(!set.add(a[k]+a[l]))continue outer;
System.out.println("[INST]29;None;set.add(a[k]+a[l]);"+set.add(a[k]+a[l]));
					}
				}
				a[i] = v;
				break;
			}
		}
		
		long[][] g = new long[10][10];
		g[0][1] = g[1][0] = 1;
		g[0][2] = g[2][0] = 2;
		g[1][2] = g[2][1] = 3;
		long[] ms = new long[10];
		ms[1] = 1;
		ms[2] = 2;
		ms[3] = 4;
		ms[4] = 20;
		ms[5] = 171;
		ms[6] = 2565;
		ms[7] = 55684;
		ms[8] = 2020373;
		ms[9] = 98222240;
		for(int i = 3;i < 10;i++){
			for(int j = 0;j < i;j++){
				g[i][j] = g[j][i] = ms[i] * a[j];
			}
		}
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				out.print(g[i][j] + " ");
			}
			out.println();
		}
	}
	
	public static boolean nextPermutation(int[] a) {
		int n = a.length;
		int i;
		for (i = n - 2; i >= 0 && a[i] >= a[i + 1]; i--)
			;
		if (i == -1)
			return false;
		int j;
		for (j = i + 1; j < n && a[i] < a[j]; j++)
			;
		int d = a[i];
		a[i] = a[j - 1];
		a[j - 1] = d;
		for (int p = i + 1, q = n - 1; p < q; p++, q--) {
			d = a[p];
			a[p] = a[q];
			a[q] = d;
		}
		return true;
	}

	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
System.out.println("[INST]88;S;System.currentTimeMillis();"+S);
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
System.out.println("[INST]89;None;INPUT.isEmpty();"+INPUT.isEmpty());
System.out.println("[INST]89;None;INPUT.getBytes();"+INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
System.out.println("[INST]93;None;out.flush();"+out.flush());
		long G = System.currentTimeMillis();
System.out.println("[INST]94;G;System.currentTimeMillis();"+G);
		tr(G-S+"ms");
	}
	
	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;
		
		try {
			is.mark(1000);
System.out.println("[INST]105;None;is.mark(1000);"+is.mark(1000));
			while(true){
				int b = is.read();
System.out.println("[INST]107;b;is.read();"+b);
				if(b == -1){
					is.reset();
System.out.println("[INST]109;None;is.reset();"+is.reset());
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
System.out.println("[INST]112;None;is.reset();"+is.reset());
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
System.out.println("[INST]129;lenbuf;is.read(inbuf);"+lenbuf);
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
System.out.println("[INST]147;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
			b = readByte();
		}
		return sb.toString();
System.out.println("[INST]150;None;sb.toString();"+sb.toString());
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
System.out.println("[INST]161;None;Arrays.copyOf(buf, p);"+Arrays.copyOf(buf, p));
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
System.out.println("[INST]219;None;INPUT.length();"+INPUT.length());
}
