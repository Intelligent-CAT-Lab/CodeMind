
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(S.substring(0, 4).equals("YAKI") ? "Yes" : "No");
    }
}
```


```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (A[i] == A[j] || A[j] == A[k] || A[k] == A[i]) {
                        continue;
                    }
                    if (A[i] + A[j] > A[k] && A[j] + A[k] > A[i] && A[k] + A[i] > A[j]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
/ABC/ABC129/README.md
# ABC129

## A - Airplane

```

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        System.out.println(Math.min(P + Q, Math.min(Q + R, R + P)));
    }
}
```

## B - Balance

```

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] W = new int[N];
        for (int i = 0; i < N; i++) {
            W[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += W[j];
            }
            for (int j = i; j < N; j++) {
                sum2 += W[j];
            }
            ans = Math.min(ans, Math.abs(sum1 - sum2));
        }
        System.out.println(ans);
    }
}
```

## C - Typical Stairs

```

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }
        long[] dp = new long[N + 1];
        dp[0] = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i + A[j] <= N) {
                    dp[i + A[j]] += dp[i];
                    dp[i + A[j]] %= 1000000007;
                }
            }
        }
        System.out.println(dp[N]);
    }
}
```

## D - Handstand

```

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] S = new char[H][W];
        for (int i = 0; i < H; i++) {
            S[i] = sc.next().toCharArray();
        }
        int[][] up = new int[H][W];
        int[][] down = new int[H][W];
        int[][] left = new int[H][W];
        int[][] right = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (S[i][j] == '#') {
                    continue;
                }
                if (i == 0) {
                    up[i][j] = 1;
                } else {
                    up[i][j] = up[i - 1][j] + 1;
                }
            }
        }
        for (int i = H - 1; i >= 0; i--) {
            for (int j = 0; j < W; j++) {
                if (S[i][j] == '#') {
                    continue;
                }
                if (i == H - 1) {
                    down[i][j] = 1;
                } else {
                    down[i][j] = down[i + 1][j] + 1;
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (S[i][j] == '#') {
                    continue;
                }
                if (j == 0) {
                    left[i][j] = 1;
                } else {
                    left[i][j] = left[i][j - 1] + 1;
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = W - 1; j >= 0; j--) {
                if (S[i][j] == '#') {
                    continue;
                }
                if (j == W - 1) {
                    right[i][j] = 1;
                } else {
                    right[i][j] = right[i][j + 1] + 1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (S[i][j] == '#') {
                    continue;
                }
                ans = Math.max(ans, up[i][j] + down[i][j] + left[i][j] + right[i][j] - 3);
            }
        }
        System.out.println(ans);
    }
}
```

## E - To 1

```

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long ans = 0;
        for (int i = 0; i < 60; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if ((A[j] & (1 << i)) != 0) {
                    cnt++;
                }
            }
            ans += (1L << i) * cnt * (N - cnt);
        }
        System.out.println(ans);
    }
}
```

## F - Yet Another Mechanical Robot

```/ABC/ABC128/README.md
# ABC128

## A - Apple Pie

```

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int P = sc.nextInt();
        System.out.println((A * 3 + P) / 2);
    }
}
```

##
