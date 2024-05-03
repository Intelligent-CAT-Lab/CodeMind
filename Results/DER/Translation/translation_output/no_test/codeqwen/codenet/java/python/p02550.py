Here is the Python equivalent of the Java code:

```python
import sys

def main():
    N = int(sys.stdin.readline())
    X = int(sys.stdin.readline())
    M = int(sys.stdin.readline())
    used = set()
    A = [X]
    used.add(X)

    K = 0
    L = 0
    ans = 0
    breakflag = False

    for i in range(M-1, min(M-1, N-1)):
        prev = A[i]
        now = (prev*prev) % M
        if now == 0:
            for j in range(i+1):
                ans += A[j]
            breakflag = True
            break
        elif now in used:
            L = i+1
            for j in range(i+1):
                if A[j] == now:
                    K = j
                    break
                ans += A[j]

            sub = 0
            for j in range(int(K), L):
                sub += A[j]

            m = (N-K) % (L-K)
            left = 0
            for j in range(m):
                left += A[int(K) + j]

            ans += ((N-K)//(L-K))*sub + left
            breakflag = True
            break
        else:
            used.add(now)
            A.append(now)

    if not breakflag:
        ans = 0
        for a in A:
            ans += a

    print(ans)

if __name__ == "__main__":
    main()
```

Please note that Python uses 0-based indexing, so the range for the loop is slightly different. Also, Python uses `//` for integer division, which is equivalent to `/` in Java.
