
```python
base, K = map(int, input().split())
ans = 1
while base >= 1:
    low = 0
    high = base
    while high - low > 1:
        willNext = (low + high) // 2
        if willNext <= K * (base - willNext):
            low = willNext
        else:
            high = willNext
    next = low
    if next > 0:
        base = next
        ans += 1
    else:
        break
print(ans)
```

## 00390

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00390 {
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
                if (A[i] > A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] > A[j]:
            ans += 1
print(ans)
```

## 00391

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00391 {
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
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] == A[j]:
            ans += 1
print(ans)
```

## 00392

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00392 {
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
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] == A[j]:
            ans += 1
print(ans)
```

## 00393

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00393 {
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
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] == A[j]:
            ans += 1
print(ans)
```

## 00394

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00394 {
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
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] == A[j]:
            ans += 1
print(ans)
```

## 00395

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00395 {
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
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:
```python
N = int(input())
A = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] == A[j]:
            ans += 1
print(ans)
```

## 00396

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00396 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in
