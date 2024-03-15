
```

S = int(input())
yy = S // 100
mm = S % 100

if 1 <= yy <= 12:
    if 1 <= mm <= 12:
        print("AMBIGUOUS")
    else:
        print("MMYY")
else:
    if 1 <= mm <= 12:
        print("YYMM")
    else:
        print("NA")

```

## 03043

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p03043 {

    public static void main(String[] args) {
        // TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = 0;
        for(int i = 1; i <= N; i++) {
            int sum = 0;
            int tmp = i;
            while(tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if(A <= sum && sum <= B) {
                ans += i;
            }
        }
        System.out.println(ans);
    }

}

```

python code:
```

N, A, B = map(int, input().split())

ans = 0
for i in range(1, N + 1):
    sum = 0
    tmp = i
    while tmp > 0:
        sum += tmp % 10
        tmp //= 10
    if A <= sum <= B:
        ans += i
print(ans)

```

## 03044

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p03044 {

    public static void main(String[] args) {
        // TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                if(a[i] + a[j] == M) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

}

```

python code:
```

N, M = map(int, input().split())
a = list(map(int, input().split()))

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if a[i] + a[j] == M:
            ans += 1
print(ans)

```

## 03045

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p03045 {

    public static void main(String[] args) {
        // TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                for(int k = j + 1; k < N; k++) {
                    if(a[i] + a[j] + a[k] == 0) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

}

```

python code:
```

N = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            if a[i] + a[j] + a[k] == 0:
                ans += 1
print(ans)

```

## 03046

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p03046 {

    public static void main(String[] args) {
        // TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                for(int k = j + 1; k < N; k++) {
                    for(int l = k + 1; l < N; l++) {
                        if(a[i] + a[j] + a[k] + a[l] == 0) {
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

}

```

python code:
```

N = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            for l in range(k + 1, N):
                if a[i] + a[j] +
