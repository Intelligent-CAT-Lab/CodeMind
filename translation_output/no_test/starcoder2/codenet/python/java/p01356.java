
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        if (a == 1 && b == 1) {
            if ((p + q) * n <= m) {
                System.out.println(m - (p + q) * n);
            } else {
                int k = m / (p + q);
                System.out.println(Math.min(m - k * (p + q), (k + 1) * (p + q) - m));
            }
        } else {
            int ans = m;
            for (int i = Math.min(n - 1, 40); i >= 0; i--) {
                int f = p * (int) Math.pow(a, i) + q * (int) Math.pow(b, i);
                if (m < f) {
                    ans = Math.min(ans, f - m);
                } else {
                    m -= f;
                }
                ans = Math.min(ans, m);
            }
            System.out.println(ans);
        }
    }
}
```

## 2. 1000000007

### 2.1. Description

Given a number $n$, find the number of ways to write $n$ as a sum of $1$ and $2$.

### 2.2. Input

The first line contains a single integer $n$ ($1 \le n \le 10^9$).

### 2.3. Output

Print the number of ways to write $n$ as a sum of $1$ and $2$.

### 2.4. Sample

| Input | Output |
| ----- | ------ |
| 3     | 2      |
| 4     | 4      |

### 2.5. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i - 1 >= 0) {
                dp[i] += dp[i - 1];
            }
            if (i - 2 >= 0) {
                dp[i] += dp[i - 2];
            }
            dp[i] %= 1000000007;
        }
        System.out.println(dp[n]);
    }
}
```

## 3. 1000000007

### 3.1. Description

Given a number $n$, find the number of ways to write $n$ as a sum of $1$, $2$ and $3$.

### 3.2. Input

The first line contains a single integer $n$ ($1 \le n \le 10^9$).

### 3.3. Output

Print the number of ways to write $n$ as a sum of $1$, $2$ and $3$.

### 3.4. Sample

| Input | Output |
| ----- | ------ |
| 3     | 4      |
| 4     | 7      |

### 3.5. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i - 1 >= 0) {
                dp[i] += dp[i - 1];
            }
            if (i - 2 >= 0) {
                dp[i] += dp[i - 2];
            }
            if (i - 3 >= 0) {
                dp[i] += dp[i - 3];
            }
            dp[i] %= 1000000007;
        }
        System.out.println(dp[n]);
    }
}
```

## 4. 1000000007

### 4.1. Description

Given a number $n$, find the number of ways to write $n$ as a sum of $1$, $2$, $3$ and $4$.

### 4.2. Input

The first line contains a single integer $n$ ($1 \le n \le 10^9$).

### 4.3. Output

Print the number of ways to write $n$ as a sum of $1$, $2$, $3$ and $4$.

### 4.4. Sample

| Input | Output |
| ----- | ------ |
| 3     | 7      |
| 4     | 13     |

### 4.5. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i - 1 >= 0) {
                dp[i] += dp[i - 1];
            }
            if (i - 2 >= 0) {
                dp[i] += dp[i - 2];
            }
            if (i - 3 >= 0) {
                dp[i] += dp[i - 3];
            }
            if (i - 4 >= 0) {
                dp[i] += dp[i - 4];
            }
            dp[i] %= 1000000007;
        }
        System.out.println(dp[n]);
    }
}
```

## 5. 1000000007

### 5.1. Description

Given a number $n$, find the number of ways to write $n$ as a sum of $1$, $2$, $3$, $4$ and $5$.

### 5.2. Input

The first line contains a single integer $n$ ($1 \le n \le 10^9$).

### 5.3. Output

Print the number of ways to write $n$ as a sum of $1$, $2$, $3$, $4$ and $5$.

### 5.4. Sample

| Input | Output |
| ----- | ------ |
| 3     | 13     |
| 4     | 25     |

### 5.5. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i - 1 >= 0) {
                dp[i] += dp[i - 1];
            }
            if (i - 2 >= 0) {
                dp[i] += dp[i - 2];
            }
            if (i - 3 >= 0) {
                dp[i] += dp[i - 3];
            }
            if (i - 4 >= 0
