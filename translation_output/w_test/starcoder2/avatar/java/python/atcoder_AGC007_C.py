

```python
import math

N, d, x = map(int, input().split())

ans = 0
while N > 0.5:
    ans += d + x * (N - 0.5)
    d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
    x = (1.0 + (2.0 / N)) * x
    N -= 1

print(ans)
```

## 2.

The following code is a solution to the problem [ABC086A - Product](https://atcoder.jp/contests/abc086/tasks/abc086_a).

```
import java.util.Scanner;

class atcoder_ABC086_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a * b % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```

Translate the above code to python and enclose your solution inside ```python```.

python code:

```python
a, b = map(int, input().split())

if a * b % 2 == 0:
    print("Even")
else:
    print("Odd")
```

## 3.

The following code is a solution to the problem [ABC081A - Placing Marbles](https://atcoder.jp/contests/abc081/tasks/abc081_a).

```
import java.util.Scanner;

class atcoder_ABC081_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '1') {
                ++ans;
            }
        }

        System.out.println(ans);
    }
}
```

Translate the above code to python and enclose your solution inside ```python```.

python code:

```python
s = input()

ans = 0
for i in range(len(s)):
    if s[i] == '1':
        ans += 1

print(ans)
```

## 4.

The following code is a solution to the problem [ABC081B - Shift only](https://atcoder.jp/contests/abc081/tasks/abc081_b).

```
import java.util.Scanner;

class atcoder_ABC081_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scan.nextInt();
        }

        int ans = 0;
        while (true) {
            boolean ok = true;
            for (int i = 0; i < n; ++i) {
                if (a[i] % 2 == 1) {
                    ok = false;
                }
                a[i] /= 2;
            }
            if (!ok) {
                break;
            }
            ++ans;
        }

        System.out.println(ans);
    }
}
```

Translate the above code to python and enclose your solution inside ```python```.

python code:

```python
n = int(input())
a = list(map(int, input().split()))

ans = 0
while True:
    ok = True
    for i in range(n):
        if a[i] % 2 == 1:
            ok = False
        a[i] //= 2
    if not ok:
        break
    ans += 1

print(ans)
```

## 5.

The following code is a solution to the problem [ABC087B - Coins](https://atcoder.jp/contests/abc087/tasks/abc087_b).

```
import java.util.Scanner;

class atcoder_ABC087_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int x = scan.nextInt();

        int ans = 0;
        for (int i = 0; i <= a; ++i) {
            for (int j = 0; j <= b; ++j) {
                for (int k = 0; k <= c; ++k) {
                    if (500 * i + 100 * j + 50 * k == x) {
                        ++ans;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
```

Translate the above code to python and enclose your solution inside ```python```.

python code:

```python
a, b, c, x = map(int, input().split())

ans = 0
for i in range(a + 1):
    for j in range(b + 1):
        for k in range(c + 1):
            if 500 * i + 100 * j + 50 * k == x:
                ans += 1

print(ans)
```

## 6.

The following code is a solution to the problem [ABC083B - Some Sums](https://atcoder.jp/contests/abc083/tasks/abc083_b).

```
import java.util.Scanner;

class atcoder_ABC083_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        int ans = 0;
        for (int i = 1; i <= n; ++i) {
            int sum = 0;
            int x = i;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            if (a <= sum && sum <= b) {
                ans += i;
            }
        }

        System.out.println(ans);
    }
}
```

Translate the above code to python and enclose your solution inside ```python```.

python code:

```python
n, a, b = map(int, input().split())

ans = 0
for i in range(1, n + 1):
    sum = 0
    x = i
    while x > 0:
        sum += x % 10
        x //= 10
    if a <= sum and sum <= b:
        ans += i

print(ans)
```

## 7.

The following code is a solution to the problem [ABC088B - Card Game for Two](https://atcoder.jp/contests/abc088/tasks/abc088_b).

```
import java.util.Arrays;
import java.util.Scanner;

class atcoder_ABC088_B {
   
