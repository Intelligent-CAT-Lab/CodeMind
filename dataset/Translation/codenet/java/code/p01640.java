import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Get Lost
public class p01640{
	Scanner sc=new Scanner(System.in);

	int w, h, gx, gy, n;
	int[] xs, ys;
	String run;

	void run(){
		w=sc.nextInt();
		h=sc.nextInt();
		gx=sc.nextInt()-1;
		gy=sc.nextInt()-1;
		n=sc.nextInt();
		xs=new int[n];
		ys=new int[n];
		for(int i=0; i<n; i++){
			xs[i]=sc.nextInt()-1;
			ys[i]=sc.nextInt()-1;
		}
		run=sc.next()+"$";
		solve();
	}

	void solve(){
		long sum=0;
		for(int d=0; d<4; d++){
			sum+=solve1();
			int ngx=h-1-gy, ngy=gx;
			gx=ngx;
			gy=ngy;
			for(int i=0; i<n; i++){
				int nx=h-1-ys[i], ny=xs[i];
				xs[i]=nx;
				ys[i]=ny;
			}
			int t=w;
			w=h;
			h=t;
		}
		println(sum+"");
	}

	TreeSet<Integer>[] sets1, sets2;

	@SuppressWarnings("unchecked")
	long solve1(){
		sets1=new TreeSet[w];
		for(int i=0; i<w; i++){
			sets1[i]=new TreeSet<Integer>();
			sets1[i].add(-1);
			sets1[i].add(h);
		}
		sets2=new TreeSet[h];
		for(int i=0; i<h; i++){
			sets2[i]=new TreeSet<Integer>();
			sets2[i].add(-1);
			sets2[i].add(w);
		}

		for(int i=0; i<n; i++){
			sets1[xs[i]].add(ys[i]);
			sets2[ys[i]].add(xs[i]);
		}
		sets1[gx].add(gy);
		sets2[gy].add(gx);

		long sum=1;
		for(int x=0; x<w; x++){
			int py=-2;
			for(int y : sets1[x]){
				int sy=y-1;
				if(sy!=py){
					if(ok(x, sy, 0)){
						// [py+1, y-1]
						sum+=y-py-1;
					}
				}
				py=y;
			}
		}
		return sum;
	}

	boolean ok(int x, int y, int d){
		for(int k=0; k<run.length(); k++){
			int wx, wy; // wall or goal
			int nx, ny; // next point
			if(d==0){
				wx=nx=x;
				wy=sets1[x].higher(y);
				ny=wy-1;
			}else if(d==1){
				wy=ny=y;
				wx=sets2[y].lower(x);
				nx=wx+1;
			}else if(d==2){
				wx=nx=x;
				wy=sets1[x].lower(y);
				ny=wy+1;
			}else{
				assert d==3;
				wy=ny=y;
				wx=sets2[y].higher(x);
				nx=wx-1;
			}
			if(wx==gx&&wy==gy){
				return true;
			}
			x=nx;
			y=ny;
			if(run.charAt(k)=='L'){
				d=(d+3)%4;
			}else if(run.charAt(k)=='R'){
				d=(d+1)%4;
			}
		}
		return false;
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new p01640().run();
	}
}