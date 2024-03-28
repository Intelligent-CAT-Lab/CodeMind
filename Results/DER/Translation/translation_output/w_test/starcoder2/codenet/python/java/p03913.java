

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();

        long answer = Long.MAX_VALUE;
        for (int K = 1; K < 50; K++) {
            long cost = F(N, A, K);
            answer = Math.min(answer, cost);
        }
        System.out.println(answer);
    }

    static long F(long N, long A, int K) {
        long n = (long) Math.pow(N, 1.0 / K);
        while ((n - 1) * Math.pow(n, K - 1) > N) {
            n--;
        }
        while (n * Math.pow(n + 1, K - 1) < N) {
            n++;
        }
        for (int y = 0; y < K; y++) {
            int x = K - y;
            if (Math.pow(n, x) * Math.pow(n + 1, y) >= N) {
                return A * (K - 1) + n * x + (n + 1) * y;
            }
        }
        return Long.MAX_VALUE;
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
import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N = int(read())

"""
æå¤§åçã¯1000000006
"""

print(N-1)
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(N - 1);
    }
}
```

## 11. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N = int(read())

"""
æå¤§åçã¯1000000006
"""

print(N-1)
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(N - 1);
    }
}
```

## 12. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N = int(read())

"""
æå¤§åçã¯1000000006
"""

print(N-1)
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(N - 1);
    }
}
```

## 13. 1000000007

Translate the following python code to java and enclose your solution
