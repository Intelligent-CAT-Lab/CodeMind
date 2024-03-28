

```python
import sys

A, B, C, D, E, F = map(int, sys.stdin.readline().split())
ans1 = A * 100
ans2 = 0
for a in range(F // (A * 100) + 1):
    for b in range(F // (B * 100) + 1):
        for c in range(F // C + 1):
            for d in range(F // D + 1):
                if 100 * a * A + 100 * b * B + C * c + D * d <= F and (C * c + D * d) / (a * A * 100 + b * B * 100) <= E / 100:
                    if a == 0 and b == 0:
                        continue
                    if ans2 / ans1 < (C * c + D * d) / (100 * a * A + 100 * b * B + C * c + D * d):
                        ans1 = 100 * a * A + 100 * b * B + C * c + D * d
                        ans2 = C * c + D * d
print(int(ans1), int(ans2))
```

## 3600. 20190101

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10


```
import java.util.*;

public class p03600 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

```

python code:

```python
import sys

N = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))
for i in range(N):
    print(arr[i], end=' ')
print()
```

## 3601. 20190102

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10 9 8 7 6 5 4 3 2 1


```
import java.util.*;

public class p03601 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = N - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

```

python code:

```python
import sys

N = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))
for i in range(N - 1, -1, -1):
    print(arr[i], end=' ')
print()
```

## 3602. 20190103

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 3 5 7 9 10 8 6 4 2


```
import java.util.*;

public class p03602 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            if(i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        for(int i = N - 1; i >= 0; i--) {
            if(i % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

```

python code:

```python
import sys

N = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))
for i in range(N):
    if i % 2 == 0:
        print(arr[i], end=' ')
for i in range(N - 1, -1, -1):
    if i % 2 == 1:
        print(arr[i], end=' ')
print()
```

## 3603. 20190104

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


```

