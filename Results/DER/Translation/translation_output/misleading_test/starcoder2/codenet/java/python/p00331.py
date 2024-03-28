

```python
import sys

for line in sys.stdin:
    H, R = map(int, line.split())
    if H < 0 and abs(H) == R:
        print(0)
    elif H + R > 0:
        print(1)
    else:
        print(-1)
```

## p00332

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

```
import java.util.Scanner;

public class p00332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}

```

python code:

```python
import sys

for line in sys.stdin:
    a = list(map(int, line.split()))
    print(' '.join(map(str, a)))
```

## p00333

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10 9 8 7 6 5 4 3 2 1

```
import java.util.Scanner;

public class p00333 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = n - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}

```

python code:

```python
import sys

for line in sys.stdin:
    a = list(map(int, line.split()))
    print(' '.join(map(str, a[::-1])))
```

## p00334

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 3 5 7 9 10 8 6 4 2

```
import java.util.Scanner;

public class p00334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i += 2) {
                System.out.print(a[i] + " ");
            }
            for (int i = n - 1; i >= 0; i -= 2) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}

```

python code:

```python
import sys

for line in sys.stdin:
    a = list(map(int, line.split()))
    print(' '.join(map(str, a[::2] + a[::-2])))
```

## p00335

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10

```
import java.util.Scanner;

public class p00335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
        }
    }
}

```

python code:

```python
import sys

for line in sys.stdin:
    a = list(map(int, line.split()))
    for i in range(len(a)):
        print(' '.join(map(str, a)))
```

## p00336

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10
2 3 4 5 6 7 8 9 10 1
3 4 5 6 7 8 9 10 1 2
4 5 6 7 8 9 10 1 2 3
5 6 7 8 9 10 1 2 3 4
6 7 8 9 10 1 2 3 4 5
7 8 9 10 1 2 3 4 5 6
8 9 10 1 2 3 4 5 6 7
9 10 1 2 3 4 5 6 7 8
10 1 2 3 4 5 6 7 8 9

```
import java.util.Scanner;

public class p00336 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc
