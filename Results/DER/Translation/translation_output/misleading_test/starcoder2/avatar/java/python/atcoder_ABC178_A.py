
```python
x = int(input())
if x == 0:
    print(1)
else:
    print(0)
```

## 2.
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
10000

```
public class atcoder_ABC178_B {
    public static void main(String[] args) {
        long a = new java.util.Scanner(System.in).nextLong();
        long b = new java.util.Scanner(System.in).nextLong();
        long c = new java.util.Scanner(System.in).nextLong();
        long d = new java.util.Scanner(System.in).nextLong();
        System.out.println(Math.max(a * c, a * d) + Math.max(b * c, b * d));
    }
}
```

python code:
```python
a = int(input())
b = int(input())
c = int(input())
d = int(input())
print(max(a * c, a * d) + max(b * c, b * d))
```

## 3.
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
10000

```
public class atcoder_ABC178_C {
    public static void main(String[] args) {
        long n = new java.util.Scanner(System.in).nextLong();
        long mod = 1000000007;
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans = ans * 10 % mod;
        }
        ans = (ans - 2 * n + mod) % mod;
        System.out.println(ans);
    }
}
```

python code:
```python
n = int(input())
mod = 1000000007
ans = 1
for i in range(n):
    ans = ans * 10 % mod
ans = (ans - 2 * n + mod) % mod
print(ans)
```

## 4.
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
10000

```
public class atcoder_ABC178_D {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int mod = 1000000007;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 3; j <= i; j++) {
                dp[i] = (dp[i] + dp[i - j]) % mod;
            }
        }
        System.out.println(dp[n]);
    }
}
```

python code:
```python
n = int(input())
mod = 1000000007
dp = [0] * (n + 1)
dp[0] = 1
for i in range(3, n + 1):
    for j in range(3, i + 1):
        dp[i] = (dp[i] + dp[i - j]) % mod
print(dp[n])
```

## 5.
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
10000

```
public class atcoder_ABC178_E {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = new java.util.Scanner(System.in).nextLong();
            y[i] = new java.util.Scanner(System.in).nextLong();
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long dx = x[i] - x[j];
                long dy = y[i] - y[j];
                ans = Math.max(ans, Math.abs(dx) + Math.abs(dy));
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```python
n = int(input())
x = [0] * n
y = [0] * n
for i in range(n):
    x[i], y[i] = map(int, input().split())
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        dx = x[i] - x[j]
        dy = y[i] - y[j]
        ans = max(ans, abs(dx) + abs(dy))
print(ans)
```

## 6.
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
10000

```
public class atcoder_ABC178_F {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = new java.util.Scanner(System.in).nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = new java.util.Scanner(System.in).nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
        }
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = a[i] + b[i];
        }
        Arrays.sort(c);
        Arrays.sort(d);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] != d[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = [0] * n
d = [0] * n
for i in range(n):
    c[i] = a[i] - b[i]
for i in range(n):
    d[i] = a[i] + b[i]
c.sort()
d.sort()
ans = 0
for i in range(n):
    if c[i] != d[i]:
        ans += 1
print(ans)
```

## 7.
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
10000

```
public class atcoder_ABC178_G {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = new java.
