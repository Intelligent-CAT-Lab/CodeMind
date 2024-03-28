
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        System.out.println(T + S);
    }
}
```


print(S[::-1])
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(new StringBuilder(S).reverse().toString());
    }
}
```
/ABC/ABC129/B.md
# B - Balance

## Problem

Takahashi has a sequence of N integers a1,a2,...,aN.

He wants to divide the sequence into two sequences (possibly empty) b1,b2,...,bK and c1,c2,...,cL (K+L=N) so that the absolute difference between the sum of b1,b2,...,bK and the sum of c1,c2,...,cL is as small as possible. Find the minimum possible value of |(b1+b2+...+bK)-(c1+c2+...+cL)|.

## Constraints

* 1≤N≤100
* 1≤ai≤100

## Input

Input is given from Standard Input in the following format:

```
N
a1 a2 ... aN
```

## Output

Print the minimum possible value of |(b1+b2+...+bK)-(c1+c2+...+cL)|.

## Sample Input 1

```
3
8 5 8
```

## Sample Output 1

```
0
```

## Sample Input 2

```
4
10 9 1 1
```

## Sample Output 2

```
1
```

## Sample Input 3

```
5
1 2 3 4 5
```

## Sample Output 3

```
2
```

## Note

In the first sample, we can divide the sequence into b=8,5 and c=8. Then, |(b1+b2)-(c1)|=0, which is the minimum possible value.

In the second sample, we can divide the sequence into b=10,9 and c=1,1. Then, |(b1+b2)-(c1+c2)|=1, which is the minimum possible value.

In the third sample, we can divide the sequence into b=1,2,3 and c=4,5. Then, |(b1+b2+b3)-(c1+c2)|=2, which is the minimum possible value.

## Solution

Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
A = list(map(int, input().split()))

S = sum(A)

ans = float('inf')
for i in range(N):
    ans = min(ans, abs(S - 2 * sum(A[:i + 1])))

print(ans)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int S = 0;
        for (int i = 0; i < N; i++) {
            S += A[i];
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            ans = Math.min(ans, Math.abs(S - 2 * sum(A, i + 1)));
        }

        System.out.println(ans);
    }

    public static int sum(int[] A, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        return sum;
    }
}
```

## Solution 2

Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
A = list(map(int, input().split()))

S = sum(A)

ans = float('inf')
for i in range(N):
    ans = min(ans, abs(S - 2 * sum(A[:i + 1])))

print(ans)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int S = 0;
        for (int i = 0; i < N; i++) {
            S += A[i];
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            ans = Math.min(ans, Math.abs(S - 2 * sum(A, i + 1)));
        }

        System.out.println(ans);
    }

    public static int sum(int[] A, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        return sum;
    }
}
```

## Solution 3

Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
A = list(map(int, input().split()))

S = sum(A)

ans = float('inf')
for i in range(N):
    ans = min(ans, abs(S - 2 * sum(A[:i + 1])))

print(ans)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int S = 0;
        for (int i = 0; i < N; i++) {
            S += A[i];
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            ans = Math.min(ans, Math.abs(S - 2 * sum(A, i + 1)));
        }

        System.out.println(ans);
    }

    public static int sum(int[] A, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        return sum;
    }
}
```

## Solution 4

Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
A = list(map(int, input().split()))

S = sum(A)

ans = float('inf')
for i in range(N):
    ans = min(ans, abs(S - 2 * sum(A[:i + 1])))

print(ans)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int S = 0;
        for (int i = 0; i < N; i++) {
            S += A[i];
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            ans = Math.min(ans, Math.abs(S - 2 * sum(A, i + 1)));
        }

        System.out.println(ans);
    }

    public
