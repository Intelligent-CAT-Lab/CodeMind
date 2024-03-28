

```python
import math

MOD = 1000000007

def prime_factorize(n):
    res = []
    for a in range(2, int(math.sqrt(n)) + 1):
        if n % a != 0:
            continue
        ex = 0
        while n % a == 0:
            ex += 1
            n //= a
        res.append({a: ex})
    if n != 1:
        res.append({n: 1})
    return res

n = int(input())
ex = [0] * 1001
for i in range(2, n + 1):
    pfs = prime_factorize(i)
    for pf in pfs:
        for k, v in pf.items():
            ex[k] += v

ans = 1
for i in range(2, n + 1):
    ans *= ex[i] + 1
    ans %= MOD

print(ans)
```
/content/posts/2020-01-01-p0000.md
---
title: "P0000"
date: 2020-01-01T00:00:00+09:00
draft: false
---

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:

Expected output:


```
import java.util.*;

public class p0000 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        System.out.println(n);
    }
}

```

python code:

```python
n = int(input())

print(n)
```
/content/posts/2020-01-01-p0001.md
---
title: "P0001"
date: 2020-01-01T00:00:00+09:00
draft: false
---

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6


```
import java.util.*;

public class p0001 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int c = sc.nextInt();

        System.out.println(a + b + c);
    }
}

```

python code:

```python
a, b, c = map(int, input().split())

print(a + b + c)
```


```
import java.util.*;

public class p0002 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int a = sc.nextInt();
        final int b = sc.nextInt();

        System.out.println(a * b);
    }
}

```

python code:

```python
a, b = map(int, input().split())

print(a * b)
```
/content/posts/2020-01-01-p0002.md
---
title: "P0002"
date: 2020-01-01T00:00:00+09:00
draft: false
---

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
2


```
import java.util.*;

public class p0002 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int a = sc.nextInt();
        final int b = sc.nextInt();

        System.out.println(a * b);
    }
}

```

python code:

```python
a, b = map(int, input().split())

print(a * b)
```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
2


```
import java.util.*;

public class p0002 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int a = sc.nextInt();
        final int b = sc.nextInt();

        System.out.println(a * b);
    }
}

```

python code:

```python
a, b = map(int, input().split())

print(a * b)
```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
2


```
import java.util.*;

public class p0002 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int a = sc.nextInt();
        final int b = sc.nextInt();

        System.out.println(a * b);
    }
}

```

python code:

```python
a, b = map(int, input().split())

print(a * b)
```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
2


```
import java.util.*;

public class p0002 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int a = sc.nextInt();
        final int b = sc.nextInt();

        System.out.println(a * b);
    }
}

```

python code:

```python
a, b = map(int, input().split())

print(a * b)
```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
2


```
import java.util.*;

public class p0002 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int a = sc.nextInt();
        final int b = sc.nextInt();

        System.out.println(a * b);
    }
}

```

python code:

```python
a, b = map(int, input().split())

print(a * b
