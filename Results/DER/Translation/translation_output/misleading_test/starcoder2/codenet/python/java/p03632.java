
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int ans = Math.min(B,D) - Math.max(A,C);
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
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
            if (d == 0 && r1 == r2) {
                System.out.println(-1);
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
            int n = sc.nextInt();
            int[][] dp = new int[n + 1][2];
            dp[0][0] = 1;
            dp[1][1] = 1;
            for (int j = 2; j <= n; j++) {
                dp[j][0] = dp[j - 1][0] + dp[j - 2][0];
                dp[j][1] = dp[j - 1][1] + dp[j - 2][1];
            }
            System.out.println(dp[n][0] + " " + dp[n][1]);
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
            int n = sc.nextInt();
            int ans = 0;
            for (int j = 0; j < n; j++) {
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
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] time = new int[n];
            int[][] graph = new int[n][n];
            for (int j = 0; j < n; j++) {
                time[j] = sc.nextInt();
            }
            for (int j = 0; j < k; j++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                graph[x][y] = 1;
            }
            int w = sc.nextInt() - 1;
            int[] dp = new int[n];
            for (int j = 0; j < n; j++) {
                dp[j] = time[j];
                for (int l = 0; l < n; l++) {
                    if (graph[l][j] == 1) {
                        dp[j] = Math.max(dp[j], dp[l] + time[j]);
                    }
                }
            }
            System.out.println(dp[w]);
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
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] dp = new int[n + 1][m + 1];
            for (int j = 1; j <= n; j++) {
                dp[j][j] = 1;
                dp[j][1] = j;
            }
            for (int j = 2; j <= n; j
