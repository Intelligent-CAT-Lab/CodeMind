
```python
A, B = map(int, input().split())
print(A - (B * 2))
```

## B - Takoyaki

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4 5

Expected output:
1

```
import java.util.*;

public class atcoder_ABC143_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = 0;
        sum = A * B + B * C + C * A;
        System.out.println(sum);
    }
}
```

python code:
```python
A, B, C = map(int, input().split())
print(A * B + B * C + C * A)
```

## C - Slimes

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5
1 2 3 2 1

Expected output:
4

```
import java.util.*;

public class atcoder_ABC143_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }
        int count = 1;
        for (int i = 0; i < N - 1; i++) {
            if (d[i] != d[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

python code:
```python
N = int(input())
d = list(map(int, input().split()))
count = 1
for i in range(N - 1):
    if d[i] != d[i + 1]:
        count += 1
print(count)
```

## D - Triangles

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
1 2 3

Expected output:
1

```
import java.util.*;

public class atcoder_ABC143_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        Arrays.sort(L);
        int count = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                int k = Arrays.binarySearch(L, L[i] + L[j]);
                if (k > j) {
                    count += k - j - 1;
                }
            }
        }
        System.out.println(count);
    }
}
```

python code:
```python
N = int(input())
L = list(map(int, input().split()))
L.sort()
count = 0
for i in range(N - 2):
    for j in range(i + 1, N - 1):
        k = bisect.bisect_left(L, L[i] + L[j])
        if k > j:
            count += k - j - 1
print(count)
```
/atcoder/ABC144/README.md
# AtCoder Beginner Contest 144

## A - 9x9

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
6

```
import java.util.*;

public class atcoder_ABC144_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A <= 9 && B <= 9) {
            System.out.println(A * B);
        } else {
            System.out.println(-1);
        }
    }
}
```

python code:
```python
A, B = map(int, input().split())
if A <= 9 and B <= 9:
    print(A * B)
else:
    print(-1)
```

## B - 81

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
Yes

```
import java.util.*;

public class atcoder_ABC144_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
```

python code:
```python
N = int(input())
for i in range(1, 10):
    for j in range(1, 10):
        if i * j == N:
            print("Yes")
            exit()
print("No")
```

## C - Walk on Multiplication Table

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100000

Expected output:
2

```
import java.util.*;

public class atcoder_ABC144_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = Long.MAX_VALUE;
        for (long i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                ans = Math.min(ans, i + N / i - 2);
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```python
N = int(input())
ans = float("inf")
for i in range(1, int(N ** 0.5) + 1):
    if N % i == 0:
        ans = min(ans, i + N // i - 2)
print(ans)
```

## D - Water Bottle

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 10

Expected output:
45.0000000000

```
import java.util.*;

public class atcoder_ABC144_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        double ans = 0;
        if (x >= a * a * b / 2) {
            ans = Math.atan((2 * (a * a * b - x)) / (a * a * a));
        } else {
            ans = Math.atan(a * b * b / (2 * x));
        }
        System.out.println(Math.toDegrees(ans));
    }
}
```

python code:
```python
a, b, x = map(int, input().split())
if x >= a * a * b / 2:
    ans = math.atan
