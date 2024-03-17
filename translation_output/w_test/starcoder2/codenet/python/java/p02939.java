

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] l = new int[S.length() + 1];
        l[1] = 1;
        if (S.charAt(0) == S.charAt(1)) {
            l[2] = 1;
        } else {
            l[2] = 2;
        }
        for (int i = 3; i < S.length() + 1; i++) {
            if (S.charAt(i - 1) != S.charAt(i - 2)) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = l[i - 3] + 2;
            }
        }
        System.out.println(l[S.length()]);
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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] l = new int[n];
        l[0] = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = 1;
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        System.out.println(max);
    }
}
```
/2019-09-16/README.md
# 2019-09-16

## Problem 1

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
1

```
n = int(input())
a = [int(x) for x in input().split()]

l = [0] * n
l[0] = 1

for i in range(1, n):
    if a[i] > a[i-1]:
        l[i] = l[i-1] + 1
    else:
        l[i] = 1

print(max(l))

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] l = new int[n];
        l[0] = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = 1;
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        System.out.println(max);
    }
}
```

## Problem 2

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
1

```
n = int(input())
a = [int(x) for x in input().split()]

l = [0] * n
l[0] = 1

for i in range(1, n):
    if a[i] > a[i-1]:
        l[i] = l[i-1] + 1
    else:
        l[i] = 1

print(max(l))

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] l = new int[n];
        l[0] = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = 1;
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        System.out.println(max);
    }
}
```

## Problem 3

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
1

```
n = int(input())
a = [int(x) for x in input().split()]

l = [0] * n
l[0] = 1

for i in range(1, n):
    if a[i] > a[i-1]:
        l[i] = l[i-1] + 1
    else:
        l[i] = 1

print(max(l))

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] l = new int[n];
        l[0] = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = 1;
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        System.out.println(max);
    }
}
```

## Problem 4

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
1

```
n = int(input())
a = [int(x) for x in input().split()]

l = [0] * n
l[0] = 1

for i in range(1, n):
    if a[i] > a[i-1]:
        l[i] = l[i-1] + 1
    else:
        l[i] = 1

print(max(l))

```

java code:

```java
import java.util.Scanner;
