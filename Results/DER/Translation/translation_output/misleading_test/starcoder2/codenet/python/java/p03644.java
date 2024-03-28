
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 1, k = 0;
        for (int i = 2; i <= N; i += 2) {
            int temp = i, res = 0;
            while (temp % 2 == 0) {
                res++;
                temp /= 2;
            }
            if (k < res) {
                ans = i;
                k = res;
            }
        }
        System.out.println(ans);
    }
}
```

## 2. 1001번 문제

[1001번 문제](https://www.acmicpc.net/problem/1001)

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

## 3. 1002번 문제

[1002번 문제](https://www.acmicpc.net/problem/1002)

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

## 4. 1003번 문제

[1003번 문제](https://www.acmicpc.net/problem/1003)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] dp = new int[N + 1];
            dp[0] = 1;
            dp[1] = 1;
            for (int j = 2; j <= N; j++) {
                dp[j] = dp[j - 1] + dp[j - 2];
            }
            if (N == 0) {
                System.out.println("1 0");
            } else if (N == 1) {
                System.out.println("0 1");
            } else {
                System.out.println(dp[N - 2] + " " + dp[N - 1]);
            }
        }
    }
}
```

## 5. 1004번 문제

[1004번 문제](https://www.acmicpc.net/problem/1004)

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

## 6. 1005번 문제

[1005번 문제](https://www.acmicpc.net/problem/1005)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] time = new int[N];
            int[][] graph = new int[N][N];
            for (int j = 0; j < N; j++) {
                time[j] = sc.nextInt();
            }
            for (int j = 0; j < K; j++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                graph[x][y] = 1;
            }
            int W = sc.nextInt() - 1;
            int[] dp = new int[N];
            for (int j = 0; j < N; j++) {
                dp[j] = time[j];
                for (int k = 0; k < N; k++) {
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

## 7. 1008번 문제

[1008번 문제](https://www.acmicpc.net/problem/1008)

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

## 8. 1010번 문제

[1010번 문제](https://www.acmicpc.net/problem/1010)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] dp = new int[N + 1][M + 1];
            for (int j = 1; j <= N; j++) {
                dp[j][j] = 1;
                dp[j][1] = j;
            }
            for (int j = 2; j <= N; j++) {
                for (int k = 2; k <= M; k++) {
                    dp[j][k] = dp[j - 1
