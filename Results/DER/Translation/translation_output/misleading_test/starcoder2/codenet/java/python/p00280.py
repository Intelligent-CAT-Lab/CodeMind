

```python
a, b = map(int, input().split())

def slove(x, y, s):
    if (x == 5 and y < b and y != 4) or (y == 5 and x < a and x != 4):
        return
    if x == a + 1 or y == b + 1:
        return
    if x == a and y == b:
        print(s)
    for i in range(2):
        if i == 0:
            slove(x + 1, y, s + "A")
        else:
            slove(x, y + 1, s + "B")

slove(0, 0, "")
```

## 00281

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
_0PA:

```

import java.io.IOException;
import java.util.Scanner;

public class p00281 {

    public static void main(String[] args) throws IOException {

        new p00281().run();
    }

    private void run() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
for i in range(n):
    for j in range(n):
        print(a[j], end=" ")
    print()
```

## 00282

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
_0PA:

```

import java.io.IOException;
import java.util.Scanner;

public class p00282 {

    public static void main(String[] args) throws IOException {

        new p00282().run();
    }

    private void run() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[(i + j) % n] + " ");
            }
            System.out.println();
        }
    }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
for i in range(n):
    for j in range(n):
        print(a[(i + j) % n], end=" ")
    print()
```

## 00283

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
_0PA:

```

import java.io.IOException;
import java.util.Scanner;

public class p00283 {

    public static void main(String[] args) throws IOException {

        new p00283().run();
    }

    private void run() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n;
