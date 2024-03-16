
```python
x = int(input())
if x == 0:
    print(1)
else:
    print(0)
```

## 2.
Translate the following java code to python and enclose your solution inside ```python```:
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
a, b, c, d = map(int, input().split())
print(max(a * c, a * d) + max(b * c, b * d))
```

## 3.
Translate the following java code to python and enclose your solution inside ```python```:
```
public class atcoder_ABC178_C {
    public static void main(String[] args) {
        long n = new java.util.Scanner(System.in).nextLong();
        long mod = 1000000007;
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans = (ans * 10) % mod;
        }
        ans = (ans - 2) % mod;
        for (int i = 0; i < n; i++) {
            ans = (ans * 8) % mod;
        }
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
    ans = (ans * 10) % mod
ans = (ans - 2) % mod
for i in range(n):
    ans = (ans * 8) % mod
print(ans)
```

## 4.
Translate the following java code to python and enclose your solution inside ```python```:
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
/README.md
# atcoder-java-to-python

## 1.
Translate the following java code to python and enclose your solution inside ```python```:
```
public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int x = new java.util.Scanner(System.in).nextInt();
        if (x == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
```

python code:
```python
x = int(input())
if x == 0:
    print(1)
else:
    print(0)
```

## 2.
Translate the following java code to python and enclose your solution inside ```python```:
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
a, b, c, d = map(int, input().split())
print(max(a * c, a * d) + max(b * c, b * d))
```

## 3.
Translate the following java code to python and enclose your solution inside ```python```:
```
public class atcoder_ABC178_C {
    public static void main(String[] args) {
        long n = new java.util.Scanner(System.in).nextLong();
        long mod = 1000000007;
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans = (ans * 10) % mod;
        }
        ans = (ans - 2) % mod;
        for (int i = 0; i < n; i++) {
            ans = (ans * 8) % mod;
        }
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
    ans = (ans * 10) % mod
ans = (ans - 2) % mod
for i in range(n):
    ans = (ans * 8) % mod
print(ans)
```

## 4.
Translate the following java code to python and enclose your solution inside ```python```:
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
Translate the following java code to python and enclose your solution inside ```python```:
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
                ans = Math.max(ans, Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[
