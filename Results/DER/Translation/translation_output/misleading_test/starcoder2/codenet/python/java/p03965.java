
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.length() / 2 - s.split("p").length + 1);
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
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}
```
/2020-09-21/README.md
# 2020-09-21

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
1 2 3 4 5
```

```
n=int(input())
a=list(map(int,input().split()))
print(*a)
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
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
```

## 2.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
5 4 3 2 1
```

```
n=int(input())
a=list(map(int,input().split()))
print(*a[::-1])
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
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
```

## 3.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
1 3 5
```

```
n=int(input())
a=list(map(int,input().split()))
print(*a[::2])
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
        for (int i = 0; i < n; i += 2) {
            System.out.print(a[i] + " ");
        }
    }
}
```

## 4.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
2 4
```

```
n=int(input())
a=list(map(int,input().split()))
print(*a[1::2])
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
        for (int i = 1; i < n; i += 2) {
            System.out.print(a[i] + " ");
        }
    }
}
```

## 5.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
1 3 5
2 4
```

```
n=int(input())
a=list(map(int,input().split()))
print(*a[::2])
print(*a[1::2])
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
        for (int i = 0; i < n; i += 2) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < n; i += 2) {
            System.out.print(a[i] + " ");
        }
    }
}
```

## 6.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
1 2 3 4 5
5 4 3 2 1
```

```
n=int(input())
a=list(map(int,input().split()))
print(*a)
print(*a[::-1])
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
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
```

## 7.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
```
5
1 2 3 4 5
```

Expected output:
```
1 2 3 4 5

