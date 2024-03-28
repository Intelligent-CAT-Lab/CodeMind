<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 0 0 1 1

Expected output:
-86 51

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

Here is the Java code that implements the same logic as the Python code:
```java
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
        int INF = 1000000000;
        int[][] dists = new int[R][C];
        int[][] ptns = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                dists[i][j] = INF;
                ptns[i][j] = 0;
            }
        }
        dists[ay][ax] = 0;
        ptns[ay][ax] = 1;
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[] {0, ax, ay});
        int[] dxs = {1, 0, -1, 0};
        int[] dys = {0, 1, 0, -1};
        int ans_d = null;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int d = curr[0];
            int x = curr[1];
            int y = curr[2];
            if (ans_d != null && d > ans_d) {
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
                if (!(0 <= nx < C) || !(0 <= ny < R)) {
                    continue;
                }
                if (d + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
                    q.add(new int[] {d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= MOD;
            }
            for (int i = 0; i < 4; i++) {
                int nx = x + dxs[i];
                int ny = y + dys[i];
                if (d + 1 > dists[ny][nx]) {
                    continue;
                }
                if (dists[ny][nx] == INF) {
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
Note that the Java code uses the `ArrayDeque` class to implement the queue, which is a more efficient data structure for this use case than the `LinkedList` class. Additionally, the Java code uses the `Scanner` class to read input from the user, which is a more convenient way to read input than using `System.in.read()`.</s>
