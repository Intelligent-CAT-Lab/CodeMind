
```
import sys

def main():
    c = sys.stdin.readline().strip()
    count = 0
    for i in range(len(c)):
        if c[i] == 'D' or c[i] == '?':
            count += 1
            c = c[:i] + 'D' + c[i+1:]
    print(c)
    print(count)

if __name__ == '__main__':
    main()
```

## p02665

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02665 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
            String s = sc.next();
            for (int j = 0 ; j < n ; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        int[][] dp = new int[n][n];
        dp[0][0] = 1;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (i == 0 && j == 0) continue;
                if (map[i][j] == 0) {
                    if (i > 0) dp[i][j] += dp[i-1][j];
                    if (j > 0) dp[i][j] += dp[i][j-1];
                } else {
                    if (i > 0) dp[i][j] += dp[i-1][j] * 2;
                    if (j > 0) dp[i][j] += dp[i][j-1] * 2;
                }
            }
        }
        System.out.println(dp[n-1][n-1]);
    }

}
```

python code:
```
import sys

def main():
    n = int(sys.stdin.readline().strip())
    map = []
    for i in range(n):
        map.append(list(map(int, sys.stdin.readline().strip())))
    dp = [[0 for i in range(n)] for j in range(n)]
    dp[0][0] = 1
    for i in range(n):
        for j in range(n):
            if i == 0 and j == 0:
                continue
            if map[i][j] == 0:
                if i > 0:
                    dp[i][j] += dp[i-1][j]
                if j > 0:
                    dp[i][j] += dp[i][j-1]
            else:
                if i > 0:
                    dp[i][j] += dp[i-1][j] * 2
                if j > 0:
                    dp[i][j] += dp[i][j-1] * 2
    print(dp[n-1][n-1])

if __name__ == '__main__':
    main()
```

## p02667

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p02667 {

    static int[][] map;
    static int[][] visit;
    static int n;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        visit = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
            String s = sc.next();
            for (int j = 0 ; j < n ; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (map[i][j] == 1 && visit[i][j] == 0) {
                    int count = 0;
                    dfs(i, j, count);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

    private static void dfs(int x, int y, int count) {
        visit[x][y] = 1;
        count++;
        for (int i = 0 ; i < 4 ; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                if (map[nx][ny] == 1 && visit[nx][ny] == 0) {
                    dfs(nx, ny, count);
                }
            }
        }
    }

}
```

python code:
```
import sys

def main():
    n = int(sys.stdin.readline().strip())
    map = []
    visit = [[0 for i in range(n)] for j in range(n)]
    for i in range(n):
        map.append(list(map(int, sys.stdin.readline().strip())))
    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]
    list = []
    for i in range(n):
        for j in range(n):
            if map[i][j] == 1 and visit[i][j] == 0:
                count = 0
                dfs(i, j, count)
                list.append(count)
    list.sort()
    print(len(list))
    for i in range(len(list)):
        print(list[i])

def dfs(x, y, count):
    visit[x][y] = 1
    count += 1
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx >= 0 and nx < n and ny >= 0 and ny < n:
            if map[nx][ny] == 1 and visit[nx][ny] == 0:
                dfs(nx, ny, count)

if __name__ == '__main__':
    main()
```

## p02675

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02675 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0 ; i < t ; i++) {
            int r = sc.nextInt();
            String s = sc.next();
            for (int j = 0 ; j < s.length() ; j++) {
                for (int k = 0 ; k < r ; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }

}
```

python code:
```
import sys

def main():
    t = int(sys.stdin.readline().strip())
    for i in range(t):
        r, s = sys.stdin.readline().strip().split()
        r = int(r)
        for j in range(len(s)):
            for k in range(r):
                print(s[j], end='')
        print()

if __name__ == '__main__':
    main()
```

## p02739

