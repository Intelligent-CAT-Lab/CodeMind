
```python
N = int(input())
sum = 0

for i in range(1, N+1):
    if i % 2 != 0:
        sum += 1

print(sum / N)
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC142_B {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        int K = stdin.nextInt();
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            int h = stdin.nextInt();
            if (h >= K) {
                sum += 1;
            }
        }
        
        System.out.println(sum);
    }
}
```

python code:
```python
N, K = map(int, input().split())
sum = 0

for i in range(N):
    h = int(input())
    if h >= K:
        sum += 1

print(sum)
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC142_C {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = stdin.nextInt();
            B[i] = i + 1;
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] > A[j]) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                    
                    tmp = B[i];
                    B[i] = B[j];
                    B[j] = tmp;
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
B = [i+1 for i in range(N)]

for i in range(N):
    for j in range(i+1, N):
        if A[i] > A[j]:
            A[i], A[j] = A[j], A[i]
            B[i], B[j] = B[j], B[i]

print(*B)
```

## 4.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC142_D {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        long A = stdin.nextLong();
        long B = stdin.nextLong();
        long gcd = gcd(A, B);
        int count = 0;
        
        for (long i = 1; i * i <= gcd; i++) {
            if (gcd % i == 0) {
                count++;
                if (i * i != gcd) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```

python code:
```python
A, B = map(int, input().split())
gcd = A

if A < B:
    A, B = B, A

while B != 0:
    A, B = B, A % B

gcd = A
count = 0

for i in range(1, int(gcd**0.5)+1):
    if gcd % i == 0:
        count += 1
        if i * i != gcd:
            count += 1

print(count)
```

## 5.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC142_E {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        int M = stdin.nextInt();
        int[] A = new int[M];
        int[] C = new int[M];
        int[] dp = new int[1 << N];
        int INF = 1000000000;
        
        for (int i = 0; i < M; i++) {
            A[i] = stdin.nextInt();
            C[i] = stdin.nextInt();
            for (int j = 0; j < A[i]; j++) {
                int a = stdin.nextInt();
                C[i] |= 1 << (a - 1);
            }
        }
        
        for (int i = 0; i < 1 << N; i++) {
            dp[i] = INF;
        }
        
        dp[0] = 0;
        
        for (int i = 0; i < 1 << N; i++) {
            for (int j = 0; j < M; j++) {
                dp[i | C[j]] = Math.min(dp[i | C[j]], dp[i] + 1);
            }
        }
        
        if (dp[(1 << N) - 1] == INF) {
            System.out.println(-1);
        } else {
            System.out.println(dp[(1 << N) - 1]);
        }
    }
}
```

python code:
```python
N, M = map(int, input().split())
A = [0] * M
C = [0] * M
dp = [10**9] * (1 << N)
INF = 10**9

for i in range(M):
    A[i], C[i] = map(int, input().split())
    for j in range(A[i]):
        a = int(input())
        C[i] |= 1 << (a - 1)

for i in range(1 << N):
    dp[i] = INF

dp[0] = 0

for i in range(1 << N):
    for j in range(M):
        dp[i | C[j]] = min(dp[i | C[j]], dp[i] + 1)

if dp[(1 << N) - 1] == INF:
    print(-1)
else:
    print(dp[(1 << N) - 1])
```

## 6.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC142_F {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        int M = stdin.nextInt();
        int[][] G = new int[N][N];
        int[] dp = new int[1 << N];
        int INF = 1000000000;
        
        for (int i = 0; i < M; i++) {
            int a = stdin.nextInt();
            int b = stdin.nextInt();
            G[a - 1][b - 1] = 1;
        }
        
        for (int i = 0; i < 1 << N; i++) {
            dp[i] = INF;
        }
        
        dp[1] = 0;
        
        for (int i = 0; i < 1 << N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) == 0) {
                    continue;
                }
                for (int k = 0; k < N;
