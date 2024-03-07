<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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



Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int ay = sc.nextInt();
        int ax = sc.nextInt();
        int by = sc.nextInt();
        int bx = sc.nextInt();

        int MOD = 1000000007;
        int[][] dists = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                dists[i][j] = Integer.MAX_VALUE;
            }
        }
        dists[ay][ax] = 0;
        int[][] ptns = new int[R][C];
        ptns[ay][ax] = 1;
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[] {0, ax, ay});
        int[] dxs = {1, 0, -1, 0};
        int[] dys = {0, 1, 0, -1};
        int ans_d = -1;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int d = curr[0];
            int x = curr[1];
            int y = curr[2];
            if (ans_d != -1 && d > ans_d) {
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
                int nx = x + dxs[i];
                int ny = y + dys[i];
                if (!(0 <= nx && nx < C) || !(0 <= ny && ny < R)) {
                    continue;
                }
                if (d + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == Integer.MAX_VALUE) {
                    q.add(new int[] {d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
            for (int i = 0; i < 4; i++) {
                int nx = x + dxs[i];
                int ny = y + dys[i];
                if (!(0 <= nx && nx < C) || !(0 <= ny && ny < R)) {
                    continue;
                }
                if (d + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == Integer.MAX_VALUE) {
                    q.add(new int[] {d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
        }
        System.out.println(ans_d + " " + ptns[by][bx] % MOD);
    }
}
```
This is the Java code for the given Python code. It uses the same algorithm and data structures as the Python code, but with Java syntax. The code reads the input from the user, initializes the `dists` and `ptns` arrays, and then uses a BFS algorithm to find the shortest path from the starting point to the ending point. The `ans_d` variable is used to store the shortest distance, and the `ptns` array is used to store the number of patterns that can be formed by the shortest path. The code then prints the shortest distance and the number of patterns that can be formed by the shortest path.</s>
