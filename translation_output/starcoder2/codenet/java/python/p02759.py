
```
N = int(input())
print((N + 1) // 2)
```

## p02760
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02760 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] A = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    int[][] B = new int[M][N];
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        B[i][j] = A[j][i];
      }
    }
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        System.out.printf("%d ", B[i][j]);
      }
      System.out.printf("\n");
    }
    sc.close();
    return;
  }
}
```

python code:
```
N, M = map(int, input().split())
A = [list(map(int, input().split())) for _ in range(N)]
B = [[A[j][i] for j in range(N)] for i in range(M)]
for i in range(M):
    print(*B[i])
```

## p02761
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02761 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] A = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    int[][] B = new int[M][N];
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        B[i][j] = A[j][i];
      }
    }
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        System.out.printf("%d ", B[i][j]);
      }
      System.out.printf("\n");
    }
    sc.close();
    return;
  }
}
```

python code:
```
N, M = map(int, input().split())
A = [list(map(int, input().split())) for _ in range(N)]
B = [[A[j][i] for j in range(N)] for i in range(M)]
for i in range(M):
    print(*B[i])
```

## p02762
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02762 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] A = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    int[][] B = new int[M][N];
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        B[i][j] = A[j][i];
      }
    }
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        System.out.printf("%d ", B[i][j]);
      }
      System.out.printf("\n");
    }
    sc.close();
    return;
  }
}
```

python code:
```
N, M = map(int, input().split())
A = [list(map(int, input().split())) for _ in range(N)]
B = [[A[j][i] for j in range(N)] for i in range(M)]
for i in range(M):
    print(*B[i])
```

## p02763
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02763 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] A = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    int[][] B = new int[M][N];
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        B[i][j] = A[j][i];
      }
    }
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        System.out.printf("%d ", B[i][j]);
      }
      System.out.printf("\n");
    }
    sc.close();
    return;
  }
}
```

python code:
```
N, M = map(int, input().split())
A = [list(map(int, input().split())) for _ in range(N)]
B = [[A[j][i] for j in range(N)] for i in range(M)]
for i in range(M):
    print(*B[i])
```

## p02764
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02764 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] A = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    int[][] B = new int[M][N];
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        B[i][j] = A[j][i];
      }
    }
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        System.out.printf("%d ", B[i][j]);
      }
      System.out.printf("\n");
    }
    sc.close();
    return;
  }
}
```

python code:
```
N, M = map(int, input().split())
A = [list(map(int, input().split())) for _ in range(N)]
B = [[A[j][i] for j in range(N)] for i in range(M)]
for i in range(M):
    print(*B[i])
```

## p02765
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02765 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] A = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (
