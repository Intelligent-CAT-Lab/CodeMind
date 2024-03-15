
```
X, Y = map(int, input().split())

sum = 0
judge = False
a = 0
b = 0
c = 0

for i in range(X+1):
    for k in range(X-i+1):
        sum = 10000*i + 5000*k + 1000*(X-i-k)
        if sum == Y:
            judge = True
            a = i
            b = k
            c = X-i-k
            break

if judge:
    print(a, b, c)
else:
    print("-1 -1 -1")
```

## 03472

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03472 {

    public static void main(String[] args) {
        // TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] a = new int[N];
        int[] b = new int[M];

        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i<M; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[N+M];
        int j=0;
        for (int i=0; i<N; i++) {
            c[j] = a[i];
            j++;
        }
        for (int i=0; i<M; i++) {
            c[j] = b[i];
            j++;
        }

        for (int i=0; i<N+M; i++) {
            for (int k=i+1; k<N+M; k++) {
                if (c[i]>c[k]) {
                    int tmp = c[i];
                    c[i] = c[k];
                    c[k] = tmp;
                }
            }
        }

        for (int i=0; i<N+M; i++) {
            System.out.print(c[i]);
            System.out.print(" ");
        }

    }

}
```

python code:
```
N, M = map(int, input().split())

a = list(map(int, input().split()))
b = list(map(int, input().split()))

c = a + b

for i in range(len(c)):
    for k in range(i+1, len(c)):
        if c[i] > c[k]:
            tmp = c[i]
            c[i] = c[k]
            c[k] = tmp

print(*c)
```

## 03473

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03473 {

    public static void main(String[] args) {
        // TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] a = new int[N];
        int[] b = new int[N];

        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[N];
        for (int i=0; i<N; i++) {
            c[i] = a[i] + b[i];
        }

        for (int i=0; i<N; i++) {
            System.out.print(c[i]);
            System.out.print(" ");
        }

    }

}
```

python code:
```
N = int(input())

a = list(map(int, input().split()))
b = list(map(int, input().split()))

c = [a[i] + b[i] for i in range(N)]

print(*c)
```

## 03474

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03474 {

    public static void main(String[] args) {
        // TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] a = new int[N];
        int[] b = new int[N];

        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[N];
        for (int i=0; i<N; i++) {
            c[i] = a[i] * b[i];
        }

        for (int i=0; i<N; i++) {
            System.out.print(c[i]);
            System.out.print(" ");
        }

    }

}
```

python code:
```
N = int(input())

a = list(map(int, input().split()))
b = list(map(int, input().split()))

c = [a[i] * b[i] for i in range(N)]

print(*c)
```

## 03475

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03475 {

    public static void main(String[] args) {
        // TODO èªåçæ
