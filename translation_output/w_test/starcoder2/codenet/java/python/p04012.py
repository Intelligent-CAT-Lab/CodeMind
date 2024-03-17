
```python
w = input()
c = list(w)
a = ord('a')
z = ord('z')
count = 0
for i in range(a, z + 1):
    for x in c:
        if x == chr(i):
            count += 1
    if count % 2 == 1:
        print("No")
        break
    count = 0
else:
    print("Yes")
```

## 4.013

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.*;

public class p04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
a = []
for i in range(n):
    a.append(int(input()))
max = a[0]
for i in range(1, n):
    if a[i] > max:
        max = a[i]
print(max)
```

## 4.014

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.*;

public class p04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
a = []
for i in range(n):
    a.append(int(input()))
min = a[0]
for i in range(1, n):
    if a[i] < min:
        min = a[i]
print(min)
```

## 4.015

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.*;

public class p04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
a = []
for i in range(n):
    a.append(int(input()))
sum = 0
for i in range(n):
    sum += a[i]
print(sum)
```

## 4.016

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.*;

public class p04016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
a = []
for i in range(n):
    a.append(int(input()))
sum = 0
for i in range(n):
    sum += a[i]
print(sum // n)
```

## 4.017

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.*;

public class p04017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
a = []
for i in range(n):
    a.append(int(input()))
sum = 0
for i in range(n):
    sum += a[i]
print(sum // n)
```

## 4.018

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.*;

public class p04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
a = []
for i in range(n):
    a.append(int(input()))
sum = 0
for i in range(n):
    sum += a[i]
print(sum // n)
```

## 4.019

Translate the following java code to python and enclose your solution inside ```python```.
