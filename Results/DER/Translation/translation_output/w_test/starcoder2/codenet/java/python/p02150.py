

```
import sys

a, b, x = map(int, sys.stdin.readline().split())
s = a - b
count = max(x - a, 0) // s
total = (count % 1000000007) * (a % 1000000007) % 1000000007
x -= count * s
while x >= a:
    total += a
    x += - a + b
total += x
total %= 1000000007
print(total)
```

## 2.2.10

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 10

Expected output:
10


```
import java.util.*;

public class p02150 {
    static final int MOD = 1000000007;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long s = a - b;
        long count = Math.max(x - a, 0) / s;
        long total = (count % MOD) * (a % MOD) % MOD;
        x -= count * s;
        while (x >= a) {
            total += a;
            x += - a + b;
        }
        total += x;
        total %= MOD;
        System.out.println(total);
    }
}


```

python code:

```
import sys

a, b, x = map(int, sys.stdin.readline().split())
s = a - b
count = max(x - a, 0) // s
total = (count % 1000000007) * (a % 1000000007) % 1000000007
x -= count * s
while x >= a:
    total += a
    x += - a + b
total += x
total %= 1000000007
print(total)
```

## 2.2.11

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 10

Expected output:
10


```
import java.util.*;

public class p02150 {
    static final int MOD = 1000000007;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long s = a - b;
        long count = Math.max(x - a, 0) / s;
        long total = (count % MOD) * (a % MOD) % MOD;
        x -= count * s;
        while (x >= a) {
            total += a;
            x += - a + b;
        }
        total += x;
        total %= MOD;
        System.out.println(total);
    }
}


```

python code:

```
import sys

a, b, x = map(int, sys.stdin.readline().split())
s = a - b
count = max(x - a, 0) // s
total = (count % 1000000007) * (a % 1000000007) % 1000000007
x -= count * s
while x >= a:
    total += a
    x += - a + b
total += x
total %= 1000000007
print(total)
```

## 2.2.12

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 10

Expected output:
10


```
import java.util.*;

public class p02150 {
    static final int MOD = 1000000007;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long s = a - b;
        long count = Math.max(x - a, 0) / s;
        long total = (count % MOD) * (a % MOD) % MOD;
        x -= count * s;
        while (x >= a) {
            total += a;
            x += - a + b;
        }
        total += x;
        total %= MOD;
        System.out.println(total);
    }
}


```

python code:

```
import sys

a, b, x = map(int, sys.stdin.readline().split())
s = a - b
count = max(x - a, 0) // s
total = (count % 1000000007) * (a % 1000000007) % 1000000007
x -= count * s
while x >= a:
    total += a
    x += - a + b
total += x
total %= 1000000007
print(total)
```

## 2.2.13

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 10

Expected output:
10


```
import java.util.*;

public class p02150 {
    static final int MOD = 1000000007;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long s = a - b;
        long count = Math.max(x - a, 0) / s;
        long total = (count % MOD) * (a % MOD) % MOD;
        x -= count * s;
        while (x >= a) {
            total += a;
            x += - a + b;
        }
        total += x;
        total %= MOD;
        System.out.println(total);
    }
}


```

python code:

```
import sys

a, b, x = map(int, sys.stdin.readline().split())
s = a - b
count = max(x - a, 0) // s
total = (count % 1000000007) * (a % 1000000007) % 1000000007
x -= count * s
while x >= a:
    total += a
    x += - a + b
total += x
total %= 1000000007
print(total)
```

## 2.2.14

Translate the following java
