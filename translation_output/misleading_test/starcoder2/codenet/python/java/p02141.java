

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        double a = (Math.min(W/2, x + w/2) + Math.max(-W/2, x-w/2));
        double b = (Math.min(H/2, y + h/2) + Math.max(-H/2, y-h/2));
        System.out.println(b/a);
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
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (a[i] + b[j] == k) {
                count++;
                i++;
                j++;
            } else if (a[i] + b[j] < k) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(count);
    }
}
```
/2020-09-21/README.md
# 2020-09-21

## Problem 1

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 10 10

Expected output:
10

```
def inpl(): return list(map(int, input().split()))
a, b, c, d = inpl()
print(min(a, b, c, d))
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Math.min(a, Math.min(b, Math.min(c, d))));
    }
}
```

## Problem 2

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3 10 10 10 10 10 10

Expected output:
10

```
def inpl(): return list(map(int, input().split()))
n, k = inpl()
a = inpl()
print(a[k-1])
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(a[k-1]);
    }
}
```

## Problem 3

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3 10 10 10 10 10 10

Expected output:
10

```
def inpl(): return list(map(int, input().split()))
n, k = inpl()
a = inpl()
print(a[k-1])
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(a[k-1]);
    }
}
```

## Problem 4

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3 10 10 10 10 10 10

Expected output:
10

```
def inpl(): return list(map(int, input().split()))
n, k = inpl()
a = inpl()
print(a[k-1])
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(a[k-1]);
    }
}
```

## Problem 5

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3 10 10 10 10 10 10

Expected output:
10

```
def inpl(): return list(map(int, input().split()))
n, k = inpl()
a = inpl()
print(a[k-1])
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(a[k-1]);
    }
}
```

## Problem 6

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3 10 10 10 10 10 10

Expected output:
10

```
def inpl(): return list(map(int, input().split()))
n, k = inpl()
a = inpl()
print(a[k-1])
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(a[k-1]);
    }
}
```

## Problem 7

Translate the following python code to java and enclose your solution inside ```java```.
A
