Here is the Python equivalent of the provided Java code:

```python
def solve():
    one = list(map(int, input().split()))
    N = one[0]
    d = one[1]
    if N <= 2:
        print(0)
        return
    N -= 3
    loop = N // 11
    amari = N % 11
    map = [
        [1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5],
        [0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5],
        [1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5],
        [0, 0, 1, 1, 2, 3, 3, 4, 4, 4, 5],
        [1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5],
        [0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 5],
        [0, 1, 1, 2, 3, 3, 4, 4, 4, 5, 5],
        [1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5],
        [0, 1, 1, 1, 2, 2, 3, 4, 4, 5, 5],
        [1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 5],
        [0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5]
    ]
    print(loop * 5 + map[d][amari])

# Test input:
# 7 7
# Expected output:
# 2

if __name__ == "__main__":
    solve()
```

When you run this Python code, it expects you to provide an input similar to how the Java code does. You enter two integers separated by a space, press enter, and the code will output the result based on the logic from the Java code.
