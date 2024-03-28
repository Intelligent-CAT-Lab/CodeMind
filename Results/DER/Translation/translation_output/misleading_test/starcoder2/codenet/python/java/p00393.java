
```java
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] pow = new int[N + 1];
        int[] dp = new int[N + 1];
        pow[0] = 1;
        for (int i = 1; i <= N; i++) {
            pow[i] = pow[i - 1] * 2;
            pow[i] %= MOD;
        }
        dp[0] = 1;
        for (int i = 1; i <= M; i++) {
            dp[i] = pow[i];
        }
        dp[M] -= 1;
        for (int i = M + 1; i <= N; i++) {
            dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 1 - M]);
            dp[i] %= MOD;
        }
        System.out.println((pow[N] - dp[N] + MOD) % MOD);
    }
}
```

## 2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006

```
MOD = 1000000007

print(MOD - 1)
```

java code:
```java
public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        System.out.println(MOD - 1);
    }
}
```

## 3. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006

```
MOD = 1000000007

print(MOD - 1)
```

java code:
```java
public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        System.out.println(MOD - 1);
    }
}
```

## 4. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006

```
MOD = 1000000007

print(MOD - 1)
```

java code:
```java
public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        System.out.println(MOD - 1);
    }
}
```

## 5. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006

```
MOD = 1000000007

print(MOD - 1)
```

java code:
```java
public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        System.out.println(MOD - 1);
    }
}
```

## 6. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006

```
MOD = 1000000007

print(MOD - 1)
```

java code:
```java
public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        System.out.println(MOD - 1);
    }
}
```

## 7. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006

```
MOD = 1000000007

print(MOD - 1)
```

java code:
```java
public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        System.out.println(MOD - 1);
    }
}
```

## 8. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006

```
MOD = 1000000007

print(MOD - 1)
```

java code:
```java
public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        System.out.println(MOD - 1);
    }
}
```

## 9. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006

```
MOD = 1000000007

print(MOD - 1)
```

java code:
```java
public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        System.out.println(MOD - 1);
    }
}
```

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006

```
MOD = 1000000007

print(MOD - 1)
```

java code:
```java
public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        System.out.println(MOD - 1);
