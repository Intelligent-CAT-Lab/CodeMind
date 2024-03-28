

```java
import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = (int)1e9 + 7;
    static final int MAX = 1000000;
    static int[] pow2 = new int[MAX + 10];
    static int[] ipow2 = new int[MAX + 10];
    static int[] dp = new int[MAX + 10];
    static int[] B = new int[MAX + 10];
    static int[] C = new int[MAX + 10];

    static void make_power(int a, int L) {
        int B = Integer.highestOneBit(L);
        pow2[0] = 1;
        for (int n = 0; n < B; n++) {
            for (int i = 1 << n; i < 1 << (n + 1); i++) {
                pow2[i] = (int)((long)pow2[i - (1 << n)] * a % MOD);
            }
            a = (int)((long)a * a % MOD);
        }
        for (int i = 0; i < L; i++) {
            pow2[i] = pow2[i];
        }
    }

    static void make_ipower(int a, int L) {
        int B = Integer.highestOneBit(L);
        ipow2[0] = 1;
        for (int n = 0; n < B; n++) {
            for (int i = 1 << n; i < 1 << (n + 1); i++) {
                ipow2[i] = (int)((long)ipow2[i - (1 << n)] * a % MOD);
            }
            a = (int)((long)a * a % MOD);
        }
        for (int i = 0; i < L; i++) {
            ipow2[i] = ipow2[i];
        }
    }

    static void update(int[] dp) {
        for (int i = 0; i < dp.length; i++) {
            B[i] = dp[i];
        }
        for (int i = 0; i < dp.length; i++) {
            C[i] = (int)((long)dp[i] * i % MOD * ipow2[i] % MOD);
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i] = (int)((long)dp[i - 1] + C[i - 1]) % MOD;
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i] = (int)((long)dp[i] * pow2[i] % MOD);
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i] = (int)((long)dp[i] + i * B[i - 1] % MOD) % MOD;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        make_power(2, M + 10);
        make_ipower((1 + MOD) / 2, M + 10);
        for (int i = 0; i < M + 1; i++) {
            dp[i] = pow2[i];
        }
        for (int i = 0; i < N - 1; i++) {
            update(dp);
        }
        System.out.println(dp[M]);
    }
}
```

## 2. 2020-01-01

### 2.1. 1000

#### 2.1.1. Problem

[1000](https://www.acmicpc.net/problem/1000)

#### 2.1.2. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(a + b);
    }
}
```

### 2.2. 1001

#### 2.2.1. Problem

[1001](https://www.acmicpc.net/problem/1001)

#### 2.2.2. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(a - b);
    }
}
```

### 2.3. 1002

#### 2.3.1. Problem

[1002](https://www.acmicpc.net/problem/1002)

#### 2.3.2. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
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

### 2.4. 1003

#### 2.4.1. Problem

[1003](https
