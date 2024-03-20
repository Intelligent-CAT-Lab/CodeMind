

```python
n, k = map(int, input().split())
left = 1
right = k + 1
while right - left > 1:
    m = (left + right) // 2
    x = m
    total = 0
    for i in range(n):
        total += x
        x //= 2
        if total > k:
            break
    if total <= k:
        left = m
    else:
        right = m
print(left)
```

## 2207

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1

```
import java.util.*;

public class p02207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int left = 0;
        int right = 1000000000;
        while (right - left > 1) {
            int m = (left + right) / 2;
            int total = 0;
            for (int i = 0; i < n; i++) {
                total += Math.min(a[i], m);
            }
            if (total >= k) {
                right = m;
            } else {
                left = m;
            }
        }
        System.out.println(right);
    }
}

```

python code:

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))
left = 0
right = 1000000000
while right - left > 1:
    m = (left + right) // 2
    total = 0
    for i in range(n):
        total += min(a[i], m)
    if total >= k:
        right = m
    else:
        left = m
print(right)
```

## 2208

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1

```
import java.util.*;

public class p02208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int left = 0;
        int right = 1000000000;
        while (right - left > 1) {
            int m = (left + right) / 2;
            int total = 0;
            for (int i = 0; i < n; i++) {
                total += Math.min(a[i], m);
            }
            if (total >= k) {
                right = m;
            } else {
                left = m;
            }
        }
        System.out.println(right);
    }
}

```

python code:

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))
left = 0
right = 1000000000
while right - left > 1:
    m = (left + right) // 2
    total = 0
    for i in range(n):
        total += min(a[i], m)
    if total >= k:
        right = m
    else:
        left = m
print(right)
```

## 2209

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1

```
import java.util.*;

public class p02209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int left = 0;
        int right = 1000000000;
        while (right - left > 1) {
            int m = (left + right) / 2;
            int total = 0;
            for (int i = 0; i < n; i++) {
                total += Math.min(a[i], m);
            }
            if (total >= k) {
                right = m;
            } else {
                left = m;
            }
        }
        System.out.println(right);
    }
}

```

python code:

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))
left = 0
right = 1000000000
while right - left > 1:
    m = (left + right) // 2
    total = 0
    for i in range(n):
        total += min(a[i], m)
    if total >= k:
        right = m
    else:
        left = m
print(right)
```

## 2210

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1

```
import java.util.*;

public class p02210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int left = 0;
        int right = 1000000000;
        while (right - left > 1) {
            int m = (left + right) / 2;
            int total = 0;
            for (int i = 0; i < n; i++) {
                total += Math.min(a[i], m);
            }
            if (total >= k) {
                right = m;
            } else {
                left = m;
            }
        }
        System.out.println(right);
    }
}

```

python code:

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))
left = 0
right = 1000000000
while right - left > 1:
    m = (left + right) // 2
    total = 0
    for i in range(n):
        total += min(a[i], m)
    if total >= k:
        right = m
    else:
        left = m
print(right)
```
/README.md
# Python-Java-Translator

## Introduction

This is a python script that can translate java code to python code.

## Usage

```
python3 translator.py <java_file>
```

## Example

```
python3 translator.py p02201.java
```

## Supported Java Features

- [x] Basic data types
- [x] Basic operators
- [x] Basic control flow

