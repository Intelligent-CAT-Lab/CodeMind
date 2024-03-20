

```python
MOD = 1000000007
def f(n):
    if n <= 2:
        return n
    res = f(n//2) + f((n-1)//2) + f((n+1)//2)
    res %= MOD
    return res

n = int(input())
print(f(n+1))
```

## 03850

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10

```
import java.util.Scanner;

public class p03850 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res++;
            }
        }
        System.out.println(res);
    }
}

```

python code:

```python
n = int(input())
res = 0
for i in range(1, n+1):
    if n % i == 0:
        res += 1
print(res)
```

## 03851

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10

```
import java.util.Scanner;

public class p03851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res += i;
            }
        }
        System.out.println(res);
    }
}

```

python code:

```python
n = int(input())
res = 0
for i in range(1, n+1):
    if n % i == 0:
        res += i
print(res)
```

## 03852

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10

```
import java.util.Scanner;

public class p03852 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res += i * i;
            }
        }
        System.out.println(res);
    }
}

```

python code:

```python
n = int(input())
res = 0
for i in range(1, n+1):
    if n % i == 0:
        res += i * i
print(res)
```

## 03853

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10

```
import java.util.Scanner;

public class p03853 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res += i * i * i;
            }
        }
        System.out.println(res);
    }
}

```

python code:

```python
n = int(input())
res = 0
for i in range(1, n+1):
    if n % i == 0:
        res += i * i * i
print(res)
```

## 03854

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10

```
import java.util.Scanner;

public class p03854 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res += i * i * i * i;
            }
        }
        System.out.println(res);
    }
}

```

python code:

```python
n = int(input())
res = 0
for i in range(1, n+1):
    if n % i == 0:
        res += i * i * i * i
print(res)
```

## 03855

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10

```
import java.util.Scanner;

public class p03855 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res += i * i * i * i * i;
            }
        }
        System.out.println(res);
    }
}

```

python code:

```python
n = int(input())
res = 0
for i in range(1, n+1):
    if n % i == 0:
        res += i * i * i * i * i
print(res)
```

## 03856

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10

```
import java.util.Scanner;

public class p03856 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res += i * i * i * i * i * i;
            }
        }
        System.out.println(res);
    }
}

```

python code:

```python
n = int(input())
res = 0
for i in range(1, n+1):
    if n % i == 0:
        res += i * i * i * i * i * i
print(res)
```

## 03857

Translate the following java code to python and enclose your solution inside ```python```.
A sample test
