
```java

```


```

java code:
```java

```

## 2.

```

```

java code:
```java

```

## 3.

```

```

java code:
```java

```

## 4.

```

```

java code:
```java

```

## 5.

```

```

java code:
```java

```

## 6.

```

```

java code:
```java

```

## 7.

```

```

java code:
```java

```

## 8.

```

```

java code:
```java

```

## 9.

```

```

java code:
```java

```

## 10.

```

```

java code:
```java

```
/README.md
# Python to Java

## 1.

```
N, K = map(int, input().split())
MOD = 10**9 + 7

p = q = 1
for i in range(N):
    p = p * (N+K-1-i) % MOD
    q = q * (i+1) % MOD

print(p * pow(q, MOD-2, MOD) % MOD)
/src/main/java/com/github/yukihane/python/to/java/Main.java
package com.github.yukihane.python.to.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        int p = 1;
        int q = 1;
        for (int i = 0; i < N; i++) {
            p = p * (N + K - 1 - i) % MOD;
            q = q * (i + 1) % MOD;
        }

        System.out.println(p * pow(q, MOD - 2, MOD) % MOD);
    }

    private static int pow(int a, int b, int mod) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return pow(a * a % mod, b / 2, mod);
        } else {
            return a * pow(a, b - 1, mod) % mod;
        }
    }
}

