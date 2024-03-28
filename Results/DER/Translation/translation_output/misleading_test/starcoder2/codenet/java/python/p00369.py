

```python

import sys

def checkEqual(S):
    ans = 8
    for k in range(1, len(S)):
        if len(S) % k != 0:
            continue
        mins = maxs = S[0:k]
        for s in range(0, len(S), k):
            tmp = S[s:s+k]
            if tmp > maxs:
                maxs = tmp
            if tmp < mins:
                mins = tmp
        ans = min(ans, sub(maxs, mins))
    return ans

def check12(S):
    maxv = 0
    minv = 10
    for p in range(0, len(S)):
        v = int(S[p])
        if S[p] == '1' and p+1 < len(S):
            v = 10 + int(S[p+1])
            p += 1
        maxv = max(maxv, v)
        minv = min(minv, v)
    return maxv - minv

def sub(maxs, mins):
    for i in range(0, len(maxs)):
        if maxs[i] != mins[i]:
            if i == len(maxs)-1:
                return int(maxs[i]) - int(mins[i])
            if i == len(maxs)-2:
                return (10*int(maxs[i])+int(maxs[i+1])) - (10*int(mins[i])+int(mins[i+1]))
            return 10
    return 0

def solve():
    S = sys.stdin.readline().strip()
    print(min(checkEqual(S), check12(S)))

if __name__ == '__main__':
    solve()

```

## 00370 - Cubic Eight-Puzzle

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 0

Expected output:
1

```
import java.util.*;

class p00370{
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    int[][] board = new int[3][3];
    int[][] goal = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
    int[][][] dist = new int[3][3][3];
    int[][][] prev = new int[3][3][3];
    int[][][] prev_dir = new int[3][3][3];

    void solve(){
        Scanner sc = new Scanner(System.in);
        for ( int i = 0; i < 3; i++ )
            for ( int j = 0; j < 3; j++ )
                board[i][j] = sc.nextInt();
        if ( !check() ) {
            System.out.println("unsolvable");
            return;
        }
        for ( int i = 0; i < 3; i++ )
            for ( int j = 0; j < 3; j++ )
                for ( int k = 0; k < 3; k++ )
                    dist[i][j][k] = -1;
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{0, 0, 0});
        dist[0][0][0] = 0;
        while ( !q.isEmpty() ){
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], z = cur[2];
            if ( x == 2 && y == 2 && z == 2 ) break;
            for ( int d = 0; d < 4; d++ ){
                int nx = x + dx[d], ny = y + dy[d], nz = z;
                if ( nx < 0 || nx >= 3 || ny < 0 || ny >= 3 ) continue;
                if ( board[x][y] == 1 && board[nx][ny] == 2 ) nz = 1;
                if ( board[x][y] == 2 && board[nx][ny] == 1 ) nz = 1;
                if ( board[x][y] == 1 && board[nx][ny] == 3 ) nz = 2;
                if ( board[x][y] == 3 && board[nx][ny] == 1 ) nz = 2;
                if ( dist[nx][ny][nz] != -1 ) continue;
                dist[nx][ny][nz] = dist[x][y][z] + 1;
                prev[nx][ny][nz] = x;
                prev_dir[nx][ny][nz] = y;
                q.add(new int[]{nx, ny, nz});
            }
        }
        System.out.println(dist[2][2][2]);
    }

    boolean check(){
        int[] cnt = new int[9];
        for ( int i = 0; i < 3; i++ )
            for ( int j = 0; j < 3; j++ )
                cnt[board[i][j]]++;
        for ( int i = 0; i < 9; i++ )
            if ( cnt[i] != 1 ) return false;
        return true;
    }

    public static void main(String[] args){
        new p00370().solve();
    }
}

```

python code:

```python

import sys

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
board = [[0 for i in range(3)] for j in range(3)]
goal = [[1, 2, 3], [4, 5, 6], [7, 8, 0]]
dist = [[[0 for i in range(3)] for j in range(3)] for k in range(3)]
prev = [[[0 for i in range(3)] for j in range(3)] for k in range(3)]

