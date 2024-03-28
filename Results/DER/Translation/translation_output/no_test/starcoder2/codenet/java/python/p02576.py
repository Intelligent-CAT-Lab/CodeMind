
```python
n, x, t = map(int, input().split())
ans = 0
tako = 0
while n > tako:
    ans += t
    tako += x
print(ans)
```

## 02581

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, i, j, sum, min;
        m = sc.nextInt();
        n = sc.nextInt();
        sum = 0;
        min = 0;
        for (i = m; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    if (j == i) {
                        sum += i;
                        if (min == 0) {
                            min = i;
                        }
                    }
                }
            }
        }
        if (min == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
        sc.close();
    }
}
```

python code:
```python
m, n = map(int, input().split())
sum = 0
min = 0
for i in range(m, n+1):
    for j in range(1, i+1):
        if i % j == 0:
            if j == i:
                sum += i
                if min == 0:
                    min = i
if min == 0:
    print(-1)
else:
    print(sum)
    print(min)
```

## 02588

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a * (b % 10);
        d = a * (b / 10 % 10);
        e = a * (b / 100);
        f = a * b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        sc.close();
    }
}
```

python code:
```python
a, b = map(int, input().split())
c = a * (b % 10)
d = a * (b // 10 % 10)
e = a * (b // 100)
f = a * b
print(c)
print(d)
print(e)
print(f)
```

## 02675

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, r, i, j;
        String s;
        t = sc.nextInt();
        for (i = 0; i < t; i++) {
            r = sc.nextInt();
            s = sc.next();
            for (j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
```

python code:
```python
t = int(input())
for i in range(t):
    r, s = input().split()
    r = int(r)
    for j in range(len(s)):
        for k in range(r):
            print(s[j], end='')
    print()
```

## 02739

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        for (i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
        sc.close();
    }
}
```

python code:
```python
n = int(input())
for i in range(1, 10):
    print(n, '*', i, '=', n*i)
```

## 02741

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
```

python code:
```python
n = int(input())
for i in range(1, n+1):
    print(i)
```

## 02742

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        for (i = n; i >= 1; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
```

python code:
```python
n = int(input())
for i in range(n, 0, -1):
    print(i)
```

## 02753

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
```

python code:
```python
n = int(input())
if n % 4 == 0 and n % 100 != 0 or n % 400 == 0:
    print(1)
else:
    print(0)
```

## 02775

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, k, n, i, j;
        t = sc.nextInt();
        for (i = 0; i < t; i++) {
            k = sc.nextInt();
            n = sc.nextInt();
            int[][] arr = new int[k + 1][n + 1];
            for (j = 0; j <= n; j++) {
                arr[0][j] = j;
            }
            for (j = 1; j <= k; j++) {
                arr[j][1] = 1;
            }
            for (j = 1; j <= k; j++) {
                for (int l = 2; l <= n; l++) {
                    arr[j][l] = arr[j - 1][l] + arr[j][l
