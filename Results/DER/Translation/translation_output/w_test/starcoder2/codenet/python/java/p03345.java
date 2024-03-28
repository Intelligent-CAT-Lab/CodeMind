

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        if (K % 2 == 0) {
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}
```


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
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int len = A[i] + A[j] + A[k];
                    int ma = Math.max(A[i], Math.max(A[j], A[k]));
                    int rest = len - ma;
                    if (ma < rest) {
                        ans = Math.max(ans, len);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
/ABC/ABC160/ABC160_C.md
# C - Traveling Salesman around Lake

## Problem

There is a lake of length K.
There are N islands on the lake.
The i-th island is located at the distance of Ai from the starting point of the lake.

Takahashi wants to visit all the islands.
He will start from the starting point of the lake and visit the islands in the order of A1, A2, ..., AN.

However, he is lazy, so he will not visit the same island twice.

Find the minimum distance he needs to travel.

## Constraints

- 2 ≤ K ≤ 10^5
- 2 ≤ N ≤ 10^5
- 0 ≤ Ai < K
- All values in input are integers.

## Input

Input is given from Standard Input in the following format:

```
K N
A1 A2 ... AN
```

## Output

Print the minimum distance he needs to travel.

## Sample Input 1

```
21 4
10 14 15 17
```

## Sample Output 1

```
4
```

## Sample Input 2

```
100000 3
10000 20000 90000
```

## Sample Output 2

```
10000
```

## Sample Input 3

```
100000 10
1234 5678 9012 3456 7890 1234 5678 9012 3456 7890
```

## Sample Output 3

```
0
```

## Note

In the first sample, he can visit the islands in the order of A1, A2, A4, A3.

In the second sample, he can visit the islands in the order of A1, A2, A3.

In the third sample, he can visit the islands in the order of A1, A2, A3, A4, A5, A6, A7, A8, A9, A10.

## Java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = K;
        for (int i = 0; i < N - 1; i++) {
            ans -= Math.abs(A[i] - A[i + 1]);
        }
        System.out.println(ans);
    }
}
```

# D - Print a Chessboard

## Problem

There is a chessboard with H rows and W columns.
The cell in the i-th row from the top and j-th column from the left is denoted by (i, j).

Snuke will perform the following operation exactly K times:

- Choose two cells (r1, c1) and (r2, c2) such that |r1-r2|+|c1-c2|=1.
- Swap the cells (r1, c1) and (r2, c2).

Here, |x| denotes the absolute value of x.

Find the number of pairs of cells (r1, c1) and (r2, c2) such that the following conditions are satisfied:

- |r1-r2|+|c1-c2|=1.
- After the operation, the cells (r1, c1) and (r2, c2) are swapped.

## Constraints

- 1 ≤ H, W ≤ 100
- 1 ≤ K ≤ 10^9
- All values in input are integers.

## Input

Input is given from Standard Input in the following format:

```
H W K
```

## Output

Print the number of pairs of cells (r1, c1) and (r2, c2) such that the conditions are satisfied.

## Sample Input 1

```
2 2 1
```

## Sample Output 1

```
4
```

## Sample Input 2

```
2 2 2
```

## Sample Output 2

```
0
```

## Sample Input 3

```
3 3 7
```

## Sample Output 3

```
18
```

## Note

In the first sample, the following pairs of cells satisfy the conditions:

- (1, 1) and (1, 2)
- (1, 1) and (2, 1)
- (1, 2) and (1, 1)
- (1, 2) and (2, 2)
- (2, 1) and (1, 1)
- (2, 1) and (2, 2)
- (2, 2) and (1, 2)
- (2, 2) and (2, 1)

In the second sample, no pair of cells satisfies the conditions.

In the third sample, the following pairs of cells satisfy the conditions:

- (1, 1) and (1, 2)
- (1, 1) and (1, 3)
- (1, 1) and (2, 1)
- (1, 2) and (1, 1)
- (1, 2) and (1, 3)
- (1, 2) and (2, 2)
- (1, 3) and (1, 1)
- (1, 3) and (1, 2)
- (1, 3) and (2, 3)
- (2, 1) and (1, 1)
- (2, 1) and (2, 2)
- (2, 1) and (3, 1)
- (2, 2) and (1, 2)
- (2, 2) and (2, 1)
- (2, 2) and (2, 3)
- (2, 3) and (1, 3)
- (2, 3) and (2, 2)
- (2
