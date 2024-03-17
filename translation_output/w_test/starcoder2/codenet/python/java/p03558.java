
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Deque<int[]> q = new ArrayDeque<>();
        Map<Integer, Integer> m = new HashMap<>();
        q.add(new int[]{1, 1});
        while (!q.isEmpty()) {
            int[] t = q.pollFirst();
            int n = t[0], s = t[1];
            if (m.containsKey(n)) continue;
            m.put(n, s);
            q.addFirst(new int[]{n * 10 % K, s});
            q.add(new int[]{(n + 1) % K, s + 1});
        }
        System.out.println(m.get(0));
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
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        int ans = 0;
        for (int i = 0; i < n; i++) ans += a[i] * b[n - i - 1];
        System.out.println(ans);
    }
}
```
/2019-09-16/README.md
# 2019-09-16

## Problem 1

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
15
```

```
n = int(input())
a = list(map(int, input().split()))
print(sum(a))
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) ans += a[i];
        System.out.println(ans);
    }
}
```

## Problem 2

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
5 4 3 2 1
```

Expected output:
```
50
```

```
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
a.sort()
b.sort(reverse=True)
ans = 0
for i in range(n):
    ans += a[i] * b[i]
print(ans)  }
}
```
/2019-09-23/README.md
# 2019-09-23

## Problem 1

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
15
```

```
n = int(input())
a = list(map(int, input().split()))
print(sum(a))
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) ans += a[i];
        System.out.println(ans);
    }
}
```

## Problem 2

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
5 4 3 2 1
```

Expected output:
```
50
```

```
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
a.sort()
b.sort(reverse=True)
ans = 0
for i in range(n):
    ans += a[i] * b[i]
print(ans)
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        int ans = 0;
        for (int i = 0; i < n; i++) ans += a[i] * b[n - i - 1];
        System.out.println(ans);
    }
}
```

## Problem 3

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
120
```

```
n = int(input())
a = list(map(int, input().split()))
ans = 1
for i in range(n):
    ans *= a[i]
print(ans)
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ans = 1;
        for (int i = 0; i < n; i++) ans *= a[i];
        System.out.println(ans);
    }
}
```

## Problem 4

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
120
```

```
n = int(input())
a = list(map(int, input().split()))
ans = 1
for i in range(n):
    ans *= a[i]
print(ans)
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ans = 1;
        for (int i = 0; i < n; i++) ans *= a[i];
        System.out.println(ans);
    }
}
```
