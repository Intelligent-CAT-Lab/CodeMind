

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] remain = new int[2020];
        int now = 0;
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now += (s.charAt(i) - '0') * Math.pow(10, s.length() - i - 1, 2019);
            ans += remain[(int) (now % 2019)];
            remain[(int) (now % 2019)]++;
        }
        ans += remain[0];
        System.out.println(ans);
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
n = int(input())

ans = 0
for i in range(1, n+1):
    ans += i

print(ans%1000000007)

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans % 1000000007);
    }
}
```


```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
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
n = int(input())

ans = 0
for i in range(1, n+1):
    ans += i

print(ans%1000000007)

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans % 1000000007);
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
n = int(input())

ans = 0
for i in range(1, n+1):
    ans += i

print(ans%1000000007)

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans % 1000000007);
    }
}
```
/README.md
# 2020-2-Java-Translation

## 1. Inversion

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
0

```
n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(n):
    for j in range(i+1, n):
        if a[i] > a[j]:
            ans += 1

print(ans)
