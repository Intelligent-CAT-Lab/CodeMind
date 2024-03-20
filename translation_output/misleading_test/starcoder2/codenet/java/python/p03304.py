
```python
n, m, d = map(int, input().split())
s = d * 2 if d != 0 else n
print((s / n / n) * (m - 1))
```

## 03305

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

```
import java.io.PrintStream;
import java.util.Scanner;
public class p03305 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            so.print(a[i] + " ");
        }
        so.println();
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
print(*a)
```

## 03306

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10 9 8 7 6 5 4 3 2 1

```
import java.io.PrintStream;
import java.util.Scanner;
public class p03306 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            so.print(a[i] + " ");
        }
        so.println();
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
print(*reversed(a))
```

## 03307

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1

```
import java.io.PrintStream;
import java.util.Scanner;
public class p03307 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            so.print(a[i] + " ");
        }
        so.println();
        for (int i = n - 1; i >= 0; i--) {
            so.print(a[i] + " ");
        }
        so.println();
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
print(*a)
print(*reversed(a))
```

## 03308

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1
10 9 8 7 6 5 4 3 2 1

```
import java.io.PrintStream;
import java.util.Scanner;
public class p03308 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            so.print(a[i] + " ");
        }
        so.println();
        for (int i = n - 1; i >= 0; i--) {
            so.print(a[i] + " ");
        }
        so.println();
        for (int i = n - 1; i >= 0; i--) {
            so.print(a[i] + " ");
        }
        so.println();
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
print(*a)
print(*reversed(a))
print(*reversed(a))
```

## 03309

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1
10 9 8 7 6 5 4 3 2 1
10 9 8 7 6 5 4 3 2 1

```
import java.io.PrintStream;
import java.util.Scanner;
public class p03309 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            so.print(a[i] + " ");
        }
        so.println();
        for (int i = n - 1; i >= 0; i--) {
            so.print(a[i] + " ");
        }
        so.println();
        for (int i = n - 1; i >= 0; i--) {
            so.print(a[i] + " ");
        }
        so.println();
        for (int i = n - 1; i >= 0; i--) {
            so.print(a[i] + " ");
        }
        so.println();
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
print(*a)
print(*reversed(a))
print(*reversed(a))
print(*reversed
