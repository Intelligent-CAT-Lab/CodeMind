

```python
import math

A, B, X = map(int, input().split())

if X * 2 >= A * A * B:
    z = (A * A * B - X) / A / A * 2
    d = math.atan(z / A) * 180 / math.pi
else:
    z = (X) / A / B * 2
    d = math.atan(B / z) * 180 / math.pi

print(d)
```

## p02883

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10


```
import java.util.Scanner;

/**
 * 12345678910
 */
public class p02883 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                System.out.print(sc.nextInt() + " ");
            }
            System.out.println();
        }
    }

}

```

python code:

```python
N = int(input())

for i in range(N):
    print(input(), end=' ')

print()
```

## p02884

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 20

Expected output:
9 29


```
import java.util.Scanner;

/**
 * Alarm Clock
 */
public class p02884 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int H = sc.nextInt();
            int M = sc.nextInt();
            int S = sc.nextInt();

            int t = H * 3600 + M * 60 + S - 45;
            if (t < 0) {
                t += 24 * 3600;
            }

            System.out.println(t / 3600 + " " + (t % 3600) / 60);
        }
    }

}

```

python code:

```python
H, M, S = map(int, input().split())

t = H * 3600 + M * 60 + S - 45
if t < 0:
    t += 24 * 3600

print(t // 3600, t % 3600 // 60)
```

## p02885

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.Scanner;

/**
 * 1000000000000000000
 */
public class p02885 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();
            System.out.println(N);
        }
    }

}

```

python code:

```python
N = int(input())
print(N)
```

## p02886

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.Scanner;

/**
 * 1000000000000000000
 */
public class p02886 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();
            System.out.println(N);
        }
    }

}

```

python code:

```python
N = int(input())
print(N)
```

## p02887

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.Scanner;

/**
 * 1000000000000000000
 */
public class p02887 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();
            System.out.println(N);
        }
    }

}

```

python code:

```python
N = int(input())
print(N)
```

## p02888

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.Scanner;

/**
 * 1000000000000000000
 */
public class p02888 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();
            System.out.println(N);
        }
    }

}

```

python code:

```python
N = int(input())
print(N)
```

## p02889

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.Scanner;

/**
 * 1000000000000000000
 */
public class p02889 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();
            System.out.println(N);
        }
    }

}

```

python code:

```python
N = int(input())
print(N)
```

## p02890

Translate the
