Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
w h g

Expected output:
17

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

### Response:
```python
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

class p01640:
    def __init__(self):
        self.sc=Scanner(System.in)

    def run(self):
        self.w=self.sc.nextInt()
        self.h=self.sc.nextInt()
        self.gx=self.sc.nextInt()-1
        self.gy=self.sc.nextInt()-1
        self.n=self.sc.nextInt()
        self.xs=[self.sc.nextInt()-1 for i in range(self.n)]
        self.ys=[self.sc.nextInt()-1 for i in range(self.n)]
        self.run=self.sc.next()+"$"
        self.solve()

    def solve(self):
        sum=0
        for d in range(4):
            sum+=self.solve1()
            ngx=self.h-1-self.gy
            ngy=self.gx
            self.gx=ngx
            self.gy=ngy
            self.xs=[self.h-1-self.ys[i] for i in range(self.n)]
            self.ys=[self.xs[i] for i in range(self.n)]
            t=self.w
            self.w=self.h
            self.h=t
        self.println(str(sum))

    def solve1(self):
        sets1=[TreeSet() for i in range(self.w)]
        for i in range(self.w):
            sets1[i].add(-1)
            sets1[i].add(self.h)
        sets2=[TreeSet() for i in range(self.h)]
        for i in range(self.h):
            sets2[i].add(-1)
            sets2[i].add(self.w)

        for i in range(self.n):
            sets1[self.xs[i]].add(self.ys[i])
            sets2[self.ys[i]].add(self.xs[i])
        sets1[self.gx].add(self.gy)
        sets2[self.gy].add(self.gx)

        sum=1
        for x in range(self.w):
            py=-2
            for y in sets1[x]:
                sy=y-1
                if sy!=py:
                    if self.ok(x, sy, 0):
                        # [py+1, y-1]
                        sum+=y-py-1
                py=y
        return sum

    def ok(self, x, y, d):
        for k in range(len(self.run)):
            wx, wy=0, 0 # wall or goal
            nx, ny=0, 0 # next point
            if d==0:
                wx=nx=x
                wy=list(sets1[x])[list(sets1[x]).index(y)+1]
                ny=wy-1
            elif d==1:
                wy=ny=y
                wx=list(sets2[y])[list(sets2[y]).index(x)-1]
                nx=wx+1
            elif d==2:
                wx=nx=x
                wy=list(sets1[x])[list(sets1[x]).index(y)-1]
                ny=wy+1
            else:
                assert d==3
                wy=ny=y
                wx=list(sets2[y])[list(sets2[y]).index(x)+1]
                nx=wx-1
            if wx==self.gx and wy==self.gy:
                return True
            x=nx
            y=ny
            if self.run[k]=='L':
                d=(d+3)%4
            elif self.run[k]=='R':
                d=(d+1)%4
        return False

    def println(self, s):
        print(s)


