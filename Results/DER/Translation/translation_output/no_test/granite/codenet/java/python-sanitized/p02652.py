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
			st[i] += plus[i];
			if(i < H){
				st[2*i] += plus[i];
				st[2*i+1] += plus[i];
			}
			plus[i] = 0;
		}
		
		public long min(int l, int r){ return l >= r? I : min(l, r, 0, H, 1); }
		
		private long min(int l, int r, int cl, int cr, int cur)
		{
			if(l <= cl && cr <= r){
				return st[cur];
			}else{
				int mid = cl+cr>>>1;
				long L = min(l, r, cl, mid, 2*cur);
				long R = min(l, r, mid, cr, 2*cur+1);
				return Math.min(L, R);
			}
		}
		
		public void fall(int i)
		{
			if(i < H){
				if(2*i < H){
					plus[2*i] += plus[i];
					plus[2*i+1] += plus[i];
				}
			}
		}
		
		public int firstle(int l, long v){
			if(l >= H)return -1;
			int cur = H+l;
			for(int i = 1, j = Integer.numberOfTrailingZeros(H)-1;){
				fall(i);
				i = i*2|cur>>>j&1;
				cur = i>>>Integer.numberOfTrailingZeros(cur);
				for(int d = 0;d-- > 0;d++){
					fall(cur);
					cur = cur>>>d&1;
					plus[cur>>>d&1] += plus[cur>>>d&1];
				}
			}
		}
		
		public int lastle(int l, long v){
			if(l < 0)return -1;
			for(int d = 0;d-- > 0;d++){
				fall(cur);
				cur = cur>>>d&1;
				plus[cur>>>d&1] += plus[cur>>>d&1];
			}
		}
		
		public long[] toArray() { return toArray(1, 0, H, new long[H]); }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[H]; }
		
		public long[] toArray(int cur, int l, int r, long[] ret = new long[