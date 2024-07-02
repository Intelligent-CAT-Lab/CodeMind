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
		int mod = 1000000007;
		
		int[] cum = new int[n+1];
		for(int i = 0;i < n;i++){
			cum[i+1] = cum[i] + s[i]-'a' + 1;
		}
		int[][] next = makeFatNext(cum);
		
		int fl = n-1;
		for(int i = n-2;i >= 0;i--){
			if(s[i] != s[i+1]){
				fl--;
			}else{
				break;
			}
		}
		if(fl == 0){
			out.println(1);
			return;
		}
		
		long ans = 0;
		long[] dp = new long[n+1];
		dp[0] = 1;
		for(int i = 0;i <= n;i++){
			for(int j = 1;j <= 2;j++){
				// jump to end
				if((cum[n] - cum[i]) % 3 == j){
					ans += dp[i];
				}
				int nex = next[(cum[i]+j)%3][i+1]-1;
//				tr(i, j, nex);
				if(nex <= n){
					dp[nex] += dp[i];
					dp[nex] %= mod;
				}
			}
		}
//		tr(next);
//		tr(dp);
		out.println(ans%mod);
	}
	
	public static int[][] makeFatNext(int[] s)
	{
		int n = s.length;
		int[][] next = new int[3][n+1];
		for(int i = 0;i < 3;i++)next[i][n] = n+1;
		for(int i = s.length-1;i >= 0;i--){
			for(int j = 0;j < 3;j++)next[j][i] = next[j][i+1];
			next[s[i]%3][i] = i+1;
		}
		return next;
	}
	

	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
System.out.println("[INST]75;S;System.currentTimeMillis();"+S);
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
System.out.println("[INST]76;None;INPUT.isEmpty();"+INPUT.isEmpty());
System.out.println("[INST]76;None;INPUT.getBytes();"+INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
System.out.println("[INST]80;None;out.flush();"+out.flush());
		long G = System.currentTimeMillis();
System.out.println("[INST]81;G;System.currentTimeMillis();"+G);
		tr(G-S+"ms");
	}
	
	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;
		
		try {
			is.mark(1000);
System.out.println("[INST]92;None;is.mark(1000);"+is.mark(1000));
			while(true){
				int b = is.read();
System.out.println("[INST]94;b;is.read();"+b);
				if(b == -1){
					is.reset();
System.out.println("[INST]96;None;is.reset();"+is.reset());
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
System.out.println("[INST]99;None;is.reset();"+is.reset());
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
System.out.println("[INST]116;lenbuf;is.read(inbuf);"+lenbuf);
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
System.out.println("[INST]134;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
			b = readByte();
		}
		return sb.toString();
System.out.println("[INST]137;None;sb.toString();"+sb.toString());
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
System.out.println("[INST]148;None;Arrays.copyOf(buf, p);"+Arrays.copyOf(buf, p));
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
System.out.println("[INST]206;None;INPUT.length();"+INPUT.length());
}
