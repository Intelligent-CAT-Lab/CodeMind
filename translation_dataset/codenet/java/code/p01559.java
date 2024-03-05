import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// MinimumCostPath
// 2012/09/19
public class p01559{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	int LIM=70;

	int[] dx={0, 0, -1, 1};
	int[] dy={-1, 1, 0, 0};

	int n, m;
	int[] xs, ys;
	long[] factMod, factInvMod;

	int mod=(int)1e9+9;

	void run(){
		n=sc.nextInt();
		m=sc.nextInt();
		xs=new int[m];
		ys=new int[m];
		for(int i=0; i<m; i++){
			xs[i]=sc.nextInt()-1;
			ys[i]=sc.nextInt()-1;
		}
		solve();
	}

	void solveNaive(){
		LIM=1000;
		TreeMap<P, Long> paths=new TreeMap<P, Long>();
		TreeMap<P, Integer> ds=new TreeMap<P, Integer>();
		bfsLim(paths, ds, new P(0, 0));
		if(paths.containsKey(new P(n-1, n-1))){
			println(paths.get(new P(n-1, n-1))+"");
		}else{
			println("0");
		}
	}

	void bfsLim(TreeMap<P, Long> path, TreeMap<P, Integer> d, P p0){
		HashSet<P> wall=new HashSet<P>();

		for(int i=0; i<m; i++){
			wall.add(new P(xs[i], ys[i]));
		}

		path.put(p0, 1L);
		d.put(p0, 0);

		LinkedList<P> que=new LinkedList<P>();
		que.offer(p0);

		for(; !que.isEmpty();){
			P p=que.poll();
			if(d.get(p)==LIM){
				break;
			}
			for(int i=0; i<4; i++){
				P q=new P(p.x+dx[i], p.y+dy[i]);
				if(q.x>=0&&q.x<n&&q.y>=0&&q.y<n&&!wall.contains(q)){
					if(!d.containsKey(q)){
						d.put(q, d.get(p)+1);
						que.offer(q);
					}
					if(d.get(p)+1==d.get(q)){
						if(!path.containsKey(q)){
							path.put(q, 0L);
						}
						path.put(q, (path.get(q)+path.get(p))%mod);
					}
				}
			}
		}
	}

	void solve(){
		if(n<=200){
			solveNaive();
			return;
		}

		// fact mod
		int max=2000000;
		factMod=new long[max];
		factInvMod=new long[max];
		factMod[0]=factInvMod[0]=1;
		for(int i=1; i<max; i++){
			factMod[i]=factMod[i-1]*i%mod;
			factInvMod[i]=factInvMod[i-1]*powMod(i, mod-2, mod)%mod;
		}

		// BFS
		TreeMap<P, Long> pathsS=new TreeMap<P, Long>();
		TreeMap<P, Integer> dsS=new TreeMap<P, Integer>();
		TreeMap<P, Long> pathsG=new TreeMap<P, Long>();
		TreeMap<P, Integer> dsG=new TreeMap<P, Integer>();

		bfsLim(pathsS, dsS, new P(0, 0));
		bfsLim(pathsG, dsG, new P(n-1, n-1));

		int dMin=INF;
		for(Entry<P, Integer> entryS : dsS.entrySet()){
			for(Entry<P, Integer> entryG : dsG.entrySet()){
				int ds=entryS.getValue();
				int dg=entryG.getValue();
				P p=entryS.getKey();
				P q=entryG.getKey();
				if(ds==LIM&&dg==LIM){
					dMin=min(dMin, ds+abs(p.x-q.x)+abs(p.y-q.y)+dg);
				}
			}
		}

		if(dMin==INF){
			println("0");
			return;
		}

		HashSet<P> setS=new HashSet<P>();
		HashSet<P> setG=new HashSet<P>();

		for(Entry<P, Integer> entryS : dsS.entrySet()){
			for(Entry<P, Integer> entryG : dsG.entrySet()){
				int ds=entryS.getValue();
				int dg=entryG.getValue();
				P p=entryS.getKey();
				P q=entryG.getKey();
				if(ds==LIM&&dg==LIM&&ds+abs(p.x-q.x)+abs(p.y-q.y)+dg==dMin){
					setS.add(p);
					setG.add(q);
				}
			}
		}

		P[] ps=new P[m];
		for(int i=0; i<m; i++){
			ps[i]=new P(xs[i], ys[i]);
		}
		sort(ps);

		long[] dp=new long[m];
		for(P p : setS){
			for(int i=0; i<m; i++){
				dp[i]=(dp[i]+pathsS.get(p)*nPath(p, ps[i])%mod)%mod;
			}
		}
		for(int j=0; j<m; j++){
			for(int i=j+1; i<m; i++){
				dp[i]=(dp[i]-dp[j]*nPath(ps[j], ps[i])%mod+mod)%mod;
			}
		}
		long ans=0;
		for(P p : setG){
			long sum=0;
			for(P q : setS){
				sum=(sum+pathsS.get(q)*nPath(q, p)%mod*pathsG.get(p)%mod)%mod;
			}
			for(int i=0; i<m; i++){
				sum=(sum-dp[i]*nPath(ps[i], p)%mod*pathsG.get(p)%mod+mod)%mod;
			}
			ans=(ans+sum)%mod;
		}

		println(ans+"");
	}

	long nPath(P p, P q){
		int dx=q.x-p.x;
		int dy=q.y-p.y;
		return modComb(dx+dy, dx);
	}

	long modComb(int n, int k){
		if(n<0||k<0||n<k){
			return 0;
		}
		return factMod[n]*factInvMod[k]%mod*factInvMod[n-k]%mod;
	}

	long powMod(long x, int k, int mod){
		if(k==0)
			return 1;
		else if((k&1)==0)
			return powMod(x*x%mod, k>>>1, mod);
		else
			return x*powMod(x, k-1, mod)%mod;
	}

	class P implements Comparable<P>{
		int x, y;

		P(int x, int y){
			this.x=x;
			this.y=y;
		}

		@Override
		public int compareTo(P p){
			if(y!=p.y){
				return y-p.y;
			}else{
				return x-p.x;
			}
		}

		@Override
		public int hashCode(){
			return x|(y<<16);
		}

		@Override
		public boolean equals(Object o){
			P p=(P)o;
			return x==p.x&&y==p.y;
		}

		@Override
		public String toString(){
			return "("+x+","+y+")";
		}
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new p01559().run();
	}
}