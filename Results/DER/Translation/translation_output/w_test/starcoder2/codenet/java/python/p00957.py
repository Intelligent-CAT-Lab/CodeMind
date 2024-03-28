

```
import sys

def main():
    l, k = map(int, sys.stdin.readline().split())
    dp = [[0 for i in range(l+1)] for j in range(2)]
    dp[0][0] = 1
    for i in range(1, l+1):
        dp[0][i] += dp[1][i-1]
        dp[1][i] += dp[0][i-1]
        if i >= k:
            dp[1][i] += dp[0][i-k]
    ans = 0
    for i in range(1, l+1):
        ans += dp[1][i]
    print(ans)

if __name__ == '__main__':
    main()
```

## 00958

### 题目

[题目链接](https://vjudge.net/problem/HDU-1008)

### 题意

### 思路

### 代码

```
import java.io.*;
import java.util.*;

class p00958 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int cur = 0;
            int ans = 0;
            for (int i = 0; i < n; ++i) {
                int x = sc.nextInt();
                if (x > cur)
                    ans += (x - cur) * 6;
                else
                    ans += (cur - x) * 4;
                ans += 5;
                cur = x;
            }
            out.println(ans);
        }
        out.close();
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```

## 00959

### 题目

[题目链接](https://vjudge.net/problem/HDU-1009)

### 题意

### 思路

### 代码

```
import java.io.*;
import java.util.*;

class p00959 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            double max = 0;
            for (int i = 0; i < n; ++i) {
                double m = sc.nextDouble();
                double v = sc.nextDouble();
                max = Math.max(max, m / v);
            }
            out.printf("%.3f\n", max);
        }
        out.close();
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```

## 00960

### 题目

[题目链接](https://vjudge.net/problem/HDU-1010)

### 题意

### 思路

### 代码

```
import java.io.*;
import java.util.*;

class p00960 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        while (true) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int t = sc.nextInt();
            if (m == 0 && n == 0 && t == 0)
                break;
            int[][] map = new int[m][n];
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    map[i][j] = sc.nextInt();
                }
            }
            int[][] dp = new int[m][n];
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (map[i][j] == 1)
                        dp[i][j] = -1;
                    else if (map[i][j] == 3)
                        dp[i][j] = 0;
                    else
                        dp[i][j] = Integer.MAX_VALUE;
                }
            }
            int[][] dir = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[]{0, 0});
            while (!q.isEmpty()) {
                int[] cur = q.poll();
                for (int i = 0; i < 4; ++i) {
                    int x = cur[0] + dir[i][0];
                    int y = cur[1] + dir[i][1];
                    if (x < 0 || x >= m || y < 0 || y >= n)
                        continue;
                   
