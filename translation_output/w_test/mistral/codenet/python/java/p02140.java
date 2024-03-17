<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 0 0 1 1

Expected output:
2 8


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
    final static int INF = (int) 1e9 + 7;
    final static int MOD = INF;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = sc.nextLine().split(" ");
        int R = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);
        int ay = Integer.parseInt(input[2]);
        int ax = Integer.parseInt(input[3]);
        int by = Integer.parseInt(input[4]);
        int bx = Integer.parseInt(input[5]);

        int[][] dists = new int[R][C];
        Arrays.fill(dists, INF);
        dists[ay][ax] = 0;
        int[][] ptns = new int[R][C];
        Arrays.fill(ptns, 0);
        ptns[ay][ax] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, ax, ay});
        int[] dxs = {1, 0, -1, 0};
        int[] dys = {0, 1, 0, -1};
        int ans_d = null;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            if (ans_d != null && curr[0] > ans_d) {
                break;
            }
            if (curr[2] == bx && curr[1] == by) {
                ans_d = curr[0];
            }
            if (curr[0] > dists[curr[1]][curr[2]]) {
                continue;
            }
            dists[curr[1]][curr[2]] = curr[0];
            for (int i = 0; i < dxs.length; i++) {
                int nx = curr[2] + dxs[i];
                int ny = curr[1] + dys[i];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
                    continue;
                }
                if (curr[0] + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{curr[0] + 1, nx, ny});
                    dists[ny][nx] = curr[0] + 1;
                }
                ptns[ny][nx] += ptns[curr[1]][curr[2]];
                ptns[ny][nx] %= MOD;
            }
            for (int i = 0; i < dxs.length; i++) {
                int nx = curr[2] + dxs[i];
                int ny = curr[1] + dys[i];
                if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
                    continue;
                }
                if (curr[0] + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{curr[0] + 1, nx, ny});
                    dists[ny][nx] = curr[0] + 1;
                }
                ptns[ny][nx] += ptns[curr[1]][curr[2]];
                ptns[ny][nx] %= MOD;
            }
        }
        System.out.println(ans_d + " " + ptns[by][bx] % MOD);
    }
}
```</s>
