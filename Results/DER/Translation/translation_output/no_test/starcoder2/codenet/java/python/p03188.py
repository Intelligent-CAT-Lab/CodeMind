
```

def solve():
    k = int(input())
    if k == 1:
        print(1)
        print(1)
        return
    n = (k + 3) // 4 * 2
    ret = [[0 for i in range(n)] for j in range(n)]
    for i in range(n):
        for j in range(n):
            ret[i][j] = (i % 2 == 0 and 0 or n) + (i + j) % n
    for i in range(n):
        for j in range(n):
            if ret[i][j] >= k:
                ret[i][j] = (ret[i][j] - n) % k
    print(n)
    for i in range(n):
        for j in range(n):
            print(ret[i][j] + 1, end=' ')
        print()

solve()

```

## 03189 - Cow Hurdles

### 题目大意

给出一个n*m的矩阵，每个格子里有一个数字，表示这个格子的高度。

现在有一头牛，它可以从一个格子跳到另一个格子，但是它只能向右或者向下跳，并且它只能跳到比它当前所在格子高度低的格子。

现在给出一个起点和一个终点，问牛最少需要跳多少次才能从起点跳到终点。

### 解题思路

这题是一道经典的BFS题目，但是由于数据量比较大，所以需要用到一些优化。

首先，我们可以用一个二维数组来记录每个格子的高度，然后用一个二维数组来记录每个格子的最短距离。

然后我们从起点开始BFS，每次从队列中取出一个格子，然后将它周围的格子的最短距离更新为当前格子的最短距离+1，然后将这个格子周围的格子加入队列。

最后输出终点的最短距离即可。

### 代码

```

public class p03189 {
  private static void solve() {
    int n = ni(), m = ni();
    int[][] h = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        h[i][j] = ni();
      }
    }
    int[][] d = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        d[i][j] = Integer.MAX_VALUE;
      }
    }
    int sx = ni() - 1, sy = ni() - 1, ex = ni() - 1, ey = ni() - 1;
    d[sx][sy] = 0;
    Queue<int[]> q = new LinkedList<>();
    q.add(new int[] { sx, sy });
    while (!q.isEmpty()) {
      int[] cur = q.poll();
      int x = cur[0], y = cur[1];
      if (x + 1 < n && h[x + 1][y] < h[x][y] && d[x + 1][y] > d[x][y] + 1) {
        d[x + 1][y] = d[x][y] + 1;
        q.add(new int[] { x + 1, y });
      }
      if (y + 1 < m && h[x][y + 1] < h[x][y] && d[x][y + 1] > d[x][y] + 1) {
        d[x][y + 1] = d[x][y] + 1;
        q.add(new int[] { x, y + 1 });
      }
    }
    System.out.println(d[ex][ey]);
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = args.length > 0 ? args[0] : null;
        if (debug != null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java
