

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Now = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            int Next = alpha.indexOf(s);
            if (Now < Next) {
                continue;
            } else {
                ans++;
            }
            Now = Next;
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
print(1000000007)
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
print(1000000007)
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int len = A[i] + A[j] + A[k];
                    int ma = Math.max(A[i], Math.max(A[j], A[k]));
                    int rest = len - ma;
                    if (ma < rest) {
                        ans = Math.max(ans, len);
                    }
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
print(1000000007)
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
print(1000000007)
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```
/2020/01/01/README.md
# 2020/01/01

## 1. Triangle

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3
2 3 4

Expected output:
6

```
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            len = A[i] + A[j] + A[k]
            ma = max(A[i], max(A[j], A[k]))
            rest = len - ma
            if ma < rest:
                ans = max(ans, len)
print(ans)/2020/01/02/README.md
# 2020/01/02

## 1. Triangle

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3
2 3 4

Expected output:
6

```
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            len = A[i] + A[j] + A[k]
            ma = max(A[i], max(A[j], A[k]))
            rest = len - ma
            if ma < rest:
                ans = max(ans, len)
print(ans)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int len = A[i] + A[j] + A[k];
                    int ma = Math.max(A[i], Math.max(A[j], A[k]));
                    int rest = len - ma;
                    if (ma < rest) {
                        ans = Math.max(ans, len);
                    }
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
print(1000000007)
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
print(1000000007)
```

java code:

```java
public class Main {
    public static
