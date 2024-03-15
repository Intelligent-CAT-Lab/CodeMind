
```
import math

n = int(input())
print(n, end=':')
for i in range(2, int(math.sqrt(n)) + 1):
    while n % i == 0:
        n = n // i
        print(' ', i, end='')
print(' ', n)
```

## 2.4.6. 1000000007

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02468 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.nextLine());
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[j] % 10;
                a[j] /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }

}
```

python code:
```
n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
max = 0
for i in range(n):
    sum = 0
    for j in range(n):
        sum += a[j] % 10
        a[j] //= 10
    if sum > max:
        max = sum
print(max)
```

## 2.4.7. 1000000008

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02469 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.nextLine());
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[j] % 10;
                a[j] /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }

}
```

python code:
```
n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
max = 0
for i in range(n):
    sum = 0
    for j in range(n):
        sum += a[j] % 10
        a[j] //= 10
    if sum > max:
        max = sum
print(max)
```

## 2.4.8. 1000000009

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02470 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.nextLine());
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[j] % 10;
                a[j] /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }

}
```

python code:
```
n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
max = 0
for i in range(n):
    sum = 0
    for j in range(n):
        sum += a[j] % 10
        a[j] //= 10
    if sum > max:
        max = sum
print(max)
```

## 2.4.9. 1000000010

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02471 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.nextLine());
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[j] % 10;
                a[j] /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }

}
```

python code:
```
n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
max = 0
for i in range(n):
    sum = 0
    for j in range(n):
        sum += a[j] % 10
        a[j] //= 10
    if sum > max:
        max = sum
print(max)
```

## 2.4.10. 1000000011

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02472 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.nextLine());
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[j] % 10;
                a[j] /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }

}
```

python code:
```
n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
max = 0
for i in range(n):
    sum = 0
    for j in range(n):
        sum += a[j]
