

```python
def GCD(a, b):
    if a < b:
        temp = a
        a = b
        b = temp
    if a % b == 0:
        return b
    else:
        return GCD(b, a%b)

a, b = map(int, input().split())
print(GCD(a, b))
```

## 2.2.57

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
2550


```
import java.io.*;

class p02257 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(sum(n));
    }

    public static int sum (int n) {
        if (n == 1) return 1;
        else return n + sum(n-1);
    }
}
```

python code:

```python
def sum(n):
    if n == 1:
        return 1
    else:
        return n + sum(n-1)

n = int(input())
print(sum(n))
```

## 2.2.58

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
2500


```
import java.io.*;

class p02258 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(sum(n));
    }

    public static int sum (int n) {
        if (n == 1) return 1;
        else return n*n + sum(n-1);
    }
}
```

python code:

```python
def sum(n):
    if n == 1:
        return 1
    else:
        return n*n + sum(n-1)

n = int(input())
print(sum(n))
```

## 2.2.59

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100


```
import java.io.*;

class p02259 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(sum(n));
    }

    public static int sum (int n) {
        if (n == 1) return 1;
        else return n + sum(n-2);
    }
}
```

python code:

```python
def sum(n):
    if n == 1:
        return 1
    else:
        return n + sum(n-2)

n = int(input())
print(sum(n))
```

## 2.2.60

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
2500


```
import java.io.*;

class p02260 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(sum(n));
    }

    public static int sum (int n) {
        if (n == 1) return 1;
        else return n*n + sum(n-2);
    }
}
```

python code:

```python
def sum(n):
    if n == 1:
        return 1
    else:
        return n*n + sum(n-2)

n = int(input())
print(sum(n))
```

## 2.2.61

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100


```
import java.io.*;

class p02261 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(sum(n));
    }

    public static int sum (int n) {
        if (n == 1) return 1;
        else return n + sum(n/2);
    }
}
```

python code:

```python
def sum(n):
    if n == 1:
        return 1
    else:
        return n + sum(n/2)

n = int(input())
print(sum(n))
```

## 2.2.62

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
2500


```
import java.io.*;

class p02262 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(sum(n));
    }

    public static int sum (int n) {
        if (n == 1) return 1;
        else return n*n + sum(n/2);
    }
}
```

python code:

```python
def sum(n):
    if n == 1:
        return 1
    else:
        return n*n + sum(n/2)

n = int(input())
print(sum(n))
```

## 2.2.63

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100


```
import java.io.*;

class p02263 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(sum(n));
    }

    public static int sum (int n) {
        if (n == 1) return 1;
        else return n + sum(n/3);
    }
}
```

python code:

```python
def sum(n):
    if n == 1:
        return 1
    else:
        return n + sum(n/3)

n = int(input())
print(sum(n))
```

## 2.2.64

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
2500


```
import java.io.*;

class p02264 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(sum(n));
    }

    public static int sum (int n) {
        if (n == 1) return 1;
        else return n*n + sum(n/3);
    }
}
```

python code:
