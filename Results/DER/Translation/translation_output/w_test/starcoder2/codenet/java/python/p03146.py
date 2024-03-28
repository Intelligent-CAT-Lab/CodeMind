

```python

s = int(input())
set = set()
set.add(s)
i = 1
while True:
    i += 1
    if s % 2 == 0:
        s = s / 2
    else:
        s = 3 * s + 1
    if s in set:
        print(i)
        break
    else:
        set.add(s)

```

## 03147

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```

import java.util.Scanner;

public class p03147 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

```

python code:

```python

n = int(input())
a = [int(x) for x in input().split()]
max = a[0]
for i in range(1, n):
    if a[i] > max:
        max = a[i]
print(max)

```

## 03148

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```

import java.util.Scanner;

public class p03148 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}

```

python code:

```python

n = int(input())
a = [int(x) for x in input().split()]
min = a[0]
for i in range(1, n):
    if a[i] < min:
        min = a[i]
print(min)

```

## 03149

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```

import java.util.Scanner;

public class p03149 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}

```

python code:

```python

n = int(input())
a = [int(x) for x in input().split()]
sum = 0
for i in range(n):
    sum += a[i]
print(sum)

```

## 03150

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```

import java.util.Scanner;

public class p03150 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum / n);
    }
}

```

python code:

```python

n = int(input())
a = [int(x) for x in input().split()]
sum = 0
for i in range(n):
    sum += a[i]
print(sum // n)

```

## 03151

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```

import java.util.Scanner;

public class p03151 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum / n);
    }
}

```

python code:

```python

n = int(input())
a = [int(x) for x in input().split()]
sum = 0
for i in range(n):
    sum += a[i]
print(sum // n)

```

## 03152

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```

import java.util.Scanner;

public class p03152 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum / n);
    }
}

```

python code:

```python

n = int(input())
a = [int(x) for x in input().split()]
sum = 0
for i in range(n):
    sum += a[i]
print(sum // n)

```

## 03153

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```

import java.util.Scanner;

public class p03153 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]
