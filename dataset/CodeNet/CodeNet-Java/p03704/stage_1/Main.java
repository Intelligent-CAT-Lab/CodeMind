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
		long D = nl();
		long ans = 0;
var newVariable_0 = Long.toString(D);		for(int len = newVariable_0.length();len <= 18;len++){
			long res = dfs(D, 0, len);
			ans += res;
		}
		out.println(ans);
	}
	
	static long dfs(long rem, int pos, int len)
	{
		if(len-pos-1 < pos){
			return rem == 0 ? 1L : 0L;
		}
		if(pos == len-1-pos){
			return rem == 0 ? 10L : 0L;
		}
		
		long d = 1;
		for(int i = 1;i <= len-pos-1;i++){
			d *= 10;
		}
		long dm = 1;
		for(int i = 1;i <= pos;i++){
			dm *= 10;
		}
		d -= dm;
var newVariable_1 = Math.abs(rem);		if(newVariable_1 >= 10L*d)return 0;
		long ret = 0;
		for(int i = -9;i <= 9;i++){
			if(pos == 0 && i >= 0){
var newVariable_2 = Math.abs(i);				ret += dfs(rem-d*i, pos+1, len) * (9-newVariable_2);
			}else{
var newVariable_3 = Math.abs(i);				ret += dfs(rem-d*i, pos+1, len) * (10-newVariable_3);
			}
		}
		return ret;
	}
	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
var newVariable_4 = INPUT.isEmpty();var newVariable_5 = INPUT.getBytes();		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(newVariable_5);
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
var newVariable_6 = sb.appendCodePoint(b);			b = readByte();
		}
var newVariable_7 = sb.toString();		return newVariable_7;
	}
	
	private static char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
var newVariable_8 = Arrays.copyOf(buf, p);		return n == p ? buf : newVariable_8;
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
	
var newVariable_9 = INPUT.length();	private static void tr(Object... o) { if(newVariable_9 != 0)System.out.println(Arrays.deepToString(o)); }
}
