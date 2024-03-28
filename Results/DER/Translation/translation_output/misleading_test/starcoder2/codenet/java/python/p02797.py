
```python
N, K, S = map(int, input().split())
if K == 0:
    if S == 1000000000:
        print(*[1 for i in range(N)])
    else:
        S += 1
        print(*[S for i in range(N)])
else:
    print(*[S if i < K else S + 1 for i in range(N)])
```

## p02798

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 10
1 2 3

Expected output:
1

```
import java.util.Scanner;
import java.io.PrintWriter;

public class p02798 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = Integer.parseInt(sc.next());
        }
        int ans = 0;
        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++){
                for (int k = j + 1; k < N; k++){
                    int sum = A[i] + A[j] + A[k];
                    if (sum <= M){
                        ans = Math.max(ans, sum);
                    }
                }
            }
        }
        out.println(ans);

        //ãã³ãã¬
        sc.close();
        out.flush();
    }
}
```

python code:
```python
N, M = map(int, input().split())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            sum = A[i] + A[j] + A[k]
            if sum <= M:
                ans = max(ans, sum)
print(ans)
```

## p02799

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3
1 2 3
4 5 6
7 8 9

Expected output:
1 2 3
4 5 6
7 8 9

```
import java.util.Scanner;
import java.io.PrintWriter;

public class p02799 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                A[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                out.print(A[i][j] + " ");
            }
            out.println();
        }

        //ãã³ãã¬
        sc.close();
        out.flush();
    }
}
```

python code:
```python
N, M = map(int, input().split())
A = [list(map(int, input().split())) for i in range(N)]
for i in range(N):
    for j in range(M):
        print(A[i][j], end=' ')
    print()
```

## p02800

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3
1 2 3
4 5 6
7 8 9

Expected output:
1 2 3
4 5 6
7 8 9

```
import java.util.Scanner;
import java.io.PrintWriter;

public class p02800 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                A[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                out.print(A[i][j] + " ");
            }
            out.println();
        }

        //ãã³ãã¬
        sc.close();
        out.flush();
    }
}
```

python code:
```python
N, M = map(int, input().split())
A = [list(map(int, input().split())) for i in range(N)]
for i in range(N):
    for j in range(M):
        print(A[i][j], end=' ')
    print()
```

## p02801

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3
1 2 3
4 5 6
7 8 9

Expected output:
1 2 3
4 5 6
7 8 9

```
import java.util.Scanner;
import java.io.PrintWriter;

public class p02801 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                A[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                out.print(A[i][j] + " ");
            }
            out.println();
        }

        //ãã³ãã¬
        sc.close();
        out.flush();
    }

