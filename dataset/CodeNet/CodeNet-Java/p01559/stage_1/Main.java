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
public class Main{
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
var newVariable_0 = sc.nextInt();			xs[i]=newVariable_0-1;
var newVariable_1 = sc.nextInt();			ys[i]=newVariable_1-1;
		}
		solve();
	}

	void solveNaive(){
		LIM=1000;
		TreeMap<P, Long> paths=new TreeMap<P, Long>();
		TreeMap<P, Integer> ds=new TreeMap<P, Integer>();
		bfsLim(paths, ds, new P(0, 0));
var newVariable_2 = paths.containsKey(new P(n-1, n-1));		if(newVariable_2){
var newVariable_3 = paths.get(new P(n-1, n-1));			println(newVariable_3+"");
		}else{
			println("0");
		}
	}

	void bfsLim(TreeMap<P, Long> path, TreeMap<P, Integer> d, P p0){
		HashSet<P> wall=new HashSet<P>();

		for(int i=0; i<m; i++){
var newVariable_4 = wall.add(new P(xs[i], ys[i]));		}

var newVariable_5 = path.put(p0, 1L);var newVariable_6 = d.put(p0, 0);
		LinkedList<P> que=new LinkedList<P>();
var newVariable_7 = que.offer(p0);
var newVariable_8 = que.isEmpty();		for(; !newVariable_8;){
			P p=que.poll();
var newVariable_9 = d.get(p);			if(newVariable_9==LIM){
				break;
			}
			for(int i=0; i<4; i++){
				P q=new P(p.x+dx[i], p.y+dy[i]);
var newVariable_10 = wall.contains(q);				if(q.x>=0&&q.x<n&&q.y>=0&&q.y<n&&!newVariable_10){
var newVariable_11 = d.containsKey(q);					if(!newVariable_11){
var newVariable_12 = d.put(q, d.get(p)+1);var newVariable_13 = d.get(p);						d.put(q, newVariable_13+1);
var newVariable_14 = que.offer(q);					}
var newVariable_15 = d.get(p);var newVariable_16 = d.get(q);					if(d.get(p)+1==newVariable_16){
var newVariable_17 = path.containsKey(q);						if(!newVariable_17){
var newVariable_18 = path.put(q, 0L);						}
var newVariable_19 = path.put(q, (path.get(q)+path.get(p))%mod);var newVariable_20 = path.get(q);var newVariable_21 = path.get(p);						path.put(q, (path.get(q)+newVariable_21)%mod);
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
var newVariable_22 = dsS.entrySet();		for(Entry<P, Integer> entryS : newVariable_22){
var newVariable_23 = dsG.entrySet();			for(Entry<P, Integer> entryG : newVariable_23){
				int ds=entryS.getValue();
				int dg=entryG.getValue();
				P p=entryS.getKey();
				P q=entryG.getKey();
				if(ds==LIM&&dg==LIM){
var newVariable_24 = abs(p.x-q.x);var newVariable_25 = abs(p.y-q.y);					dMin=min(dMin, ds+abs(p.x-q.x)+newVariable_25+dg);
				}
			}
		}

		if(dMin==INF){
			println("0");
			return;
		}

		HashSet<P> setS=new HashSet<P>();
		HashSet<P> setG=new HashSet<P>();

var newVariable_26 = dsS.entrySet();		for(Entry<P, Integer> entryS : newVariable_26){
var newVariable_27 = dsG.entrySet();			for(Entry<P, Integer> entryG : newVariable_27){
				int ds=entryS.getValue();
				int dg=entryG.getValue();
				P p=entryS.getKey();
				P q=entryG.getKey();
var newVariable_28 = abs(p.x-q.x);var newVariable_29 = abs(p.y-q.y);				if(ds==LIM&&dg==LIM&&ds+abs(p.x-q.x)+newVariable_29+dg==dMin){
var newVariable_30 = setS.add(p);var newVariable_31 = setG.add(q);				}
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
var newVariable_32 = pathsS.get(p);				dp[i]=(dp[i]+newVariable_32*nPath(p, ps[i])%mod)%mod;
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
var newVariable_33 = pathsS.get(q);var newVariable_34 = pathsG.get(p);				sum=(sum+pathsS.get(q)*nPath(q, p)%mod*newVariable_34%mod)%mod;
			}
			for(int i=0; i<m; i++){
var newVariable_35 = pathsG.get(p);				sum=(sum-dp[i]*nPath(ps[i], p)%mod*newVariable_35%mod+mod)%mod;
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
		new Main().run();
	}
}