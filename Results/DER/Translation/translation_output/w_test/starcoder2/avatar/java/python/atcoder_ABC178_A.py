

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
1 2 3

Expected output:
6


```
public class atcoder_ABC178_B {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        System.out.println(Math.max(a * c, Math.max(a * d, Math.max(b * c, b * d))));
    }
}
```

python code:

```python
a, b, c, d = map(int, input().split())
print(max(a * c, a * d, b * c, b * d))
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6


```
public class atcoder_ABC178_C {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n = sc.nextLong();
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
1 2 3

Expected output:
6


```
public class atcoder_ABC178_D {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int s = sc.nextInt();
        int mod = 1000000007;
        int[] dp = new int[s + 1];
        dp[0] = 1;
        for (int i = 3; i <= s; i++) {
            for (int j = 3; j <= i; j++) {
                dp[i] = (dp[i] + dp[i - j]) % mod;
            }
        }
        System.out.println(dp[s]);
    }
}
```

python code:

```python
s = int(input())
mod = 1000000007
dp = [0] * (s + 1)
dp[0] = 1
for i in range(3, s + 1):
    for j in range(3, i + 1):
        dp[i] = (dp[i] + dp[i - j]) % mod
print(dp[s])
```

## 5.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6


```
public class atcoder_ABC178_E {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
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
1 2 3

Expected output:
6


```
public class atcoder_ABC178_F {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
        }
        Arrays.sort(c);
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = a[i] + b[i];
        }
        Arrays.sort(d);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int idx = Arrays.binarySearch(d, -c[i]);
            if (idx < 0) {
                idx = -idx - 1;
            }
            ans = Math.max(ans, i + n - idx);
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
for i in range(n):
    c[i] = a[i] - b[i]
c.sort()
d = [0] * n
for i in range(n):
    d[i] = a[i] + b[i]
d.sort()
ans = 0
for i in range(n):
    idx = bisect.bisect_left(d, -c[i])
    ans = max(ans, i + n - idx)
print(ans)
```

## 7.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6


```
public class atcoder_ABC178_G {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for
