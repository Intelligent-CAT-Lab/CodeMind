System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
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
```


Answer:
```python
import sys

# Get Lost
def solve(w, h, gx, gy, n, xs, ys, run):
    sum = 0
    for d in range(4):
        sum += solve1(w, h, gx, gy, n, xs, ys, run)
        gx, gy = h - 1 - gy, gx
        xs, ys = [h - 1 - y for y in ys], xs
        w, h = h, w
    return sum

def solve1(w, h, gx, gy, n, xs, ys, run):
    sets1 = [set() for _ in range(w)]
    sets2 = [set() for _ in range(h)]
    for x, y in zip(xs, ys):
        sets1[x].add(y)
        sets2[y].add(x)
    sets1[gx].add(gy)
    sets2[gy].add(gx)

    sum = 1
    for x in range(w):
        py = -2
        for y in sorted(sets1[x]):
            sy = y - 1
            if sy!= py:
                if ok(x, sy, 0, w, h, gx, gy, sets1, sets2, run):
                    sum += y - py - 1
            py = y
    return sum

def ok(x, y, d, w, h, gx, gy, sets1, sets2, run):
    for k in range(len(run)):
        wx, wy = x, y
        nx, ny = x, y
        if d == 0:
            wx, wy = x, sets1[x].higher(y)
            ny = wy - 1
        elif d == 1:
            wy, wx = y, sets2[y].lower(x)
            nx = wx + 1
        elif d == 2:
            wx, wy = x, sets1[x].lower(y)
            ny = wy + 1
        else:
            assert d == 3
            wy, wx = y, sets2[y].higher(x)
            nx = wx - 1
        if wx == gx and wy == gy:
            return True
        x, y = nx, ny
        if run[k] == 'L':
            d = (d + 3) % 4
        else:
            assert run[k] == 'R'
            d = (d + 1) % 4
    return False

def main():
    w, h, gx, gy, n = map(int, input().split())
    xs, ys = [], []
    for _ in range(n):
        x, y = map(int, input().split())
        xs.append(x)
        ys.append(y)
    run = input()
    print(solve(w, h, gx, gy, n, xs, ys, run))

if __name__ == '__main__':
    main()
```<|endoftext|>
