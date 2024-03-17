

```python
import math

n, p = map(int, input().split())
if n == 1:
    print(p)
else:
    res = 1
    for i in range(2, int(math.pow(p, 1/n)) + 1):
        if p % math.pow(i, n) == 0:
            res = i
    print(res)
```

## p03195

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10


```
import java.util.*;

class p03195{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 == 1 && j % 2 == 1) res++;
                if (i % 2 == 0 && j % 2 == 0) res++;
            }
        }
        System.out.println(res);
    }
}

```

python code:

```python
n, m = map(int, input().split())
res = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if (i % 2 == 1 and j % 2 == 1) or (i % 2 == 0 and j % 2 == 0):
            res += 1
print(res)
```

## p03196

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10


```
import java.util.*;

class p03196{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 == 1 && j % 2 == 1) res++;
                if (i % 2 == 0 && j % 2 == 0) res++;
            }
        }
        System.out.println(res);
    }
}

```

python code:

```python
n, m = map(int, input().split())
res = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if (i % 2 == 1 and j % 2 == 1) or (i % 2 == 0 and j % 2 == 0):
            res += 1
print(res)
```

## p03197

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10


```
import java.util.*;

class p03197{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 == 1 && j % 2 == 1) res++;
                if (i % 2 == 0 && j % 2 == 0) res++;
            }
        }
        System.out.println(res);
    }
}

```

python code:

```python
n, m = map(int, input().split())
res = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if (i % 2 == 1 and j % 2 == 1) or (i % 2 == 0 and j % 2 == 0):
            res += 1
print(res)
```

## p03198

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10


```
import java.util.*;

class p03198{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 == 1 && j % 2 == 1) res++;
                if (i % 2 == 0 && j % 2 == 0) res++;
            }
        }
        System.out.println(res);
    }
}

```

python code:

```python
n, m = map(int, input().split())
res = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if (i % 2 == 1 and j % 2 == 1) or (i % 2 == 0 and j % 2 == 0):
            res += 1
print(res)
```

## p03199

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10


```
import java.util.*;

class p03199{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 == 1 && j % 2 == 1) res++;
                if (i % 2 == 0 && j % 2 == 0) res++;
            }
        }
        System.out.println(res);
    }
}

```

python code:

```python
n, m = map(int, input().split())
res = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if (i % 2 == 1 and j % 2 == 1) or (i % 2 == 0 and j % 2 == 0):
            res += 1
print(res)
```

## p03200

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10


```
import java.util.*;

class p03200{
    public static void main(String[] args) {
        Scanner sc = new Scanner
