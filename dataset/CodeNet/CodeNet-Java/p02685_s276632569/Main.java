import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.*;
 
 
public class Main {
	
	
	static int[] H;
	static boolean[] seen;

	public static void main(String[] args) throws Exception {
		
		
		//int N = scan.nextInt();
		//long L = scan.nextLong();
		//char[] A = scan.next().toCharArray();

		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt();

		COMinit();
		long ans = 0;
		for(int k=0; k<=K; k++){
			long tmp = 1;
			tmp *= COM(N-1,k)%MOD;
			tmp %= MOD;
			tmp *= modPow(M-1, N-1-k, MOD)%MOD;
			tmp %= MOD;
			ans += tmp;
			ans %= MOD;
		}
		ans *= M;
		ans %= MOD;
		//out.println(MOD);
		
		
		
		out.println(ans);

		
				
		out.flush();
	}
	static boolean dfs(List<ArrayList<Integer>> G,int root, int from ){
		seen[from] = true;
		for(int to : G.get(from)){
			//out.println("from:"+from+" to:"+to);
			if(seen[to])continue;
			//out.println("try!");
			if(H[root] <= H[to])return false;
			//out.println("down!");
			//if(!dfs(G,root, to))return false;
		}
		return true;
	}

	static FastScanner scan = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);			 
	static long MOD = 998244353;
	static long INF = 1_000_000_007;
	//二項係数関連ここから-----
	static boolean isPreprocessing = false;	//二項係数を計算するための前処理を行っているかどうかのフラグ
	static int MAX = 666667;				//MAXまで階乗やそれらの逆元のテーブルを保持する。
	static long[] fac;	//fac[i] := i! % MOD
	static long[] inv;	//inv[i] := mod. MODにおける i の逆元
	static long[] finv;	//finv[i] := mod. MODにおける i! の逆元(invの累積"積")
	//二項係数関連おわり------
	
	static int[] roots;		//Union-find木用
	//static List<ArrayList<Integer>> G;	//グラフ用

	static List<List<E>> G = new ArrayList<>();	//グラフ用
	static List<E> Edges = new ArrayList<>();	//グラフ用
	static int V;								//グラフ用頂点の数
	static int E;								//グラフ用辺の数
	static long[] X = new long[1];				//拡張ユークリッドの互除法用
	static long[] Y = new long[1];				//拡張ユークリッドの互除法用
	//旧入力
	//Scanner sc = new Scanner(System.in);
	//int N = Integer.parseInt(sc.next());
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int[] dx8 = {1,-1,0,0,1,1,-1,-1};
	static int[] dy8 = {0,0,1,-1,1,-1,1,-1};
	
	
	/*	グラフ形式の入力を行う
	 * 	前提：M個の辺があるとき、以下の形式で辺情報が与えられることを期待している
	 * 		1 2
	 * 		2 3
	 *  	2 4
	 *  入力：
	 *  	int		N		: 頂点の数
	 *  	int 	M		: 辺の数
	 *  	boolean	isArrow	: 無向グラフか有向グラフかを表すフラグ（trueならば有向グラフ）
	 *  出力：ArrayList<ArrayList<Integer>>
	 * 
	 */
	static ArrayList<ArrayList<Integer>> inputG(int N, int M, boolean isArrow){
		ArrayList<ArrayList<Integer>> G = new ArrayList<>();
		
		for(int i=0; i<N; i++){
			ArrayList<Integer> V = new ArrayList<>();
			G.add(V);
		}
		for(int i=0; i<M; i++){
			int u = scan.nextInt() - 1;
			int v = scan.nextInt() - 1;
			G.get(u).add(v);
			if(!isArrow)G.get(v).add(u);
		}
		return G;
	}


	//a_i≧kとなるような最小のiを求める(0≦i≦N-1)
	//存在しなかったら-1を返す
	static int lower_bound(long[] A, long k){
		int N = A.length;
		int lb = -1;
		int ub = N;
		while(ub-lb > 1){
			int mid = (lb + ub) / 2;
			if(A[mid] >= k){
				ub = mid;
			}else{
				lb = mid;
			}
		}
		return ub;
	}

	//k≧a_iとなるような最大のiを求める(0≦i≦N-1)
	//存在しなかったらa_N-1を返す
	static int upper_bound(long[] A, long k){
		int N = A.length;
		int lb = -1;
		int ub = N;
		while(ub-lb > 1){
			int mid = (lb + ub) / 2;
			if(A[mid] <= k){
				lb = mid;
			}else{
				ub = mid;
			}
		}
		if(lb == N) lb = N-1;
		return lb;
	}
	
	//aの逆元a^-1を求める
	//条件：aとmodが互いに素であること(aがmodの倍数でないこと)
	static long modinv(long a, long mod){
		long b = mod;
		long u = 1;
		long v = 0;
		while(b>0){
			long t = a/b;
			a -= t*b;
			long tmp = b;
			b = a;
			a = tmp;
			u -= t*v;
			tmp = v;
			v = u;
			u = tmp;
		}
		u %= mod;
		if(u<0) u+=mod;
		return u;
	}
	
	//繰り返し二乗法(x^n)
	static long pow(long x, long n){
		long sum = 1;
		while(n>0){
			if((n&1) == 1 ){
				sum = sum * x;
			}
			x = x * x;
			n >>= 1;
		}
		return sum;
	}
	
	//繰り返し二乗法(x^n % mod)
	static long modPow(long x, long n, long mod){
		long sum = 1;
		while(n>0){
			if((n&1) == 1 ){
				sum = sum * x % mod;
			}
			x = (x * x) % mod;
			n >>= 1;
		}
		return sum;
	}
	
	//オイラーのφ関数（nに対して、nと互いに素である1以上n以下の自然数の個数）
	static int phi(int n){
		List<long[]> primes = factorization(n);//素因数分解
		int rtn = n;
		for(long[] prime : primes){
			int p = (int)prime[0];
			rtn /= p;
			rtn *= p-1;
		}
		return rtn;
	}
	
	//エラトステネスの篩
	//要素数がn+1のboolean配列を返す。
	//素数のindexはtrueとなり、それ以外はfalseとなる
	static boolean[] eratosthenes(int n){
		boolean[] flg = new boolean[n+1];
		Arrays.fill(flg, true);
		flg[0] = flg[1] = false;
		for(int i=2; i<n+1; i++){
			if(!flg[i])continue;
			for(int j=i*2; j<n+1; j += i)flg[j] = false;
		}
		return flg;
	}
	
	//素数判定
	static boolean isPrime(int n){
		int tmp = 2;
		boolean flg = true;
		while(tmp*tmp<=n){
			if (n%tmp == 0)flg = false;
			tmp++;
		}
		if(n <= 1)flg = false;
		return flg;
	}
	
	//拡張ユークリッドの互除法
	//返り値、aとbの最大公約数
	//X[0]とY[0]が、ax+by=gcd(a,b)を満たすようになる
	static long extGCD(long a, long b, long[] X, long[] Y){
		if(b == 0){
			X[0] = 1;
			Y[0] = 0;
			return a;
		}
		long d = extGCD(b, a%b, Y, X);
		Y[0] -= a/b * X[0];
		
		return d;
	}
	
	//２点間の距離
	public static double distance(double X1, double Y1, double X2, double Y2){
		return Math.sqrt((X1-X2)*(X1-X2) + (Y1-Y2)*(Y1-Y2));
	}
	
	//階乗
	public static int fact(int a){
		if(a == 0 || a == 1)return 1;
		return a*fact(a-1);
	}
		
	//約数の配列を返す
	static long[] divisor(long num){
		Set<Long> divisors = new TreeSet<>();
		long tmp=1;
		while(tmp*tmp<=num){
			if(num%tmp == 0){
				divisors.add(tmp);
				divisors.add(num/tmp);
			}
			tmp++;
		}
		Long[] rtn = new Long[divisors.size()];
		divisors.toArray(rtn);
		long[] ans = new long[rtn.length];
		for(int i=0; i<rtn.length; i++){
			ans[i] = rtn[i];
		}
		return ans;
	}
	
	//GCD最大公約数を返す
	static long gcd(long a, long b){
		if(b == 0) return a;
		return gcd(b, a%b);
	}

	static BigInteger biggcd(BigInteger a, BigInteger b){
		if(b == BigInteger.ZERO) return a;
		return biggcd(b, a.remainder(b));
	}
	
	//Bellman-Ford法
	//辺情報とstartの頂点を指定すると、すべての頂点への最短コストを返す（負の重みの辺もOK）
	//(問題に応じて要変化)1→Vのパスに負の閉路がある場合はindex:Vの要素に-1を入れて返す。
	static long[] bellmanFord(List<E> Edges, int from){
		long[] rtn = new long[V+1];
		Arrays.fill(rtn, INF);
		rtn[from] = 0;
		
		for(int i=0; i<V-1; i++){
			boolean update = false;
			for(E e : Edges){
				if(rtn[e.from] != INF && rtn[e.to] > rtn[e.from] + e.weight){
					rtn[e.to] = rtn[e.from] + e.weight;
					update = true;
				}
			}
			if(!update)break;
		}	
		//閉経路判定
		boolean[] is_update = new boolean[V];
		Arrays.fill(is_update, false);
		for(int i=0; i<V; i++){
			for(E e : Edges){
				if(rtn[e.from] != INF && rtn[e.to] > rtn[e.from] + e.weight){
					rtn[e.to] = rtn[e.from] + e.weight;
					is_update[e.to] = true;
				}
			}
		}
		
		if(is_update[V-1]){
			rtn[V] = -1;
		}
		return rtn;
	}
	
	//Kruskal法
	//最小全域木を構成したときのコストの総和を返す
	static long kruskal(List<E> Edges){
		Collections.sort(Edges);
		UnionFind uni = new UnionFind(V);
		long res = 0L;
		for (E e : Edges){
			if(!uni.same(e.from, e.to)){
				uni.join(e.from, e.to);
				res += e.weight;
			}
		}
		return res;
	}
	
	//Dijkstra法
	//辺情報とstartの頂点を指定すると、すべての頂点への最短コストを返す
	static long[] dijkstra(List<List<E>> G, int from){
		int N = G.size();
		long[] rtn = new long[N];
		Arrays.fill(rtn, INF);
		rtn[from] = 0;
		Queue<V> que = new PriorityQueue<>();
		
		que.add(new V(from,0));
        while(!que.isEmpty()){
            V doneNode = que.poll();
            for(E e: G.get(doneNode.num)){
                  long alt = rtn[doneNode.num] + e.weight;
                  if(rtn[e.to] > alt){
                        rtn[e.to] = alt;
                        que.add(new V(e.to, alt));
                  }     
            }
        }
		return rtn;
	}
	
	//グラフ用：辺
	static class E implements Comparable<E>{
		int from;
		int to;
		long weight;
		public E(int from, int to, long weight){
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
		@Override
		public int compareTo(E o) {
			// TODO Auto-generated method stub
			return Long.compare(this.weight, o.weight);
		}
	}
	//グラフ用：頂点
	static class V implements Comparable<V>{
		int num;
		long cost;
		public V(int num, long cost){
			this.num = num;
			this.cost = cost;
		}
		//コストの低い順に並べる(PriorityQueue用)
		@Override
		public int compareTo(V o) {
			return Long.compare(this.cost, o.cost);
		}
	}
	
	//Union-Find木
	static class UnionFind{
		private int[] roots;
		public UnionFind(int N){
			this.roots = new int[N];
			for(int i=0; i<N; i++){
				this.roots[i] = i;
			}
		}
		
		public boolean same(int a, int b){
			if(root(a) == root(b)){
				return true;
			}else{
				return false;
			}
		}
		
		public int root(int a){
			if(a == this.roots[a])return a;
			return this.roots[a] = root(this.roots[a]);
		}
		
		public void join(int a, int b){
			if(root(a) == root(b))return;
			this.roots[root(b)] = root(a);
		}
		
		public int[] getRoots(){
			return this.roots;
		}
	}
 
	//素因数分解の結果AとBに対して、A*Bの素因数分解の結果を返す
	static List<long[]> factorizationMerge(List<long[]> A, List<long[]> B){
		List<long[]> primes = new ArrayList<>(A);
		for(long[] b : B){
			boolean isExist = false;
			for(long[] a : primes){
				if(a[0] == b[0]){
					isExist = true;
					a[1] += b[1]; 
				}
			}
			if(!isExist)primes.add(b);
		}
		return primes;
	}
	
	//素因数分解をする(index_0:素数 index_1:個数)
	static List<long[]> factorization(long M){
		List<long[]> primes = new ArrayList<>();
 
		long now_prime = 2;
		long now_M = M;
		while(now_prime*now_prime<=M){
			if(now_M%now_prime == 0){
				now_M /= now_prime;
				long[] prime = new long[2];
				prime[0] = now_prime;
				prime[1] = 1;
				while(now_M%now_prime == 0){
					now_M /= now_prime;
					prime[1]++;
				}
				primes.add(prime);
				
			}
			if(now_prime%2 == 0){
				now_prime++;
			}else{
				now_prime += 2;
			}
		}
		if (now_M>1){
			long[] prime = new long[2];
			prime[0] = now_M;
			prime[1] = 1;
			primes.add(prime);
		}
		
		return primes;
	}
	
	//２つのint配列を連結させる
	static int[] joinArray(int[] A, int[] B){
		int[] tmp = new int[A.length + B.length];
		System.arraycopy(A, 0, tmp, 0, A.length);
		System.arraycopy(B, 0, tmp, A.length, B.length);
		return tmp;
	}
	
	//２つのint配列が等しいかどうか判定する
	static boolean arrayEqual(int[] A, int[] B){
		if(A.length != B.length)return false;
		for(int i=0; i<A.length; i++){
			if(A[i] != B[i])return false;
		}
		return true;
	}
	
	//int配列をindex順に見て、要素の重複があった場合その要素と間の要素を削除する12123→23
	static int[] calc(int[] A){
		boolean[] tmp = new boolean[A.length];
		Arrays.fill(tmp, true);
		int fetch = 0;
		while(fetch<A.length-1){
			boolean isExist = false;
			for(int i=fetch+1; i<A.length;i++){
				if(A[fetch] == A[i]){
					for(int j=fetch;j<=i;j++){
						tmp[j]=false;
					}
					fetch = i+1;
					isExist = true;
					break;
				}
			}
			if(!isExist)fetch++;
		}
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<A.length; i++){
			if(tmp[i])list.add(A[i]);
		}
		
		int[] foo = new int[list.size()];
		for(int i=0; i<list.size(); i++){
			foo[i] = list.get(i);
		}
		/*
		for(boolean t : tmp)
			System.out.print(t+" ");
		*/
		return foo;
	}
		
	//aとbの最小公倍数を返す
	static long lcm (long a, long b) {
		return ((a/gcd(a,b))*b);
	}
	
	//二項係数用の前処理
	static void COMinit(){
		//二項係数演算用前処理
		fac = new long[MAX+1];
		fac[0] = 1L;
		fac[1] = 1L;
		inv = new long[MAX+1];
		inv[1] = 1L;
		finv = new long[MAX+1];
		finv[0] = 1L;
		finv[1] = 1L;
		for(int i=2;i<MAX;i++){
			fac[i] = fac[i-1] * i % MOD;
			inv[i] = MOD - inv[(int)(MOD%i)] * (MOD/i) % MOD;
			finv[i] = finv[i-1] * inv[i] % MOD;
		}
		isPreprocessing = true;
	}
	
	//二項係数i_C_jをMODで割った余りを返す
	static long COM(int i, int j){
		if(i<j)return 0;
		if(i<0 || j<0)return 0;
		if(!isPreprocessing)COMinit();
		return fac[i] * (finv[j] * finv[i-j] % MOD) % MOD;
	}
	
	//入力
	//https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
	static class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;
	    private boolean hasNextByte() {
	        if (ptr < buflen) {
	            return true;
	        }else{
	            ptr = 0;
	            try {
	                buflen = in.read(buffer);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            if (buflen <= 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	    public String next() {
	        if (!hasNext()) throw new NoSuchElementException();
	        StringBuilder sb = new StringBuilder();
	        int b = readByte();
	        while(isPrintableChar(b)) {
	            sb.appendCodePoint(b);
	            b = readByte();
	        }
	        return sb.toString();
	    }
	    public long nextLong() {
	        if (!hasNext()) throw new NoSuchElementException();
	        long n = 0;
	        boolean minus = false;
	        int b = readByte();
	        if (b == '-') {
	            minus = true;
	            b = readByte();
	        }
	        if (b < '0' || '9' < b) {
	            throw new NumberFormatException();
	        }
	        while(true){
	            if ('0' <= b && b <= '9') {
	                n *= 10;
	                n += b - '0';
	            }else if(b == -1 || !isPrintableChar(b)){
	                return minus ? -n : n;
	            }else{
	                throw new NumberFormatException();
	            }
	            b = readByte();
	        }
	    }
	    public int nextInt() {
	        long nl = nextLong();
	        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
	        return (int) nl;
	    }
	    public double nextDouble() { return Double.parseDouble(next());}
	}
}
