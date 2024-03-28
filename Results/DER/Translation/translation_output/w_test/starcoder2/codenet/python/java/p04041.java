

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int m = 1 << (X + Y + Z);
        int[] S = new int[m];
        int L = Math.max(X, Math.max(Y, Z));
        Set<Integer> ss = new HashSet<>();
        Set<Integer> tt = new HashSet<>();
        int Z0 = 1 << (Z - 1);
        int Y0 = 1 << (Z + Y - 1);
        int X0 = 1 << (X + Z + Y - 1);
        for (int i = 0; i < m; i++) {
            if ((i & Z0) != 0 && (i & Y0) != 0 && (i & X0) != 0) {
                ss.add(i);
            }
        }
        int MASK = (1 << (X + Y + Z)) - 1;
        int MOD = (int) 1e9 + 7;
        S[0] = 1;
        for (int i = 0; i < N; i++) {
            int[] T = new int[m];
            for (int s = 0; s < m; s++) {
                if (ss.contains(s)) {
                    continue;
                }
                int b = (s << 1) | 1;
                for (int k = 1; k <= L; k++) {
                    int t = (b << (k - 1)) & MASK;
                    T[t] = (T[t] + S[s]) % MOD;
                }
                for (int k = L + 1; k <= 10; k++) {
                    T[0] = (T[0] + S[s]) % MOD;
                }
            }
            S = T;
        }
        int ans = 0;
        for (int s = 0; s < m; s++) {
            if (ss.contains(s)) {
                continue;
            }
            ans = (ans + S[s]) % MOD;
        }
        ans = (int) ((Math.pow(10, N) + MOD - ans) % MOD);
        System.out.println(ans);
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
# 1000000007.py
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

## 11. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
# 1000000007.py
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

## 12. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
# 1000000007.py
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

## 13. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
# 1000000007.py
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

## 14. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
# 1000000007.py
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

## 15. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
# 1000000007.py
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

## 16. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
# 1000000007.py
print(10**9+7)
```

java code:

```java
public class Main {
    public
