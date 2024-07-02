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
		int n = ni();
		
		long[][] g = {
				{0L, 1L, 2L, 4L, 20L, 199L, 3590L, 111538L, 5398150L, 361104428L}, {1L, 0L, 3L, 8L, 40L, 398L, 7180L, 223076L, 10796300L, 722208856L}, {2L, 3L, 0L, 16L, 80L, 796L, 14360L, 446152L, 21592600L, 1444417712L}, {4L, 8L, 16L, 0L, 140L, 1393L, 25130L, 780766L, 37787050L, 2527730996L}, {20L, 40L, 80L, 140L, 0L, 2388L, 43080L, 1338456L, 64777800L, 4333253136L}, {199L, 398L, 796L, 1393L, 2388L, 0L, 71800L, 2230760L, 107963000L, 7222088560L}, {3590L, 7180L, 14360L, 25130L, 43080L, 71800L, 0L, 3234602L, 156546350L, 10472028412L}, {111538L, 223076L, 446152L, 780766L, 1338456L, 2230760L, 3234602L, 0L, 205129700L, 13721968264L}, {5398150L, 10796300L, 21592600L, 37787050L, 64777800L, 107963000L, 156546350L, 205129700L, 0L, 18777430256L}, {361104428L, 722208856L, 1444417712L, 2527730996L, 4333253136L, 7222088560L, 10472028412L, 13721968264L, 18777430256L, 0}
		};
		
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				out.print(g[i][j] + " ");
			}
			out.println();
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
System.out.println("[INST]30;S;System.currentTimeMillis();"+S);
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
System.out.println("[INST]31;None;INPUT.isEmpty();"+INPUT.isEmpty());
System.out.println("[INST]31;None;INPUT.getBytes();"+INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
System.out.println("[INST]35;None;out.flush();"+out.flush());
		long G = System.currentTimeMillis();
System.out.println("[INST]36;G;System.currentTimeMillis();"+G);
		tr(G-S+"ms");
	}
	
	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;
		
		try {
			is.mark(1000);
System.out.println("[INST]47;None;is.mark(1000);"+is.mark(1000));
			while(true){
				int b = is.read();
System.out.println("[INST]49;b;is.read();"+b);
				if(b == -1){
					is.reset();
System.out.println("[INST]51;None;is.reset();"+is.reset());
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
System.out.println("[INST]54;None;is.reset();"+is.reset());
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
System.out.println("[INST]71;lenbuf;is.read(inbuf);"+lenbuf);
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
System.out.println("[INST]89;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
			b = readByte();
		}
		return sb.toString();
System.out.println("[INST]92;None;sb.toString();"+sb.toString());
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
System.out.println("[INST]103;None;Arrays.copyOf(buf, p);"+Arrays.copyOf(buf, p));
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
System.out.println("[INST]161;None;INPUT.length();"+INPUT.length());
}
