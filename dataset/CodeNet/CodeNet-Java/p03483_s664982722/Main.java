
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
		int[] f = new int[26];
		for(char c : s){
			f[c-'a'] += 1;
		}
		int su = 0;
		for(int v : f){
			su += v&1;
		}
		if(su >= 2){
			out.println(-1);
			return;
		}
		
		int[][] g = new int[26][];
		for(int i = 0;i < 26;i++){
			g[i] = new int[f[i]];
		}
		for(int i = n-1;i >= 0;i--){
			g[s[i]-'a'][--f[s[i]-'a']] = i;
		}
		
		int[][] ft = new int[26][];
		for(int i = 0;i < 26;i++){
			ft[i] = new int[g[i].length+3];
			
			for(int j = 0;j < g[i].length;j++){
				addFenwick(ft[i], j, g[i][j]);
				addFenwick(ft[i], j+1, -g[i][j]);
			}
			if(g[i].length > 0)addFenwick(ft[i], g[i].length, g[i][g[i].length-1]);
		}
		
		long ans = 0;
		for(int i = 0;i*2+1 < s.length;i++){
			int mind = 999999999;
			int arg = -1;
			int al = -1, ar = -1;
			for(int j = 0;j < 26;j++){
				if(f[j] < g[j].length-f[j]-1){
					int l = sumFenwick(ft[j], f[j]);
					int r = sumFenwick(ft[j], g[j].length-f[j]-1);
					// i,s.lenth-1-i
					int d = (l-i) + (s.length-1-i-r);
					if(d < mind){
						mind = d;
						arg = j;
						al = l;
						ar = r;
					}
				}
			}
			ans += mind;
			f[arg]++;
			
			for(int j = 0;j < 26;j++){
				int fr0 = firstGEFenwick(ft[j], ar);
				addFenwick(ft[j], fr0, -1);
				int fr = firstGEFenwick(ft[j], al);
				addFenwick(ft[j], fr, -1);
			}
		}
		out.println(ans);
	}
	
	public static int sumFenwick(int[] ft, int i)
	{
		int sum = 0;
		for(i++;i > 0;i -= i&-i)sum += ft[i];
		return sum;
	}
	
	public static void addFenwick(int[] ft, int i, int v)
	{
		if(v == 0 || i < 0)return;
		int n = ft.length;
		for(i++;i < n;i += i&-i)ft[i] += v;
	}
	
	public static int firstGEFenwick(int[] ft, int v)
	{
		int i = 0, n = ft.length;
		for(int b = Integer.highestOneBit(n);b != 0;b >>= 1){
			if((i|b) < n && ft[i|b] < v){
				i |= b;
				v -= ft[i];
			}
		}
		return i;
	}

	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
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
			b = readByte();
		}
		return sb.toString();
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
}
