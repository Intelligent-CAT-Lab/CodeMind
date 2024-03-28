

```python
N = int(input())
for i in range(N+1):
    if i*1.08 == N:
        print(i)
        break
else:
    print(":(")
```

## p02843

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

public class p02843 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(N);
    }
}

```

python code:

```python
N = int(input())
print(N)
```

## p02844

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

public class p02844 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(N);
    }
}

```

python code:

```python
N = int(input())
print(N)
```

## p02845

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 100
1000 1000

Expected output:
900 900

```
import java.util.Scanner;

public class p02845 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        System.out.println((W-N)*H);
        System.out.println((H-N)*W);
    }
}

```

python code:

```python
W, H = map(int, input().split())
N = int(input())
print((W-N)*H)
print((H-N)*W)
```

## p02846

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5
1 2 3 2 1

Expected output:
2

```
import java.util.Scanner;

public class p02846 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        int max = 0;
        int cur = 0;
        for (int i=1;i<N;i++) {
            if (A[i-1]<A[i]) {
                cur += A[i]-A[i-1];
            } else {
                max = Math.max(max, cur);
                cur = 0;
            }
        }
        max = Math.max(max, cur);
        System.out.println(max);
    }
}

```

python code:

```python
N = int(input())
A = list(map(int, input().split()))
max = 0
cur = 0
for i in range(1, N):
    if A[i-1] < A[i]:
        cur += A[i] - A[i-1]
    else:
        max = max if max > cur else cur
        cur = 0
max = max if max > cur else cur
print(max)
```

## p02847

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5
10
9
8
7
6

Expected output:
5

```
import java.util.Scanner;

public class p02847 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i=N-2;i>=0;i--) {
            if (A[i]>=A[i+1]) {
                ans += A[i]-A[i+1]+1;
                A[i] = A[i+1]-1;
            }
        }
        System.out.println(ans);
    }
}

```

python code:

```python
N = int(input())
A = [int(input()) for _ in range(N)]
ans = 0
for i in range(N-2, -1, -1):
    if A[i] >= A[i+1]:
        ans += A[i] - A[i+1] + 1
        A[i] = A[i+1] - 1
print(ans)
```

## p02848

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
1 2 3 4 5

```
import java.util.Scanner;

public class p02848 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        for (int i=0;i<N;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}

```

python code:

```python
N = int(input())
A = list(map(int, input().split()))
print(*A)
```

## p02849

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
5 4 3 2 1

```
import java.util.Scanner;

public class p02849 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        for (int i=N-1;i>=0;i--) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}

```

python code:

```python
