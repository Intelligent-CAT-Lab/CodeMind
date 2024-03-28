
```python
A, B, K = map(int, input().split())
n = A - K
if A + B <= K:
    print(0, 0)
elif n < 0:
    print(0, A + B - K)
else:
    print(n, B)
```

## C - Next Prime

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000

Expected output:
1000000000003

```
import java.util.*;

class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long X = Long.parseLong(stdIn.next());
        long n = X;
        while (true) {
            boolean isPrime = true;
            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
```

python code:
```python
X = int(input())
n = X
while True:
    isPrime = True
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            isPrime = False
            break
    if isPrime:
        print(n)
        break
    n += 1
```

## D - Prediction and Restriction

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3 1000000000
1 2 3
1 2 3
1 2 3
1 2 3

Expected output:
1000000000

```
import java.util.*;

class atcoder_ABC149_D {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = Integer.parseInt(stdIn.next());
        int K = Integer.parseInt(stdIn.next());
        int R = Integer.parseInt(stdIn.next());
        int S = Integer.parseInt(stdIn.next());
        int P = Integer.parseInt(stdIn.next());
        String T = stdIn.next();
        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            if (T.charAt(i) == 'r') {
                score[i] = P;
            } else if (T.charAt(i) == 's') {
                score[i] = R;
            } else {
                score[i] = S;
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (i >= K && T.charAt(i) == T.charAt(i - K)) {
                score[i] = 0;
            }
            ans += score[i];
        }
        System.out.println(ans);
    }
}
```

python code:
```python
N, K, R, S, P = map(int, input().split())
T = input()
score = [0] * N
for i in range(N):
    if T[i] == 'r':
        score[i] = P
    elif T[i] == 's':
        score[i] = R
    else:
        score[i] = S
ans = 0
for i in range(N):
    if i >= K and T[i] == T[i - K]:
        score[i] = 0
    ans += score[i]
print(ans)
```
/atcoder/ABC148/README.md
# AtCoder Beginner Contest 148

## A - Round One

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1
2

Expected output:
3

```
import java.util.*;

class atcoder_ABC148_A {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A = Integer.parseInt(stdIn.next());
        int B = Integer.parseInt(stdIn.next());
        System.out.println(6 - A - B);
    }
}
```

python code:
```python
A = int(input())
B = int(input())
print(6 - A - B)
```

## B - Strings with the Same Length

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
abc
def

Expected output:
adbecf

```
import java.util.*;

class atcoder_ABC148_B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = Integer.parseInt(stdIn.next());
        String S = stdIn.next();
        String T = stdIn.next();
        for (int i = 0; i < N; i++) {
            System.out.print(S.charAt(i));
            System.out.print(T.charAt(i));
        }
    }
}
```

python code:
```python
N = int(input())
S = input()
T = input()
for i in range(N):
    print(S[i], T[i], sep='', end='')
```

## C - Snack

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
6

```
import java.util.*;

class atcoder_ABC148_C {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long A = Long.parseLong(stdIn.next());
        long B = Long.parseLong(stdIn.next());
        long ans = A * B;
        long n = Math.min(A, B);
        for (long i = 2; i * i <= n; i++) {
            if (A % i == 0 && B % i == 0) {
                ans /= i;
                ans *= i * i;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```python
A, B = map(int, input().split())
ans = A * B
n = min(A, B)
for i in range(2, int(n ** 0.5) + 1):
    if A % i == 0 and B % i == 0:
        ans //= i
        ans *= i * i
print(ans)
```

## D - Brick Break

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
0

```
import java.util.*;

class atcoder_ABC148_D {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = Integer.parseInt(stdIn.next());
        int[] A = new int[N];
        for (int i
