<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int R = Integer.parseInt(line[0]);
        int C = Integer.parseInt(line[1]);
        int ay = Integer.parseInt(line[2]);
        int ax = Integer.parseInt(line[3]);
        int by = Integer.parseInt(line[4]);
        int bx = Integer.parseInt(line[5]);
        int[][] dists = new int[R][C];
        int[][] ptns = new int[R][C];
        int[][] dxs = {{1,0,-1,0},{0,1,0,-1}};
        int[][] dys = {{0,1,0,-1},{1,0,-1,0}};
        int MOD = 1000000007;
        int INF = 1000000000;
        dists[ay][ax] = 0;
        ptns[ay][ax] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,ax,ay});
        int ans_d = -1;
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int d = cur[0];
            int x = cur[1];
            int y = cur[2];
            if(ans_d!= -1 && d > ans_d) break;
            if(x == bx && y == by) {
                ans_d = d;
            }
            if(d > dists[y][x]) continue;
            dists[y][x] = d;
            for(int i = 0; i < 4; i++) {
                int nx = x + dxs[i][0];
                int ny = y + dys[i][0];
                if(nx < 0 || nx >= C || ny < 0 || ny >= R) continue;
                if(d + 1 > dists[ny][nx]) continue;
                if(dists[ny][nx] == INF) {
                    q.add(new int[]{d+1,nx,ny});
                    dists[ny][nx] = d+1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
            for(int i = 0; i < 2; i++) {
                int nx = x + dxs[i][1];
                int ny = y + dys[i][1];
                if(nx < 0 || nx >= C || ny < 0 || ny >= R) continue;
                if(d + 1 > dists[ny][nx]) continue;
                if(dists[ny][nx] == INF) {
                    q.add(new int[]{d+1,nx,ny});
                    dists[ny][nx] = d+1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
        }
        System.out.println(ans_d + " " + ptns[by][bx]);
    }
}
```
<|endoftext|>
