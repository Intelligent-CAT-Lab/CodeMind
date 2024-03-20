

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MOD = 1000000007;
        int X = (int)Math.pow(2, n) - 1;
        int A = modcomb(n, a, MOD);
        int B = modcomb(n, b, MOD);
        int ans = (X - A - B) % MOD;
        System.out.println(ans);
    }

    public static int modcomb(int n, int a, int mod) {
        int cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt *= (n - i);
            cnt *= pow(i + 1, mod - 2, mod);
            cnt %= mod;
        }
        return cnt;
    }

    public static int pow(int a, int b, int mod) {
        if (b == 0) return 1;
        long res = pow(a, b / 2, mod);
        res = (res * res) % mod;
        if (b % 2 == 1) res = (res * a) % mod;
        return (int)res;
    }
}
```
/2020/04/20200420.md
# 20200420

## 1. 1000번

### A+B

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 2. 1001번

### A-B

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a - b);
    }
}
```

## 3. 1002번

### 터렛

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            int d = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            int r = (r1 + r2) * (r1 + r2);
            int r12 = (r1 - r2) * (r1 - r2);
            if (d == 0 && r1 == r2) {
                System.out.println(-1);
            } else if (d == r || d == r12) {
                System.out.println(1);
            } else if (d > r || d < r12) {
                System.out.println(0);
            } else {
                System.out.println(2);
            }
        }
    }
}
```

## 4. 1003번

### 피보나치 함수

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] dp = new int[n + 1];
            dp[0] = 1;
            dp[1] = 1;
            for (int j = 2; j <= n; j++) {
                dp[j] = dp[j - 1] + dp[j - 2];
            }
            if (n == 0) {
                System.out.println(1 + " " + 0);
            } else if (n == 1) {
                System.out.println(0 + " " + 1);
            } else {
                System.out.println(dp[n - 1] + " " + dp[n]);
            }
        }
    }
}
```

## 5. 1004번

### 어린 왕자

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int n = sc.nextInt();
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int r = sc.nextInt();
                if (Math.pow(x - x1, 2) + Math.pow(y - y1, 2) < Math.pow(r, 2) && Math.pow(x - x2, 2) + Math.pow(y - y2, 2) > Math.pow(r, 2)) {
                    cnt++;
                } else if (Math.pow(x - x1, 2) + Math.pow(y - y1, 2) > Math.pow(r, 2) && Math.pow(x - x2, 2) + Math.pow(y - y2, 2) < Math.pow(r, 2)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
```

## 6. 1005번

### ACM Craft

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] time = new int[n + 1];
            int[] indegree = new int[n + 1];
            ArrayList<Integer>[] list = new ArrayList[n + 1];
            for (int j = 1; j <= n; j++) {
                time[j] = sc.nextInt();
                list[j] = new ArrayList<>();
            }
            for (int j = 0; j < k; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                list[a].add(b);
                indegree[b]++;
            }
            int w = sc.nextInt();
            Queue<Integer> q = new LinkedList<>();
            for (int j = 1; j <= n; j++) {
                if (indegree[j] == 0) {
                    q.add(j);
                }
            }
            int[] dp = new int[n + 1];
            while (!q.isEmpty()) {
                int x = q.poll();
                for (int y : list[x]) {
                    dp[y] = Math.max(dp[y], dp[x] + time[x]);
                    indegree[y]--;
                    if (indegree[y] == 0) {
                        q.add(y);
                    }
                }
           
