Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int ay = sc.nextInt();
        int ax = sc.nextInt();
        int by = sc.nextInt();
        int bx = sc.nextInt();

        int MOD = 1000000007;
        int INF = 1000000000;
        int[][] dists = new int[R][C];
        int[][] ptns = new int[R][C];
        Arrays.fill(dists[ay][ax], 0);
        Arrays.fill(ptns[ay][ax], 1);
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, ax, ay});
        int[][] dxs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int[][] dys = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int ans_d = -1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int d = cur[0], x = cur[1], y = cur[2];
            if (ans_d!= -1 && d > ans_d) {
                break;
            }
            if (x == bx && y == by) {
                ans_d = d;
            }
            if (d > dists[y][x]) {
                continue;
            }
            dists[y][x] = d;
            for (int i = 0; i < 4; i++) {
                int nx = x + dxs[i][0], ny = y + dys[i][1];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
                    continue;
                }
                if (d + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
                    q.offer(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] = (ptns[ny][nx] + ptns[y][x]) % MOD;
            }
            for (int i = 0; i < 2; i++) {
                int nx = x + dxs[i][0], ny = y + dys[i][1];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
                    continue;
                }
                if (d + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
                    q.offer(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] = (ptns[ny][nx] + ptns[y][x]) % MOD;
            }
        }

        System.out.println(ans_d);
        System.out.println(ptns[by][bx]);
    }
}
```<|endoftext|>
