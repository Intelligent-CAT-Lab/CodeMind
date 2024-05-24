import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class p02652 {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
//	static String INPUT = "?0011";
//	static String INPUT = "000?00";
//	static String INPUT = "?010";
	
	// 22224
	// 11133    
	
	static void solve()
	{
		char[] s = ns().toCharArray();
		int n = s.length;
		
		StarrySkyTreeL sst = new StarrySkyTreeL(2*n+5);
		int O = n+2;
		int Q = O+1;
		sst.add(O+1, sst.H, 99999999);
		
		for(int i = n-1;i >= 0;i--){
			if(s[i] == '1'){
				if(sst.min(O, O+1) < 90000000){
					Q--;
				}
				long v = sst.min(O, O+1);
				long to = sst.min(O-1, O);
				
				sst.add(0, sst.H, 1);
				O--;
				if(v < to){
					sst.add(O, O+1, v-to);
				}
				sst.add(O+1, O+2, 99999999);
			}else if(s[i] == '0'){
				sst.add(0, sst.H, -1);
				O++;
				int last = sst.lastle(sst.H-1, -1);
				sst.add(0, last+1, 1);
			}else{
				O++;
				for(int j = Q-2;j < Q;j++){
					int nj = Math.min(j+2, O);
					long nv = sst.min(j, j+1) + 2;
					long ov = sst.min(nj, nj+1);
					if(nv < ov){
						sst.add(nj, nj+1, nv-ov);
					}
				}
				Q = Math.min(Q+2, O+1);
				
				sst.add(0, sst.H, -1);
				int last = sst.lastle(sst.H-1, -1);
				sst.add(0, last+1, 1);
			}
//			tr(O, Q, sst.toArray());
		}
		long[] ar = sst.toArray();
		long min = Long.MAX_VALUE;
		for(int i = 0;i < sst.H;i++){
			long inf = i-O;
			long sup = ar[i];
			min = Math.min(min, sup-inf);
		}
		out.println(min);
	}
	
	public static class StarrySkyTreeL {
		public int M, H, N;
		public long[] st;
		public long[] plus;
		public long I = Long.MAX_VALUE/4; // I+plus<long
		
		public StarrySkyTreeL(int n)
		{
			N = n;
			M = Integer.highestOneBit(Math.max(n-1, 1))<<2;
			H = M>>>1;
			st = new long[M];
			plus = new long[H];
		}
		
		public StarrySkyTreeL(long[] a)
		{
			N = a.length;
			M = Integer.highestOneBit(Math.max(N-1, 1))<<2;
			H = M>>>1;
			st = new long[M];
			for(int i = 0;i < N;i++){
				st[H+i] = a[i];
			}
			plus = new long[H];
			Arrays.fill(st, H+N, M, I);
			for(int i = H-1;i >= 1;i--)propagate(i);
		}
		
		private void propagate(int i)
		{
			st[i] = Math.min(st[2*i], st[2*i+1]) + plus[i];
		}
		
		public void add(int l, int r, long v){ if(l < r)add(l, r, v, 0, H, 1); }
		
		private void add(int l, int r, long v, int cl, int cr, int cur)
		{
			if(l <= cl && cr <= r){
				if(cur >= H){
					st[cur] += v;
				}else{
					plus[cur] += v;
					propagate(cur);
				}
			}else{
				int mid = cl+cr>>>1;
				if(cl < r && l < mid){
					add(l, r, v, cl, mid, 2*cur);
				}
				if(mid < r && l < cr){
					add(l, r, v, mid, cr, 2*cur+1);
				}
				propagate(cur);
			}
		}
		
		public long min(int l, int r){ return l >= r ? I : min(l, r, 0, H, 1);}
		
		private long min(int l, int r, int cl, int cr, int cur)
		{
			if(l <= cl && cr <= r){
				return st[cur];
			}else{
				int mid = cl+cr>>>1;
				long ret = I;
				if(cl < r && l < mid){
					ret = Math.min(ret, min(l, r, cl, mid, 2*cur));
				}
				if(mid < r && l < cr){
					ret = Math.min(ret, min(l, r, mid, cr, 2*cur+1));
				}
				return ret + plus[cur];
			}
		}
		
		public void fall(int i)
		{
			if(i < H){
				if(2*i < H){
					plus[2*i] += plus[i];
					plus[2*i+1] += plus[i];
				}
				st[2*i] += plus[i];
				st[2*i+1] += plus[i];
				plus[i] = 0;
			}
		}
		
		public int firstle(int l, long v) {
			if(l >= H)return -1;
			int cur = H+l;
			for(int i = 1, j = Integer.numberOfTrailingZeros(H)-1;i <= cur;j--){
				fall(i);
				i = i*2|cur>>>j&1;
			}
			while(true){
				fall(cur);
				if(st[cur] <= v){
					if(cur >= H)return cur-H;
					cur = 2*cur;
				}else{
					cur++;
					if((cur&cur-1) == 0)return -1;
					cur = cur>>>Integer.numberOfTrailingZeros(cur);
				}
			}
		}
		
		public int lastle(int l, long v) {
			if(l < 0)return -1;
			int cur = H+l;
			for(int i = 1, j = Integer.numberOfTrailingZeros(H)-1;i <= cur;j--){
				fall(i);
				i = i*2|cur>>>j&1;
			}
			while(true){
				fall(cur);
				if(st[cur] <= v){
					if(cur >= H)return cur-H;
					cur = 2*cur+1;
				}else{
					if((cur&cur-1) == 0)return -1;
					cur = cur>>>Integer.numberOfTrailingZeros(cur);
					cur--;
				}
			}
		}
		
		public void addx(int l, int r, long v){
			if(l >= r)return;
			while(l != 0){
				int f = l&-l;
				if(l+f > r)break;
				if(f == 1){
					st[(H+l)/f] += v;
				}else{
					plus[(H+l)/f] += v;
				}
				l += f;
			}
			
			while(l < r){
				int f = r&-r;
				if(f == 1){
					st[(H+r)/f-1] += v;
				}else{
					plus[(H+r)/f-1] += v;
				}
				r -= f;
			}
		}
		
		public long minx(int l, int r){
			long lmin = I;
			if(l >= r)return lmin;
			if(l != 0){
				for(int d = 0;H>>>d > 0;d++){
					if(d > 0){
						int id = (H+l-1>>>d);
						lmin += plus[id];
					}
					if(l<<~d<0 && l+(1<<d) <= r){
						long v = st[H+l>>>d];
						if(v < lmin)lmin = v;
						l += 1<<d;
					}
				}
			}
			long rmin = I;
			for(int d = 0;H>>>d > 0;d++){
				if(d > 0 && r < H)rmin += plus[H+r>>>d];
				if(r<<~d<0 && l < r){
					long v = st[(H+r>>>d)-1];
					if(v < rmin)rmin = v;
					r -= 1<<d;
				}
			}
			long min = Math.min(lmin, rmin);
			return min;
		}
		
		public long[] toArray() { return toArray(1, 0, H, new long[H]); }
		
		private long[] toArray(int cur, int l, int r, long[] ret)
		{
			if(r-l == 1){
				ret[cur-H] = st[cur];
			}else{
				toArray(2*cur, l, l+r>>>1, ret);
				toArray(2*cur+1, l+r>>>1, r, ret);
				for(int i = l;i < r;i++)ret[i] += plus[cur];
			}
			return ret;
		}
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
