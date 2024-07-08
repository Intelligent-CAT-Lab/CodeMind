import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		long n = nl();
		List<Integer> perm = permutationWhoseNumberOfIncreasingSequenceIsK(n);
		out.println(perm.size()*2);
var newVariable_0 = perm.size();		for(int i = 1;i <= newVariable_0;i++){
			if(i > 1)out.print(" ");
			out.print(i);
		}
var newVariable_1 = perm.size();		for(int i = 0;i < newVariable_1;i++){
			out.print(" ");
			out.print(perm.get(i)+1);
		}
		out.println();
	}
	
	public static List<Integer> permutationWhoseNumberOfIncreasingSequenceIsK(long K)
	{
var newVariable_2 = Long.highestOneBit(K+1);		long cur = newVariable_2-1;
		List<Integer> list = new ArrayList<>();
var newVariable_3 = Long.bitCount(cur);		for(int i = 0;i < newVariable_3;i++){
var newVariable_4 = list.add(i);		}
		int p = Long.bitCount(cur);
var newVariable_5 = Long.bitCount(cur);		for(int d = newVariable_5-1;d >= 0;d--){
			long x = 1L<<d;
			if(cur + x <= K){
				cur += x;
var newVariable_6 = list.add(d, p++);			}
		}
		return list;
	}
	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
var newVariable_7 = INPUT.isEmpty();var newVariable_8 = INPUT.getBytes();		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(newVariable_8);
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
var newVariable_9 = sb.appendCodePoint(b);			b = readByte();
		}
var newVariable_10 = sb.toString();		return newVariable_10;
	}
	
	private static char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
var newVariable_11 = Arrays.copyOf(buf, p);		return n == p ? buf : newVariable_11;
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
	
var newVariable_12 = INPUT.length();	private static void tr(Object... o) { if(newVariable_12 != 0)System.out.println(Arrays.deepToString(o)); }
}
