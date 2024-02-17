
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
		int n = ni(), K = ni()+1;
		int mod = 1000000007;
		long[][] sum = new long[n+1][10000];
		long[][] num = new long[n+1][10000];
		num[n][0] = 1;
		for(int i = n-1;i >= 0;i--){
			for(int j = 0;j < 10000;j++){
				if(num[i+1][j] == 0)continue;
				// [0,K) + j
				// x
				// x > i+1 -> not move
				int notmove = Math.max(K-(i+2), 0);
				int check = 0;
				if(notmove > 0){
					check += notmove;
					num[i][j] += num[i+1][j] * notmove;
					num[i][j] %= mod;
					
					// (i+2+j) ~ (K-1+j)
					sum[i][j] += sum[i+1][j] * notmove + num[i+1][j] * ((K-1+j)*(K+j)/2 - (i+2+j)*(i+1+j)/2);
					sum[i][j] %= mod;
				}
				
				int u = Math.min(K-1, i+1);
				// [0,u] + j
				// [j, u+j]
				for(int d = 0, e = 0;d <= u+j;d += i+1, e++){
					int lnum = Math.min(u+j, d+i) - Math.max(j, d) + 1;
					if(lnum < 0)continue;
					check += lnum;
					int lmax = Math.min(u+j, d+i) - d;
					int lmin = Math.max(j, d) - d;
					num[i][j+e] += num[i+1][j] * lnum;
					num[i][j+e] %= mod;
					
					sum[i][j+e] += sum[i+1][j] * lnum + num[i+1][j] * (lmax*(lmax+1)/2 - lmin*(lmin-1)/2);
					sum[i][j+e] %= mod;
				}
//				tr(i, j, check, K, notmove);
				assert check == K;
			}
		}
		long ans = 0;
		for(int i = 0;i < 10000;i++){
			ans += sum[0][i];
		}
		out.println(ans%mod);
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
