<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
from collections import deque
R,C,ay,ax,by,bx = map(int,input().split())

MOD = INF = 10**9+7
dists = [[INF]*C for i in range(R)]
dists[ay][ax] = 0
ptns = [[0]*C for i in range(R)]
ptns[ay][ax] = 1
q = deque([(0,ax,ay)])
dxs = [1,0,-1,0]
dys = [0,1,0,-1]
ans_d = None
while q:
    d,x,y = q.popleft()
    if ans_d is not None and d > ans_d:
        break
    if (x,y) == (bx,by):
        ans_d = d
    if d > dists[y][x]: continue
    dists[y][x] = d
    for dx,dy in zip(dxs,dys):
        nx,ny = x+dx, y+dy
        if not(0 <= nx < C) or not(0 <= ny < R): continue
        if d+1 > dists[ny][nx]: continue
        if dists[ny][nx] == INF:
            q.append((d+1,nx,ny))
            dists[ny][nx] = d+1
        ptns[ny][nx] += ptns[y][x]
        ptns[ny][nx] %= MOD
    for nx,ny in ((x,0),(x,R-1),(0,y),(C-1,y)):
        if d+1 > dists[ny][nx]: continue
        if dists[ny][nx] == INF:
            q.append((d+1,nx,ny))
            dists[ny][nx] = d+1
        ptns[ny][nx] += ptns[y][x]
        ptns[ny][nx] %= MOD

print(ans_d, ptns[by][bx] % MOD)


```
[/INST]
```java
import java.util.*;

public class Main {
    static int R, C, ay, ax, by, bx;
    static int MOD = 1000000007;
    static int INF = Integer.MAX_VALUE;
    static int[][] dists = new int[R][C];
    static int[][] ptns = new int[R][C];
    static int ans_d = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        ay = sc.nextInt();
        ax = sc.nextInt();
        by = sc.nextInt();
        bx = sc.nextInt();

        Arrays.fill(dists, INF);
        dists[ay][ax] = 0;
        ptns[ay][ax] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, ax, ay});
        int[] dxs = {1, 0, -1, 0};
        int[] dys = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            int[] d = q.poll();
            if (ans_d != 0 && d[0] > ans_d) {
                break;
            }
            if (Arrays.equals(d, new int[]{bx, by})) {
                ans_d = d[0];
            }
            if (d[0] > dists[ay][ax]) {
                continue;
            }
            dists[ay][ax] = d[0];
            for (int i = 0; i < dxs.length; i++) {
                int nx = ax + dxs[i];
                int ny = ay + dys[i];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
                    continue;
                }
                if (d[0] + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{d[0] + 1, nx, ny});
                    dists[ny][nx] = d[0] + 1;
                }
                ptns[ny][nx] += ptns[ay][ax];
                ptns[ny][nx] %= MOD;
            }
            for (int i = 0; i < dxs.length; i++) {
                int nx = ax + dxs[i];
                int ny = ay + dys[i];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
                    continue;
                }
                if (d[0] + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{d[0] + 1, nx, ny});
                    dists[ny][nx] = d[0] + 1;
                }
                ptns[ny][nx] += ptns[ay][ax];
                ptns[ny][nx] %= MOD;
            }
        }
        System.out.println(ans_d + " " + ptns[by][bx] % MOD);
    }
}
```</s>
