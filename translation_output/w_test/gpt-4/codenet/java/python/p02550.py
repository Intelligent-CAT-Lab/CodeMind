Here is the equivalent Python code to perform the same operation as the Java code. The input and output handling in Python differs from Java, as Python does not have a direct equivalent of the `Scanner` class, but rather uses the built-in `input` function for standard input.

```python
def p02550(N, X, M):
    used = set()
    A = [X]
    used.add(X)

    K = 0
    L = 0
    ans = 0
    breakflag = False

    for i in range(min(M-1, N-1)):
        prev = A[i]
        now = (prev * prev) % M
        if now == 0:
            ans = sum(A[:i+1])
            breakflag = True
            break
        elif now in used:
            L = i + 1
            for j, a in enumerate(A):
                if a == now:
                    K = j
                    break
                ans += a

            sub = sum(A[K:L])

            m = (N - K) % (L - K)
            left = sum(A[K:K+m])

            ans += ((N - K) // (L - K)) * sub + left
            breakflag = True
            break
        else:
            used.add(now)
            A.append(now)

    if not breakflag:
        ans = sum(A)

    return ans

# Sample Test Case
N, X, M = map(int, input().split())
print(p02550(N, X, M))
```

To use the Python code with the provided test case, you would input the values `6 2 1001` to the program. To read values from standard input, you may call the function like this:

```python
N, X, M = map(int, input().split())
print(p02550(N, X, M))
```

When you input `6 2 1001`, the expected output, as with the Java code, will be `1369`.
