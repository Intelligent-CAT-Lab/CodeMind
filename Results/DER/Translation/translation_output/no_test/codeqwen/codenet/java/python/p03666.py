Here is the Python equivalent of the Java code:

```python
def solve():
    N = int(input())
    A = int(input())
    B = int(input())
    C = int(input())
    D = int(input())

    for i in range(N):
        max_val = D * (N - 1 - i) - C * i
        min_val = C * (N - 1 - i) - D * i
        if abs(B - A) >= min_val and abs(B - A) <= max_val:
            print("YES")
            return
    print("NO")

solve()
```

This Python code does the same thing as the Java code. It reads in five integers from the user, and then checks if the absolute difference between the second and first integers is within the range defined by the other four integers. If it is, it prints "YES" and returns; otherwise, it prints "NO" and returns.
