
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();
        int cnt = 0;
        for (int r = 0; r <= n / R; r++) {
            for (int g = 0; g <= (n - r * R) / G; g++) {
                int b = (n - r * R - g * G) / B;
                if (r * R + g * G + b * B == n) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
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
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
```
/2019-09-16/README.md
# 2019-09-16

## 1. 10817번

https://www.acmicpc.net/problem/10817

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
2


```
a, b, c = map(int, input().split())
if a > b:
    a, b = b, a
if b > c:
    b, c = c, b
if a > b:
    a, b = b, a
print(b)
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
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b > c) {
            int tmp = b;
            b = c;
            c = tmp;
        }
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println(b);
    }
}
```

## 2. 2750번

https://www.acmicpc.net/problem/2750

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
5
4
3
2
1

Expected output:
1
2
3
4
5


```
n = int(input())
a = []
for _ in range(n):
    a.append(int(input()))
for i in range(n):
    for j in range(i+1, n):
        if a[i] > a[j]:
            a[i], a[j] = a[j], a[i]
for x in a:
    print(x)
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
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
```

## 3. 2751번

https://www.acmicpc.net/problem/2751

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
5
4
3
2
1

Expected output:
1
2
3
4
5


```
n = int(input())
a = []
for _ in range(n):
    a.append(int(input()))
a.sort()
for x in a:
    print(x)
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
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
```

## 4. 10989번

https://www.acmicpc.net/problem/10989

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
5
4
3
2
1

Expected output:
1
2
3
4
5


```
n = int(input())
a = [0] * 10001
for _ in range(n):
    a[int(input())] += 1
for i in range(10001):
    for _ in range(a[i]):
        print(i)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[10001];
        for (int i = 0; i < n; i++) {
            a[sc.nextInt()]++;
        }
        for (int i = 0; i < 10001; i++) {
            for (int j = 0; j < a[i]; j++) {
                System.out.println(i);
            }
        }
    }
}
```

## 5. 10989번

https://www.acmicpc.net/problem/10989

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
5
4
3
2
1

Expected output:
1
2
3
4
5


```
n = int(input())
a = [0] * 10001
for _ in range(n):
    a[int(input())] += 1
for i in range(10001):
    for _ in range(a[i]):
        print(i)
```
