

```python
import sys

t1, t2, r1, r2 = map(int, sys.stdin.readline().split())
if r1 == -1 or r2 == -1:
    r1 = -t1
    r2 = -t2
if r1 == r2:
    print("Draw")
elif r1 < r2:
    print("Bob")
else:
    print("Alice")
```

## p02163

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000 1000000000

Expected output:
1000000000000000000


```
import java.util.*;

public class p02163 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        System.out.println(n * m - 1);
    }
}


```

python code:

```python
import sys

n, m = map(int, sys.stdin.readline().split())
print(n * m - 1)
```

## p02164

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
6


```
import java.util.*;

public class p02164 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int idx = 0;
        while (n > 1) {
            idx = (idx + 1) % n;
            for (int i = idx; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            idx = idx % n;
        }
        System.out.println(arr[0]);
    }
}


```

python code:

```python
import sys

n = int(sys.stdin.readline())
arr = [i + 1 for i in range(n)]
idx = 0
while n > 1:
    idx = (idx + 1) % n
    for i in range(idx, n - 1):
        arr[i] = arr[i + 1]
    n -= 1
    idx = idx % n
print(arr[0])
```

## p02167

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 4
1 2 4 3 5
1 1 3 3
2 1 4 4
3 2 2 4
4 3 2 4

Expected output:
19
20
11
15


```
import java.util.*;

public class p02167 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j] += arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1];
            }
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            System.out.println(arr[x2][y2] - arr[x1 - 1][y2] - arr[x2][y1 - 1] + arr[x1 - 1][y1 - 1]);
        }
    }
}


```

python code:

```python
import sys

n, m = map(int, sys.stdin.readline().split())
arr = [[0 for _ in range(m + 1)] for _ in range(n + 1)]
for i in range(1, n + 1):
    arr[i][1:] = list(map(int, sys.stdin.readline().split()))
for i in range(1, n + 1):
    for j in range(1, m + 1):
        arr[i][j] += arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1]
k = int(sys.stdin.readline())
for _ in range(k):
    x1, y1, x2, y2 = map(int, sys.stdin.readline().split())
    print(arr[x2][y2] - arr[x1 - 1][y2] - arr[x2][y1 - 1] + arr[x1 - 1][y1 - 1])
```

## p02178

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 6
101111
101010
101011
111011

Expected output:
15


```
import java.util.*;

public class p02178 {
    static int n, m;
    static int[][] arr;
    static int[][] dist;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        dist[0][0] = 1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (arr[nx][ny] == 0 || dist[nx][ny] != 0) continue;
                dist[nx][ny] = dist
