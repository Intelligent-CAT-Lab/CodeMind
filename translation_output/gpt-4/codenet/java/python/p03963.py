Here is the equivalent Python code for the Java code you provided:

```python
def p03963():
    N = int(input())
    K = int(input())
    ans = K
    for i in range(2, N + 1):
        ans *= (K - 1)
    print(ans)

p03963()
```

With this Python code, it first defines a function called `p03963`. It reads two integers from input, N and K, just like the Java code. It calculates the `ans` value by starting with K and then iteratively multiplying by (K-1) for each additional number from 2 to N. Finally, it prints out the answer. Note that you need to run the function by calling `p03963()` at the end.
