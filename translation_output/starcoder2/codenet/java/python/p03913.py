
```
import math

def solver(n, a):
    ans = n
    for m in range(2, 41):
        c = int(math.pow(n, 1.0 / m))
        for i in range(max(c - 2, 2), c + 3):
            if math.log(i) * (m - 1) > 40 * math.log(2):
                continue
            for j in range(m):
                res = a * (m - 1)
                res += j * i + (m - 1 - j) * (i + 1)
                den = pow(i, j) * pow(i + 1, m - 1 - j)
                res += (n + den - 1) / den
                ans = min(ans, res)
    print(ans)

n, a = map(int, input().split())
solver(n, a)
```

## 03914 - 
```
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class p03914 {
    public static void main(String[] args) {
        // long t = System.currentTimeMillis();
        new p03914().run();
        // System.err.println(System.currentTimeMillis() - t);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        solver(sc.nextLong(), sc.nextLong());
    }

    void solver(long n, long a) {
        long ans = n;
        for (int m = 2; m <= 40; ++m) {
            long c = (long) Math.pow(n, 1.0 / m);
            for (long i = Math.max(c - 2, 2); i <= c + 2; ++i) {
                if (Math.log(i) * (m - 1) > 40 * Math.log(2))
                    continue;
                for (int j = 0; j <= m - 1; ++j) {
                    long res = a * (m - 1);
                    res += j * i + (m - 1 - j) * (i + 1);
                    long den = pow(i, j) * pow(i + 1, m - 1 - j);
                    res += (n + den - 1) / den;
                    ans = Math.min(ans, res);
                }
            }
        }
        System.out.println(ans);
    }

    long pow(long a, long n) {
        long ret = 1;
        for (; n > 0; n >>= 1, a *= a) {
            if (n % 2 == 1) {
                ret *= a;
            }
        }
        return ret;
    }

    static void tr(Object... objects) {
        System.out.println(Arrays.deepToString(objects));
    }

}

```

python code:
```
import math

def solver(n, a):
    ans = n
    for m in range(2, 41):
        c = int(math.pow(n, 1.0 / m))
        for i in range(max(c - 2, 2), c + 3):
            if math.log(i) * (m - 1) > 40 * math.log(2):
                continue
            for j in range(m):
                res = a * (m - 1)
                res += j * i + (m - 1 - j) * (i + 1)
                den = pow(i, j) * pow(i + 1, m - 1 - j)
                res += (n + den - 1) / den
                ans = min(ans, res)
    print(ans)

n, a = map(int, input().split())
solver(n, a)
```

## 03915 - 
```
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class p03915 {
    public static void main(String[] args) {
        // long t = System.currentTimeMillis();
        new p03915().run();
        // System.err.println(System.currentTimeMillis() - t);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        solver(sc.nextLong(), sc.nextLong());
    }

    void solver(long n, long a) {
        long ans = n;
        for (int m = 2; m <= 40; ++m) {
            long c = (long) Math.pow(n, 1.0 / m);
            for (long i = Math.max(c - 2, 2); i <= c + 2; ++i) {
                if (Math.log(i) * (m - 1) > 40 * Math.log(2))
                    continue;
                for (int j = 0; j <= m - 1; ++j) {
                    long res = a * (m - 1);
                    res += j * i + (m - 1 - j) * (i + 1);
                    long den = pow(i, j) * pow(i + 1, m - 1 - j);
                    res += (n + den - 1) / den;
                    ans = Math.min(ans, res);
                }
            }
        }
        System.out.println(ans);
    }

    long pow(long a, long n) {
        long ret = 1;
        for (; n > 0; n >>= 1, a *= a) {
            if (n % 2 == 1) {
                ret *= a;
            }
        }
        return ret;
    }

    static void tr(Object... objects) {
        System.out.println(Arrays.deepToString(objects));
    }

}

```

python code:
```
import math

def solver(n, a):
    ans = n
    for m in range(2, 41):
        c = int(math.pow(n, 1.0 / m))
        for i in range(max(c - 2, 2), c + 3):
            if math.log(i) * (m - 1) > 40 * math.log(2):
                continue
            for j in range(
