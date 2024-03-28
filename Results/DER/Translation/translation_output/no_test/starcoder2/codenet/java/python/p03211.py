
```
S = input()
min = 1000
for i in range(len(S)-2):
    X = int(S[i:i+3])
    min = min if min < abs(X-753) else abs(X-753)
print(min)
```

## 03212

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                max = Math.max(max, A[i] + A[j]);
            }
        }
        System.out.println(max);
        sc.close();
    }
}
```

python code:
```
N = int(input())
A = [int(x) for x in input().split()]
max = 0
for i in range(N):
    for j in range(i+1, N):
        max = max if max > A[i]+A[j] else A[i]+A[j]
print(max)
```

## 03213

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    max = Math.max(max, A[i] + A[j] + A[k]);
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
```

python code:
```
N = int(input())
A = [int(x) for x in input().split()]
max = 0
for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            max = max if max > A[i]+A[j]+A[k] else A[i]+A[j]+A[k]
print(max)
```

## 03214

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    for (int l = k + 1; l < N; l++) {
                        max = Math.max(max, A[i] + A[j] + A[k] + A[l]);
                    }
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
```

python code:
```
N = int(input())
A = [int(x) for x in input().split()]
max = 0
for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            for l in range(k+1, N):
                max = max if max > A[i]+A[j]+A[k]+A[l] else A[i]+A[j]+A[k]+A[l]
print(max)
```

## 03215

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    for (int l = k + 1; l < N; l++) {
                        for (int m = l + 1; m < N; m++) {
                            max = Math.max(max, A[i] + A[j] + A[k] + A[l] + A[m]);
                        }
                    }
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
```

python code:
```
N = int(input())
A = [int(x) for x in input().split()]
max = 0
for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            for l in range(k+1, N):
                for m in range(l+1, N):
                    max = max if max > A[i]+A[j]+A[k]+A[l]+A[m] else A[i]+A[j]+A[k]+A[l]+A[m]
print(max)
```

## 03216

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    for (int l = k + 1; l < N; l++) {
                        for (int m = l + 1; m < N; m++) {
                            for (int n = m + 1; n < N; n++) {
                                max = Math.max(max, A[i] + A[j] + A[k] + A[l] + A[m] + A[n]);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
```

python code:
```
N = int(input())
A = [int(x) for x in input().split()]
max = 0
for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            for l in range(k+1, N):
                for m in range(l+1, N):
                    for n in range(m+
