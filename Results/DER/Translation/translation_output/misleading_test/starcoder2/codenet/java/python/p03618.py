
```python
import sys

A = sys.stdin.readline().strip()
N = len(A)
cnt = [0] * 26
for i in range(N):
    cnt[ord(A[i]) - ord('a')] += 1

ans = N * (N + 1) // 2 + 1
for i in range(26):
    if cnt[i] > 0:
        ans -= cnt[i] * (cnt[i] + 1) // 2

print(ans)
```

## p03619

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.*;

public class p03619 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long ans = 0;
        while(N>0) {
            ans = ans*10+N%10;
            N /= 10;
        }
        
        System.out.println(ans);
        
        sc.close();
    }
}

```

python code:
```python
import sys

N = int(sys.stdin.readline().strip())
ans = 0
while N > 0:
    ans = ans * 10 + N % 10
    N //= 10

print(ans)
```

## p03620

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.*;

public class p03620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long ans = 0;
        while(N>0) {
            ans = ans*10+N%10;
            N /= 10;
        }
        
        System.out.println(ans);
        
        sc.close();
    }
}

```

python code:
```python
import sys

N = int(sys.stdin.readline().strip())
ans = 0
while N > 0:
    ans = ans * 10 + N % 10
    N //= 10

print(ans)
```
/p03601.py
import sys

N = int(sys.stdin.readline().strip())
A = list(map(int, sys.stdin.readline().strip().split()))

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] > A[j]:
            ans += 1

print(ans)
/p03602.py
import sys

N = int(sys.stdin.readline().strip())
A = list(map(int, sys.stdin.readline().strip().split()))

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] == A[j]:
            ans += 1

print(ans)
/p03603.py
import sys

N = int(sys.stdin.readline().strip())
A = list(map(int, sys.stdin.readline().strip().split()))

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] < A[j]:
            ans += 1

print(ans)


print(ans)
/p03604.py
import sys

N = int(sys.stdin.readline().strip())
A = list(map(int, sys.stdin.readline().strip().split()))

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] > A[j]:
            ans += 1/p03605.py
import sys

N = int(sys.stdin.readline().strip())
A = list(map(int, sys.stdin.readline().strip().split()))

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] < A[j]:
            ans += 1

print(ans)
/p03606.py
import sys

N = int(sys.stdin.readline().strip())
A = list(map(int, sys.stdin.readline().strip().split()))

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        if A[i] == A[j]:
            ans += 1

print(ans)
/p03618.py
import sys

A = sys.stdin.readline().strip()
N = len(A)
cnt = [0] * 26
for i in range(N):
    cnt[ord(A[i]) - ord('a')] += 1

ans = N * (N + 1) // 2 + 1
for i in range(26):
    if cnt[i] > 0:
        ans -= cnt[i] * (cnt[i] + 1) // 2

print(ans)
/p03619.py
import sys

N = int(sys.stdin.readline().strip())
ans = 0
while N > 0:
    ans = ans * 10 + N % 10
    N //= 10

print(ans)
/p03620.py
import sys

N = int(sys.stdin.readline().strip())

ans = 0
while N > 0:
    ans = ans * 10 + N % 10
    N //= 10

print(ans)
