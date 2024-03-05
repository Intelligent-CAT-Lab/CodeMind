import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class p03454 {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int S = ni();
		
		int mod = 1000000007;
		long ans = 0;
		outer:
		for(int midl = 2;midl <= 8;midl++){
			long mid = 0;
			for(int midr = midl;midr <= 8;midr++){
				mid += (long)Math.pow(10, midr-1)*9*midr;
				if(mid >= S)continue outer;
				
				long rem = S - mid;
				long l = midl-1, r = midr+1;
				long lnum = (long)Math.pow(10, l-1)*9;
				long rnum = (long)Math.pow(10, r-1)*9;
				// l*a + r*b = rem
				// 1 <= a <= lnum, 1 <= b <= rnum
				
//				long lans = 0;
//				for(long a = 1;a <= lnum;a++){
//					if((rem-l*a)%r == 0 && (rem-l*a)/r <= rnum && (rem-l*a)/r >= 1){
//						lans++;
//					}
//				}
				long res = count(l, r, rem, lnum, rnum);
//				if(res != lans){
//					tr("!!", l, r, rem, lnum, rnum, res, lans);
//				}
				ans += res;
				ans %= mod;
			}
		}
		
		for(int l = 1;l <= 10000;l++){
			// l,l+1
			// la+(l+1)b = S
			long lnum = l > 10 ? Long.MAX_VALUE/2 : (long)Math.pow(10, l-1)*9;
			long rnum = l+1 > 10 ? Long.MAX_VALUE/2 : (long)Math.pow(10, l+1-1)*9;
			ans += count(l, l+1, S, lnum, rnum);
			ans %= mod;
		}
		for(int k = 1;S/k > 10000;k++){
			int l = S/k;
			long lnum = l > 10 ? Long.MAX_VALUE/2 : (long)Math.pow(10, l-1)*9;
			long rnum = l+1 > 10 ? Long.MAX_VALUE/2 : (long)Math.pow(10, l+1-1)*9;
			ans += count(l, l+1, S, lnum, rnum);
			ans %= mod;
		}
		
//		tr(ans);
		for(int d = 1;d*d <= S;d++){
			if(S % d == 0){
				// d * (S/d)
				{
					long lnum = d > 10 ? Long.MAX_VALUE/2 : (long)Math.pow(10, d-1)*9;
					if(S/d <= lnum){
						ans += (pow(10, d-1, mod)*9 - S/d + mod + 1);
						ans %= mod;
					}
				}
				if(d*d < S){
					long lnum = S/d > 10 ? Long.MAX_VALUE/2 : (long)Math.pow(10, S/d-1)*9;
					if(d <= lnum){
						ans += (pow(10, S/d-1, mod)*9 - d + mod + 1);
						ans %= mod;
					}
				}
			}
		}
		
		out.println(ans%mod);
	}
	
	public static long pow(long a, long n, long mod) {
		//		a %= mod;
		long ret = 1;
		int x = 63 - Long.numberOfLeadingZeros(n);
		for (; x >= 0; x--) {
			ret = ret * ret % mod;
			if (n << 63 - x < 0)
				ret = ret * a % mod;
		}
		return ret;
	}
	
	static long check(long l, long r, long rem, long lnum, long rnum)
	{
		long lans = 0;
		for(long a = 1;a <= lnum;a++){
			if((rem-l*a)%r == 0 && (rem-l*a)/r <= rnum && (rem-l*a)/r >= 1){
				lans++;
			}
		}
		return lans;
	}

	
	static long count(long l, long r, long rem, long lnum, long rnum)
	{
//		if((double)l*lnum + (double)r*rnum < rem)return 0;
		
		// l*a + r*b = rem
		// 1 <= a <= lnum, 1 <= b <= rnum
		
		long a = 0, b = 0, da = 0, db = 0;
		
		if(r-l > 1){
			long[] gpr = exgcd(l, r);
			if(rem % gpr[0] != 0)return 0;
			a = gpr[1]*(rem/gpr[0]); b = gpr[2]*(rem/gpr[0]);
			da = r / gpr[0]; db = l / gpr[0];
		}else{
			// l*-1+(l+1)*1=1
			a = -rem; b = rem;
			da = r; db = l;
		}
		{
			if(a <= 0){
				long need = -a/(da)+1;
				a += need*(da);
				b -= need*(db);
			}
			{
				long need = (a-1)/(da);
				a -= need*(da);
				b += need*(db);
			}
//			tr(a, b);
			if(b > rnum){
				long need = (b-(rnum+1))/(db)+1;
				b -= need*(db);
				a += need*(da);
			}
		}
		
		long mina = a;
		
		{
			if(b <= 0){
				long need = -b/(db)+1;
				b += need*(db);
				a -= need*(da);
			}
			{
				long need = (b-1)/(db);
				b -= need*(db);
				a += need*(da);
			}
			if(a > lnum){
				long need = (a-(lnum+1))/(da)+1;
				a -= need*(da);
				b += need*(db);
			}
		}
		long maxa = a;
		long ret = mina > maxa ? 0 : (maxa-mina)/da+1;
		
//		if(r <= 9 && ret != check(l, r, rem, lnum, rnum)){
//			tr("error", mina, maxa, l, r, rem, lnum, rnum, check(l, r, rem, lnum, rnum));
//			assert false;
//		}
		return ret;
	}
	
	public static long[] exgcd(long a, long b)
	{
		if(a == 0 || b == 0)return null;
		int as = Long.signum(a);
		int bs = Long.signum(b);
		a = Math.abs(a); b = Math.abs(b);
		long p = 1, q = 0, r = 0, s = 1;
		while(b > 0){
			long c = a / b;
			long d;
			d = a; a = b; b = d % b;
			d = p; p = q; q = d - c * q;
			d = r; r = s; s = d - c * s;
		}
		return new long[]{a, p * as, r * bs};
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
