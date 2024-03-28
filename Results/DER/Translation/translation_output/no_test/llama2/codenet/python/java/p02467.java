<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
from math import sqrt

def solve():
    n = int(input())

    print('{}: '.format(n), end='')
    print(*prime_factorization(n))

def prime_factorization(n):
    if n < 2:
        return [n]

    res = []
    lim = int(sqrt(n))

    for p in range(2, lim + 1):
        while n % p == 0:
            res.append(p)
            n //= p

    if n > 1:
        res.append(n)

    return res

if __name__ == '__main__':
    solve()
```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.printf("%d: ", n);
        for (int p : primeFactorization(n)) {
            System.out.printf("%d ", p);
        }
    }

    private static int[] primeFactorization(int n) {
        if (n < 2) {
            return new int[] { n };
        }

        int lim = (int) Math.sqrt(n);
        int[] res = new int[0];
        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res = append(res, p);
                n /= p;
            }
        }
        if (n > 1) {
            res = append(res, n);
        }
        return res;
    }

    private static int[] append(int[] res, int p) {
        int[] newRes = new int[res.length + 1];
        System.arraycopy(res, 0, newRes, 0, res.length);
        newRes[res.length] = p;
        return newRes;
    }
}
```

### 解説

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.printf("%d: ", n);
        for (int p : primeFactorization(n)) {
            System.out.printf("%d ", p);
        }
    }

    private static int[] primeFactorization(int n) {
        if (n < 2) {
            return new int[] { n };
        }

        int lim = (int) Math.sqrt(n);
        int[] res = new int[0];
        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res = append(res, p);
                n /= p;
            }
        }
        if (n > 1) {
            res = append(res, n);
        }
        return res;
    }

    private static int[] append(int[] res, int p) {
        int[] newRes = new int[res.length + 1];
        System.arraycopy(res, 0, newRes, 0, res.length);
        newRes[res.length] = p;
        return newRes;
    }
}
```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.printf("%d: ", n);
        for (int p : primeFactorization(n)) {
            System.out.printf("%d ", p);
        }
    }

    private static int[] primeFactorization(int n) {
        if (n < 2) {
            return new int[] { n };
        }

        int lim = (int) Math.sqrt(n);
        int[] res = new int[0];
        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res = append(res, p);
                n /= p;
            }
        }
        if (n > 1) {
            res = append(res, n);
        }
        return res;
    }

    private static int[] append(int[] res, int p) {
        int[] newRes = new int[res.length + 1];
        System.arraycopy(res, 0, newRes, 0, res.length);
        newRes[res.length] = p;
        return newRes;
    }
}
```

### 解説

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.printf("%d: ", n);
        for (int p : primeFactorization(n)) {
            System.out.printf("%d ", p);
        }
    }

    private static int[] primeFactorization(int n) {
        if (n < 2) {
            return new int[] { n };
        }

        int lim = (int) Math.sqrt(n);
        int[] res = new int[0];
        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res = append(res, p);
                n /= p;
            }
        }
        if (n > 1) {
            res = append(res, n);
        }
        return res;
    }

    private static int[] append(int[] res, int p) {
        int[] newRes = new int[res.length + 1];
        System.arraycopy(res, 0, newRes, 0, res.length);
        newRes[res.length] = p;
        return newRes;
    }
}
```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.printf("%d: ", n);
        for (int p : primeFactorization(n)) {
            System.out.printf("%d ", p);
        }
    }

    private static int[] primeFactorization(int n) {
        if (n < 2) {
            return new int[] { n };
        }

        int lim = (int) Math.sqrt(n);
        int[] res = new int[0];
        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res = append(res, p);
                n /= p;
            }
        }
        if (n > 1) {
            res = append(res, n);
        }
        return res;
    }

    private static int[] append(int[] res, int p) {
        int[] newRes = new int[res.length + 1];
        System.arraycopy(res, 0, newRes, 0, res.length);
        newRes[res.length] = p;
        return newRes;
    }
}
```

### 解説

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.printf("%d: ", n);
        for (int p : primeFactorization(n)) {
            System.out.printf("%d ", p);
        }
    }

    private static int[] primeFactorization(int n) {
        if (n < 2) {
            return new int[] { n };
        }

        int lim = (int) Math.sqrt(n);

