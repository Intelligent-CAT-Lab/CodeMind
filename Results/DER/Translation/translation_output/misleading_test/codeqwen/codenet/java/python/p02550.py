Here is the Python equivalent of the Java code:

```python
def main():
    N, X, M = map(int, input().split())
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
            ans += sum(A)
            breakflag = True
            break
        elif now in used:
            L = i+1
            for j in range(K, L):
                if A[j] == now:
                    K = j
                    break
                ans += A[j]

            sub = 0
            for j in range(K, L):
                sub += A[j]

            m = (N-K) % (L-K)
            left = 0
            for j in range(m):
                left += A[K + j]

            ans += ((N-K)//(L-K))*sub + left
            breakflag = True
            break
        else:
            used.add(now)
            A.append(now)

    if not breakflag:
        ans = sum(A)

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the input, calculates the result, and prints it. The main difference is that Python uses `map` to convert the input strings to integers, and `range` is used instead of `for(int i = 0 ; i < M-1 && i < N-1 ; i++)`. The rest of the code is the same.
