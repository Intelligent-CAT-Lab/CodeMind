

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long MOD = 1000000007;
        long[] dp_T = new long[N+1];
        long[] dp_F = new long[N+1];
        dp_T[0] = 1;
        dp_F[0] = 0;
        for (int i = 0; i < M; i++) {
            long[] prev_T = dp_T;
            long[] prev_F = dp_F;
            dp_T = new long[N+1];
            dp_F = new long[N+1];
            // 11
            dp_T[0] += prev_T[1];
            dp_F[1] += prev_F[2];
            dp_T[1] += prev_F[1];
            // 10
            dp_T[0] += prev_F[1];
            dp_F[1] += prev_T[1];
            dp_T[1] += prev_T[1];
            dp_F[2] += prev_F[2];
            // 01
            dp_T[0] += prev_F[1];
            dp_F[1] += prev_T[1];
            dp_T[1] += prev_T[1];
            dp_F[2] += prev_F[2];
            // 00
            dp_T[0] += prev_T[1];
            dp_F[1] += prev_F[2];
            dp_T[1] += prev_T[1];
            dp_F[2] += prev_F[2];
            for (int j = 0; j < N+1; j++) {
                dp_T[j] %= MOD;
                dp_F[j] %= MOD;
            }
        }
        long answer = 0;
        for (int i = 0; i < N+1; i++) {
            answer += dp_T[i];
            answer %= MOD;
        }
        System.out.println(answer);
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
import sys
input = sys.stdin.readline

MOD = 10 ** 9 + 7

print(MOD)
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        long MOD = 1000000007;
        System.out.println(MOD);
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
import sys
input = sys.stdin.readline

MOD = 10 ** 9 + 7

print(MOD)
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        long MOD = 1000000007;
        System.out.println(MOD);
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
import sys
input = sys.stdin.readline

MOD = 10 ** 9 + 7

print(MOD)
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        long MOD = 1000000007;
        System.out.println(MOD);
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
import sys
input = sys.stdin.readline

MOD = 10 ** 9 + 7

print(MOD)
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        long MOD = 1000000007;
        System.out.println(MOD);
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
import sys
input = sys.stdin.readline

MOD = 10 ** 9 + 7

print(MOD)
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        long MOD = 1000000007;
        System.out.println(MOD);
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



