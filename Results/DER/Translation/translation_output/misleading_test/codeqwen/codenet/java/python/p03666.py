Here is the Python equivalent of the Java code:

```python
def solve():
    N, A, B, C, D = map(int, input().split())
    for i in range(N):
        max_val = D * (N - 1 - i) - C * i
        min_val = C * (N - 1 - i) - D * i
        if abs(B - A) >= min_val and abs(B - A) <= max_val:
            print("YES")
            return
    print("NO")

solve()
```

This Python code does the same thing as the Java code. It reads the input from the user, splits it into integers, and then iterates over the range from 0 to N-1. For each iteration, it calculates the maximum and minimum values that can be obtained by subtracting C*i from D*(N-1-i) and vice versa, respectively. If the absolute difference between B and A is within the range [min_val, max_val], it prints "YES" and returns. If no such i is found, it prints "NO".
