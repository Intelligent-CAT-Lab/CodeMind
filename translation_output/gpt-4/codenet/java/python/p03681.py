Below is the translation of the Java code to Python. Please note that in Python there is no need for explicit functions for binary search, array concatenation, max/min, sorting, or filling arrays - these functionalities are built-in. Also, no need for the mod computation functions like `plus`, `sub`, `mul`, `div`, `pow` - Python's `%` operator and `pow` built-in function can be used directly for modular arithmetic. Moreover, IO handling in Python is simpler than in Java, so some of the code related to that is omitted. Instead, the input can be read directly using `input()`. Lastly, remember that Python list indexing starts at 0, unlike Java's array indexing that starts at 1.

```python
MOD = 10**9 + 7
dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]
dx8 = [-1, -1, -1, 0, 0, 1, 1, 1]
dy8 = [-1, 0, 1, -1, 1, -1, 0, 1]
inf = float('inf')
linf = 2**63 - 1  # equivalent to Long.MAX_VALUE / 3 in Java
dinf = float('inf')
eps = 1e-10
pi = 3.141592653589793

def solve(n, m):
    if n > m:
        n, m = m, n

    if m - n > 1:
        return 0

    ans = 1
    for i in range(n):
        ans = ans * (i+1) % MOD
    for i in range(m):
        ans = ans * (i+1) % MOD

    if m == n:
        ans = ans * 2 % MOD
    
    return ans

def main():
    n, m = map(int, input().split())
    print(solve(n, m))

if __name__ == "__main__":
    main()
```

This Python code covers the core logic of the program that does the same calculation of factorial and mod. However, it omits some utility functions that are not directly needed due to Python's features. If your application requires these utility functions for binary searching, sorting or other operations on arrays, you may need to implement them yourself or use built-in functions or libraries in Python like `bisect`, `sorted`, and `itertools`.
