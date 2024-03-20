
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int D = sc.nextInt();
        int MOD = 1000000007;

        int[] fact = new int[N+1];
        int[] fact_cum = new int[N+1];
        fact[0] = 1;
        fact_cum[0] = 0;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i-1] * i) % MOD;
            fact_cum[i] = (fact_cum[i-1] + fact[i]) % MOD;
        }

        int[] ap = new int[H+1];
        int[] ap_cum = new int[H+1];
        ap[0] = 1;
        ap_cum[0] = 1;

        for (int n = 1; n <= H; n++) {
            int x = ap_cum[n-1];
            if (n > D) {
                x -= ap_cum[n-D-1];
            }
            x *= fact_cum[N];
            x %= MOD;
            ap[n] = x;
            ap_cum[n] = (ap_cum[n-1] + x) % MOD;
        }

        int ans = ap[H];
        ans *= fact[N];
        ans %= MOD;
        ans *= pow(fact_cum[N], MOD-2, MOD);
        ans %= MOD;

        System.out.println(ans);
    }

    public static int pow(int a, int b, int mod) {
        if (b == 0) {
            return 1;
        }
        int res = pow(a, b/2, mod);
        res = (res * res) % mod;
        if (b % 2 == 1) {
            res = (res * a) % mod;
        }
        return res;
    }
}
```

## 2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(10**9+7)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 3. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(10**9+7)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 4. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(10**9+7)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 5. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(10**9+7)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 6. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(10**9+7)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 7. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(10**9+7)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 8. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(10**9+7)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 9. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(10**9+7)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
print(10**9+7)
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        System.out
