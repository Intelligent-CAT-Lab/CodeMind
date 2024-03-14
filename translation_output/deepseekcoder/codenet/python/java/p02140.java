<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;

public class Main {
    private static final int INF = (int) Math.pow(10, 9) + 7;
    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static int R, C, ay, ax, by, bx;
    private static int[][] dists;
    private static long[][] ptns;
    private static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        R = scanner.nextInt();
        C = scanner.nextInt();
        ay = scanner.nextInt();
        ax = scanner.nextInt();
        by = scanner.nextInt();
        bx = scanner.nextInt();

        dists = new int[R][C];
        for (int i = 0; i < R; i++)
            Arrays.fill(dists[i], INF);

        ptns = new long[R][C];
        dists[ay][ax] = 0;
        ptns[ay][ax] = 1;
        q.add(new int[]{0, ax, ay});

        int ans_d = bfs();
        System.out.println(ans_d + " " + ptns[by][bx] % INF);
    }

    private static int bfs() {
        int ans_d = -1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int d = cur[0], x = cur[1], y = cur[2];
            if (ans_d != -1 && d > ans_d)
                break;
            if (x == bx && y == by)
                ans_d = d;
            if (d > dists[y][x]) continue;
            dists[y][x] = d;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) continue;
                if (d + 1 > dists[ny][nx]) continue;
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= INF;
            }
            for (int[] n : new int[][]{{x, 0}, {x, R - 1}, {0, y}, {C - 1, y}}) {
                int nx = n[0], ny = n[1];
                if (d + 1 > dists[ny][nx]) continue;
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= INF;
            }
        }
        return ans_d;
    }
}
```
<|EOT|>
