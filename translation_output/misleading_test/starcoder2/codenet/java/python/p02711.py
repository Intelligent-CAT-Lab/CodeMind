

```python
n = int(input())
print("Yes" if "7" in str(n) else "No")
```

## p02712

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100.00

```
import java.util.Scanner;

class p02712 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.printf("%.2f", n);
    }
}
```

python code:

```python
n = int(input())
print("%.2f" % n)
```

## p02722

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.Scanner;

class p02722 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n);
    }
}
```

python code:

```python
n = int(input())
print(n)
```

## p02723

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.Scanner;

class p02723 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n);
    }
}
```

python code:

```python
n = int(input())
print(n)
```

## p02739

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1 * 1 = 1
1 * 2 = 2
1 * 3 = 3
1 * 4 = 4
1 * 5 = 5
1 * 6 = 6
1 * 7 = 7
1 * 8 = 8
1 * 9 = 9

```
import java.util.Scanner;

class p02739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }
}
```

python code:

```python
n = int(input())
for i in range(1, 10):
    print("%d * %d = %d" % (n, i, n * i))
```

## p02741

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1
2
3
4
5
6
7
8
9
10

```
import java.util.Scanner;

class p02741 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
```

python code:

```python
n = int(input())
for i in range(1, n + 1):
    print(i)
```

## p02742

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10
9
8
7
6
5
4
3
2
1

```
import java.util.Scanner;

class p02742 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
```

python code:

```python
n = int(input())
for i in range(n, 0, -1):
    print(i)
```

## p02747

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1
1
2
3
5
8
13
21
34
55

```
import java.util.Scanner;

class p02747 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
```

python code:

```python
n = int(input())
a, b = 1, 1
for i in range(n):
    print(a)
    a, b = b, a + b
```

## p02750

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
1
2
3
4
5

```
import java.util.Scanner;

class p02750 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
```

python code:

```python
n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
for i in range(n):
    for j in range(i + 1, n):
        if a[i] > a[j]:
            a[i], a[j] = a[j], a[i]
for i in range(n):
    print(a[i])
```

## p02751

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
1
2
3
4
5

```
import java.util.Scanner;

class p02751 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i
