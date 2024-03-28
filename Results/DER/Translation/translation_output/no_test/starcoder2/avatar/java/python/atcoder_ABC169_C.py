
```
a, b = map(float, input().split())
c = int(a * b * 100)
print(c // 100)
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                long cnt = 0;
                while (n % i == 0) {
                    cnt++;
                    n /= i;
                }
                long tmp = 0;
                while (cnt > 0) {
                    tmp++;
                    cnt -= tmp;
                }
                ans += tmp;
            }
        }
        if (n != 1) {
            ans++;
        }
        System.out.println(ans);
    }
}
```

python code:
```
n = int(input())
ans = 0
for i in range(2, int(n ** 0.5) + 1):
    if n % i == 0:
        cnt = 0
        while n % i == 0:
            cnt += 1
            n //= i
        tmp = 0
        while cnt > 0:
            tmp += 1
            cnt -= tmp
        ans += tmp
if n != 1:
    ans += 1
print(ans)
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int ans = b[n / 2] - a[n / 2 - 1];
        if (n % 2 == 0) {
            ans = Math.min(ans, b[n / 2 - 1] - a[n / 2 - 1]);
        }
        System.out.println(ans);
    }
}
```

python code:
```
n = int(input())
a = []
b = []
for i in range(n):
    x, y = map(int, input().split())
    a.append(x)
    b.append(y)
a.sort()
b.sort()
ans = b[n // 2] - a[n // 2 - 1]
if n % 2 == 0:
    ans = min(ans, b[n // 2 - 1] - a[n // 2 - 1])
print(ans)
```
/README.md
# atcoder-java-to-python

## 1.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        long c = (long) Math.round(b * 100);
        long d = a * c;
        System.out.println(d / 100);
    }
}
```

python code:
```
a, b = map(float, input().split())
c = int(a * b * 100)
print(c // 100)
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                long cnt = 0;
                while (n % i == 0) {
                    cnt++;
                    n /= i;
                }
                long tmp = 0;
                while (cnt > 0) {
                    tmp++;
                    cnt -= tmp;
                }
                ans += tmp;
            }
        }
        if (n != 1) {
            ans++;
        }
        System.out.println(ans);
    }
}
```

python code:
```
n = int(input())
ans = 0
for i in range(2, int(n ** 0.5) + 1):
    if n % i == 0:
        cnt = 0
        while n % i == 0:
            cnt += 1
            n //= i
        tmp = 0
        while cnt > 0:
            tmp += 1
            cnt -= tmp
        ans += tmp
if n != 1:
    ans += 1
print(ans)
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int ans = b[n / 2] - a[n / 2 - 1];
        if (n % 2 == 0) {
            ans = Math.min(ans, b[n / 2 - 1] - a[n / 2 - 1]);
        }
        System.out.println(ans);
    }
}
```

python code:
```
n = int(input())
a = []
b = []
for i in range(n):
    x, y = map(int, input().split())
    a.append(x)
    b.append(y)
a.sort()
b.sort()
ans = b[n // 2] - a[n // 2 - 1]
if n % 2 == 0:
    ans = min(ans, b[n // 2 - 1] - a[n // 2 - 1])
print(ans)
```

## 4.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class atcoder_ABC169_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int mod = 998244353;
        long[][] dp = new long[n + 1][k + 1];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i + 1][j] += dp[i][j] * 2;
                dp[i + 1][j] %= mod;
                if (j + a[i] <= k) {
                    dp[i + 1][j + a[i]] += dp[i
