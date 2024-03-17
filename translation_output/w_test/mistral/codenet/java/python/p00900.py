<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 6

Expected output:
6


```

import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class p00900 {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int h, w, size;
	int[][] map;
	boolean[][] bomb;
	P[] ps;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			h = sc.nextInt(); w = sc.nextInt();
			if((h|w) == 0) break;
			
			map = new int[h][w];
			bomb = new boolean[h][w];
			ArrayList<P> ps = new ArrayList<P>();
			for(int i=0;i<h;i++) {
				String l = sc.next();
				for(int j=0;j<w;j++) {
					switch ( l.charAt(j) ) {
						case '.': map[i][j] = -1; break;
						case '*': map[i][j] = 0;  break;
						default:  map[i][j] = l.charAt(j) - '0';
								  ps.add(new P(j, i));
					}
				}
			}
			
			this.ps = ps.toArray(new P[]{});
			size = ps.size();
			memo = new HashMap<Long, Integer>();
			pow10 = new long[size];
			pow10[0] = 100L; 
			long S = pow10[0] * map[this.ps[0].y][this.ps[0].x];
			for(int i=1;i<size;i++) {
				pow10[i] = pow10[i-1] * 10L;
				S += pow10[i] * map[this.ps[i].y][this.ps[i].x];
			}
//			debug(pow10);
			System.out.println(solve(S, 0));
		}
	}
	
	int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
	int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
	long[] pow10;
	HashMap<Long, Integer> memo;
	int solve(long S, int cnt) {
		int p = (int)(S % 100);
//		debug(S, cnt, p);
		if(memo.containsKey(S)) return memo.get(S);
		if(S % 100 == size) {
			if(S / 100 == 0) return 0;
			return INF;
		}
		
		if(cnt == 9) {
			if(S / pow10[p] % 10 == 0) {
				int ret = solve(S+1, 0);
				memo.put(S, ret);
				return ret;
			}
			else return INF;
		}
		
		int min = solve(S, cnt+1);
		int x = ps[p].x + dx[cnt], y = ps[p].y + dy[cnt];
		
		if(out(x, y) || bomb[y][x] || map[y][x] < 0) return min;
		long next = S;
		bomb[y][x] = true;
		
		boolean ng = false;
		for(int i=0;i<size;i++) for(int j=0;j<9;j++){
			int tx = x + dx[j], ty = y + dy[j];
			if(out(tx, ty)) continue;
			P tar = new P(tx, ty);
			if(!ps[i].isEquals(tar)) continue;
			if(next / pow10[i] % 10 > 0) next -= pow10[i];
			else ng = true;
		}

		if(!ng) min = min(min, solve(next, cnt+1) + 1);
		
		bomb[y][x] = false;
//		debug("", x, y, next, min);
		return min;
	}
	
	boolean out(int x, int y) {
		return x < 0 || y < 0 || x >= w || y >= h;
	}
	
	class P {
		int x, y;
		P(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		boolean isEquals(P p) {
			return x == p.x && y == p.y;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new p00900().run();
	}
}
```
[/INST]
```python
import sys

def solve(S, cnt):
    p = S % 100
    if memo.get(S):
        return memo[S]
    if S % 100 == size:
        if S // 100 == 0:
            return 0
        return sys.maxsize
    if cnt == 9:
        if S // pow10[p] % 10 == 0:
            return solve(S + 1, 0)
        return sys.maxsize
    min = solve(S, cnt + 1)
    x, y = ps[p].x + dx[cnt], ps[p].y + dy[cnt]
    if out(x, y) or bomb[y][x] or map[y][x] < 0:
        return min
    next = S
    bomb[y][x] = True
    ng = False
    for i in range(size):
        for j in range(9):
            tx, ty = x + dx[j], y + dy[j]
            if out(tx, ty):
                continue
            tar = P(tx, ty)
            if not tar.isEquals(ps[i]):
                continue
            if next // pow10[i] % 10 > 0:
                next -= pow10[i]
            else:
                ng = True
    if not ng:
        min = min(min, solve(next, cnt + 1) + 1)
    bomb[y][x] = False
    return min

def out(x, y):
    return x < 0 or y < 0 or x >= w or y >= h

class P:
    def __init__(self, x, y):
        self.x, self.y = x, y

    def isEquals(self, p):
        return self.x == p.x and self.y == p.y

def run():
    global memo, pow10
    memo = {}
    pow10 = [100]
    for i in range(size):
        pow10.append(pow10[i] * 10)
    S = pow10[0] * map[ps[0].y][ps[0].x]
    for i in range(1, size):

