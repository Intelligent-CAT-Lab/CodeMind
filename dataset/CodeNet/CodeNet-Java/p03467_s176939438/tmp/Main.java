import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	static int mod = 998244353;
	
	static Map<Long, Long> cache = new HashMap<>();
	static Map<Long, Long> cache2 = new HashMap<>();
	
	static long dfs(char[] s)
	{
		long code = s.length*s.length;
		for(char c : s){
			code = code * 1000000009 + c * c;
		}
		if(cache.containsKey(code))return cache.get(code);
System.out.println("[INST]24;None;cache.containsKey(code);"+cache.containsKey(code));
System.out.println("[INST]24;None;cache.get(code);"+cache.get(code));
		
		if(s.length == 1){
			return s[0]-'0'+1;
		}
		
		long ret = 0;
		int n = s.length;
		for(int i = 1;i < n;i++){
			char[] L = new char[i];
			System.arraycopy(s, 0, L, 0, L.length);
System.out.println("[INST]34;None;System.arraycopy(s, 0, L, 0, L.length);"+System.arraycopy(s, 0, L, 0, L.length));
			char[] R = new char[n-i];
			System.arraycopy(s, L.length, R, 0, R.length);
System.out.println("[INST]36;None;System.arraycopy(s, L.length, R, 0, R.length);"+System.arraycopy(s, L.length, R, 0, R.length));
			ret += dfs(L) * efs(R);
			ret %= mod;
		}
//		for(int d = 1;d <= n/2+1 && d < n;d++){
//			if(n % d == 0){
//				char[] U = new char[d];
//				Arrays.fill(U, '1');
//				for(int i = 0;i < n;i++){
//					if(s[i] == '0')U[i%d] = '0';
//				}
//				ret += pow(dfs(U), n/d, mod);
//				ret %= mod;
//			}
//		}
		ret += efs(s);
		ret %= mod;
		cache.put(code, ret);
System.out.println("[INST]53;None;cache.put(code, ret);"+cache.put(code, ret));
		return ret;
	}
	
	static long efs(char[] s)
	{
		long code = s.length*s.length;
		for(char c : s){
			code = code * 1000000009 + c * c;
		}
		if(cache2.containsKey(code))return cache2.get(code);
System.out.println("[INST]63;None;cache2.containsKey(code);"+cache2.containsKey(code));
System.out.println("[INST]63;None;cache2.get(code);"+cache2.get(code));
		
		if(s.length == 1){
			return s[0]-'0'+1;
		}
		
		long ret = 0;
		int n = s.length;
		for(int d = 1;d <= n/2+1 && d < n;d++){
			if(n % d == 0){
				char[] U = new char[d];
				Arrays.fill(U, '1');
System.out.println("[INST]74;None;Arrays.fill(U, '1');"+Arrays.fill(U, '1'));
				for(int i = 0;i < n;i++){
					if(s[i] == '0')U[i%d] = '0';
				}
				ret += dfs(U);
				ret %= mod;
			}
		}
		cache2.put(code, ret);
System.out.println("[INST]82;None;cache2.put(code, ret);"+cache2.put(code, ret));
		return ret;
	}
	
	public static long pow(long a, long n, long mod) {
		//		a %= mod;
		long ret = 1;
		int x = 63 - Long.numberOfLeadingZeros(n);
System.out.println("[INST]89;None;Long.numberOfLeadingZeros(n);"+Long.numberOfLeadingZeros(n));
		for (; x >= 0; x--) {
			ret = ret * ret % mod;
			if (n << 63 - x < 0)
				ret = ret * a % mod;
		}
		return ret;
	}

	
	static void solve()
	{
		char[] s = ns().toCharArray();
		int n = s.length;
		out.println(dfs(s));
	}
	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
System.out.println("[INST]108;S;System.currentTimeMillis();"+S);
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
System.out.println("[INST]109;None;INPUT.isEmpty();"+INPUT.isEmpty());
System.out.println("[INST]109;None;INPUT.getBytes();"+INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
System.out.println("[INST]113;None;out.flush();"+out.flush());
		long G = System.currentTimeMillis();
System.out.println("[INST]114;G;System.currentTimeMillis();"+G);
		tr(G-S+"ms");
	}
	
	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;
		
		try {
			is.mark(1000);
System.out.println("[INST]125;None;is.mark(1000);"+is.mark(1000));
			while(true){
				int b = is.read();
System.out.println("[INST]127;b;is.read();"+b);
				if(b == -1){
					is.reset();
System.out.println("[INST]129;None;is.reset();"+is.reset());
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
System.out.println("[INST]132;None;is.reset();"+is.reset());
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
System.out.println("[INST]149;lenbuf;is.read(inbuf);"+lenbuf);
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
System.out.println("[INST]167;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
			b = readByte();
		}
		return sb.toString();
System.out.println("[INST]170;None;sb.toString();"+sb.toString());
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
System.out.println("[INST]181;None;Arrays.copyOf(buf, p);"+Arrays.copyOf(buf, p));
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
System.out.println("[INST]239;None;INPUT.length();"+INPUT.length());
}
