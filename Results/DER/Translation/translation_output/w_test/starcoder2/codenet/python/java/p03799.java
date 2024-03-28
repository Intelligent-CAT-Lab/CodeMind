

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ans = 0;
        if (2 * N <= M) {
            ans = N + (M - 2 * N) / 4;
        } else {
            ans = M / 2;
        }
        System.out.println(ans);
    }
}
```

## 2. 1000번

[1000번](https://www.acmicpc.net/problem/1000)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A + B);
    }
}
```

## 3. 1001번

[1001번](https://www.acmicpc.net/problem/1001)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A - B);
    }
}
```

## 4. 1002번

[1002번](https://www.acmicpc.net/problem/1002)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            int d = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            int r = (r1 + r2) * (r1 + r2);
            int R = (r1 - r2) * (r1 - r2);
            if (d == 0) {
                if (r1 == r2) {
                    System.out.println(-1);
                } else {
                    System.out.println(0);
                }
            } else if (d == r || d == R) {
                System.out.println(1);
            } else if (d < r && d > R) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
    }
}
```

## 5. 1003번

[1003번](https://www.acmicpc.net/problem/1003)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[][] dp = new int[N + 1][2];
            dp[0][0] = 1;
            dp[0][1] = 0;
            dp[1][0] = 0;
            dp[1][1] = 1;
            for (int j = 2; j <= N; j++) {
                dp[j][0] = dp[j - 1][0] + dp[j - 2][0];
                dp[j][1] = dp[j - 1][1] + dp[j - 2][1];
            }
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
    }
}
```

## 6. 1004번

[1004번](https://www.acmicpc.net/problem/1004)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int N = sc.nextInt();
            int ans = 0;
            for (int j = 0; j < N; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int r = sc.nextInt();
                if ((x - x1) * (x - x1) + (y - y1) * (y - y1) < r * r && (x - x2) * (x - x2) + (y - y2) * (y - y2) > r * r) {
                    ans++;
                } else if ((x - x1) * (x - x1) + (y - y1) * (y - y1) > r * r && (x - x2) * (x - x2) + (y - y2) * (y - y2) < r * r) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 7. 1005번

[1005번](https://www.acmicpc.net/problem/1005)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] time = new int[N + 1];
            int[][] graph = new int[N + 1][N + 1];
            for (int j = 1; j <= N; j++) {
                time[j] = sc.nextInt();
            }
            for (int j = 0; j < K; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                graph[x][y] = 1;
            }
            int W = sc.nextInt();
            int[] dp = new int[N + 1];
            for (int j = 1; j <= N; j++) {
                dp[j] = time[j];
                for (int k = 1; k <= N; k++) {
                    if (graph[k][j] == 1) {
                        dp[j] = Math.max(dp[j], dp[k] + time[j]);
                    }
                }
            }
            System.out.println(dp[W]);
        }
    }
}
```

## 8. 1008번

[1008번](https://www.acmicpc.net/problem/1008)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.println(A / B);
    }
}
```

## 9. 1010번

[1010번](https://www.acmicpc.net/problem/1010)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] dp = new int[N + 1
