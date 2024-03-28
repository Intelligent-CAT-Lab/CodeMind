Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
Here's the Python code for the given Java code:

```python
import sys
import math

class P:
    def __init__(self, x, y):
        self.x = x
        self.y = y

class p00900:
    def __init__(self):
        self.INF = 1 << 28
        self.EPS = 1e-10
        self.h = 0
        self.w = 0
        self.size = 0
        self.map = []
        self.bomb = []
        self.ps = []
        self.dx = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
        self.dy = [-1, 0, 1, -1, 0, 1, -1, 0, 1]
        self.memo = {}
        self.pow10 = []

    def run(self):
        sc = sys.stdin
        while True:
            self.h, self.w = map(int, sc.readline().split())
            if self.h == 0 and self.w == 0:
                break
            self.map = [[-1 for _ in range(self.w)] for _ in range(self.h)]
            self.bomb = [[False for _ in range(self.w)] for _ in range(self.h)]
            self.ps = []
            for i in range(self.h):
                l = sc.readline().strip()
                for j in range(self.w):
                    if l[j] == '.':
                        self.map[i][j] = -1
                    elif l[j] == '*':
                        self.map[i][j] = 0
                    else:
                        self.map[i][j] = int(l[j])
                        self.ps.append(P(j, i))
            self.size = len(self.ps)
            self.pow10 = [100]
            for i in range(1, self.size):
                self.pow10.append(self.pow10[i-1] * 10)
            S = self.pow10[0] * self.map[self.ps[0].y][self.ps[0].x]
            for i in range(1, self.size):
                S += self.pow10[i] * self.map[self.ps[i].y][self.ps[i].x]
            print(self.solve(S, 0))

    def solve(self, S, cnt):
        p = S % 100
        if S in self.memo:
            return self.memo[S]
        if S % 100 == self.size:
            if S // 100 == 0:
                return 0
            return self.INF
        if cnt == 9:
            if S // self.pow10[p] % 10 == 0:
                ret = self.solve(S+1, 0)
                self.memo[S] = ret
                return ret
            else:
                return self.INF
        min = self.solve(S, cnt+1)
        x = self.ps[p].x + self.dx[cnt]
        y = self.ps[p].y + self.dy[cnt
