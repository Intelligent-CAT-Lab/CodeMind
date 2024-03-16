
```

x, k, d = map(int, input().split())

absX = abs(x)
if absX // d >= k:
    ans = absX - k * d
else:
    sho = absX // d
    amari = absX % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)

```

## 2585

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p02585 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        scan.close();

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 == 1) {
                    ans += i * 100 + j;
                } else {
                    ans += i * 100 + 100 - j + 1;
                }
            }
        }

        System.out.println(ans);
    }
}

```

python code:
```

n, m = map(int, input().split())

ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if i % 2 == 1:
            ans += i * 100 + j
        else:
            ans += i * 100 + 100 - j + 1

print(ans)

```

## 2586

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p02586 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.close();

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                ans += i;
            }
        }

        System.out.println(ans);
    }
}

```

python code:
```

n = int(input())

ans = 0
for i in range(1, n + 1):
    if i % 3 == 0 or i % 5 == 0:
        ans += i

print(ans)

```

## 2587

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p02587 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());
        int d = Integer.parseInt(scan.next());
        int e = Integer.parseInt(scan.next());
        scan.close();

        int sum = a + b + c + d + e;
        int avg = sum / 5;
        System.out.println(avg);
        System.out.println(sum - avg * 5);
    }
}

```

python code:
```

a, b, c, d, e = map(int, input().split())

sum = a + b + c + d + e
avg = sum // 5
print(avg)
print(sum - avg * 5)

```

## 2588

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p02588 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        scan.close();

        System.out.println(a * (b % 10));
        System.out.println(a * (b / 10 % 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}

```

python code:
```

a, b = map(int, input().split())

print(a * (b % 10))
print(a * (b // 10 % 10))
print(a * (b // 100))
print(a * b)

```

## 2589

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p02589 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        scan.close();

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                ans += i * j;
            }
        }

        System.out.println(ans);
    }
}

```

python code:
```

n, m = map(int, input().split())

ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        ans += i * j

print(ans)

```

## 2590

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p02590 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.close();

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                ans += i;
            }
        }

        System.out.println(ans);
    }
}

```

python code:
```

n = int(input())

ans = 0
for i in range(1, n + 1):
    if i % 2 == 1:
        ans += i

print(ans)

```

## 2591

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p02591 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.close();

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans += i;
            }
        }

        System.out.println(ans);
    }
}

```

python code:
```

n = int(input())

ans = 0
for i in range(1, n + 1):
    if i % 2 == 0:
        ans += i

print(ans)

```

## 2592

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;
